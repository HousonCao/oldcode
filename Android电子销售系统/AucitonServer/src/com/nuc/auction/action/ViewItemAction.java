package com.nuc.auction.action;

import java.util.*;

import com.nuc.auction.action.base.BaseAction;
import com.nuc.auction.business.*;
import com.nuc.auction.domain.*;
import com.nuc.auction.exception.AuctionException;
import com.nuc.auction.service.AuctionManager;
import com.opensymphony.xwork2.ActionContext;

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
public class ViewItemAction extends BaseAction {
	private int kindId;
	private String kind;
	private List<ItemBean> items;

	public String execute() throws Exception {
		if (kindId <= 0) {
			addActionError("������ѡ����Ч������");
			return ERROR;
		} else {
			setKind(mgr.getKind(kindId));
			setItems(mgr.getItemsByKind(kindId));
			return SUCCESS;
		}
	}

	// kindId��setter��getter����
	public void setKindId(int kindId) {
		this.kindId = kindId;
	}

	public int getKindId() {
		return this.kindId;
	}

	// kind��setter��getter����
	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getKind() {
		return this.kind;
	}

	// items��setter��getter����
	public void setItems(List<ItemBean> items) {
		this.items = items;
	}

	public List<ItemBean> getItems() {
		return this.items;
	}
}