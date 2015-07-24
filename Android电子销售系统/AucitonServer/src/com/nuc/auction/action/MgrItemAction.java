package com.nuc.auction.action;

import java.util.*;

import com.nuc.auction.action.base.BaseActionInterface;
import com.nuc.auction.business.*;
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
public class MgrItemAction extends BaseActionInterface {
	private List<ItemBean> items;
	private List<KindBean> kinds;

	public String execute() throws Exception {
		Map session = ActionContext.getContext().getSession();
		Integer userId = (Integer) session.get("userId");
		setItems(mgr.getItemsByOwner(userId));
		setKinds(mgr.getAllKind());
		return SUCCESS;
	}

	// items��setter��getter����
	public void setItems(List<ItemBean> items) {
		this.items = items;
	}

	public List<ItemBean> getItems() {
		return this.items;
	}

	// kinds��setter��getter����
	public void setKinds(List<KindBean> kinds) {
		this.kinds = kinds;
	}

	public List<KindBean> getKinds() {
		return this.kinds;
	}
}