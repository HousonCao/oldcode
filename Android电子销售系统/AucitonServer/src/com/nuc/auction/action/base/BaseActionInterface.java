package com.nuc.auction.action.base;

import com.nuc.auction.service.AuctionManager;
import com.opensymphony.xwork2.Action;

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
public class BaseActionInterface implements Action {
	protected AuctionManager mgr;

	public void setMgr(AuctionManager mgr) {
		this.mgr = mgr;
	}

	public String execute() throws Exception {
		return SUCCESS;
	}
}