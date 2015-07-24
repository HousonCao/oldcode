/**
 * 
 */
package com.nuc.auction.client;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;

/**
 * Description:
 * <br/>��վ: <a href="http://www.nuc.edu.cn/">���Java����</a> 
 * <br/>Copyright (C), 2015 FanYu
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * 
 * @version  1.0
 */
// ����һ��������ǰActivity��
public class FinishListener implements OnClickListener
{
	private Activity activity;
	public FinishListener(Activity activity)
	{
		this.activity = activity;
	}
	@Override
	public void onClick(View source)
	{
		// ������ǰActivity
		activity.finish();
	}
}
