package com.nuc.auction.action;

import java.util.*;

import com.nuc.auction.action.base.BaseActionInterface;
import com.nuc.auction.business.*;
import com.nuc.auction.domain.*;
import com.nuc.auction.exception.AuctionException;
import com.nuc.auction.service.AuctionManager;
import com.opensymphony.xwork2.*;

/**
 * Description: <br/>
 * ��վ: <a href="http://www.nuc.edu.cn/">�б���ѧ</a> <br/>
 * Copyright (C), 2015 FanYu <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author 2015 FanYu
 * @version 1.0
 */
public class ViewDetailAction extends BaseActionInterface {
	// ��װ�û��������������
	private int itemId;
	private ItemBean item;
	// ��װϵͳ������ʾ������
	private String errMsg;

	// �����û�����
	public String execute() throws Exception {
		if (itemId <= 0) {
			setErrMsg("��ѡ����ƷID����һ����Ч����ƷID��");
			return ERROR;
		} else {
			setItem(mgr.getItem(itemId));
			return SUCCESS;
		}
	}

	// itemId��setter��getter����
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getItemId() {
		return this.itemId;
	}

	// item��setter��getter����
	public void setItem(ItemBean item) {
		this.item = item;
	}

	public ItemBean getItem() {
		return this.item;
	}

	// errMsg��setter��getter����
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public String getErrMsg() {
		return this.errMsg;
	}
}