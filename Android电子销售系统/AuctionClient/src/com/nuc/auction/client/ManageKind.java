package com.nuc.auction.client;

import org.crazyit.auction.client.R;
import org.json.JSONArray;

import com.nuc.auction.client.util.DialogUtil;
import com.nuc.auction.client.util.HttpUtil;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;

/**
 * Description:
 * <br/>site: <a href="http://www.nuc.edu.cn/">nuc.edu.cn</a> 
 * <br/>Copyright (C), 2015 FanYu
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * 
 * @version  1.0
 */
public class ManageKind extends Activity
{
	Button bnHome , bnAdd;
	ListView kindList;
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.manage_kind);
		// ��ȡ���沼���ϵ�������ť
		bnHome = (Button) findViewById(R.id.bn_home);
		bnAdd = (Button) findViewById(R.id.bnAdd);
		kindList = (ListView) findViewById(R.id.kindList);
		// Ϊ���ذ�ť�ĵ����¼����¼�������
		bnHome.setOnClickListener(new FinishListener(this));
		bnAdd.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View source)
			{
				// ����AddKind Activity��
				Intent intent = new Intent(ManageKind.this
					, AddKind.class);
				startActivity(intent);
			}
		});
		// ���巢�������URL
		String url = HttpUtil.BASE_URL + "viewKind.jsp";
		try
		{
			// ��ָ��URL�������󣬲�����Ӧ��װ��JSONArray����
			final JSONArray jsonArray = new JSONArray(
				HttpUtil.getRequest(url));
			// ��JSONArray�����װ��Adapter
			kindList.setAdapter(new KindArrayAdapter(jsonArray
				, ManageKind.this));
		}
		catch (Exception e)
		{
			DialogUtil.showDialog(this , "��������Ӧ�쳣�����Ժ����ԣ�" ,false);
			e.printStackTrace();
		}
	}
}