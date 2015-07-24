package com.nuc.auction.action;

import java.util.*;

import com.nuc.auction.action.base.BaseAction;
import com.nuc.auction.business.*;
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
public class ViewBidAction extends BaseAction {
	private List<BidBean> bids;

	public String execute() throws Exception {
		Map session = ActionContext.getContext().getSession();
		Integer userId = (Integer) session.get("userId");
		setBids(mgr.getBidByUser(userId));
		return SUCCESS;
	}

	// bids��setter��getter����
	public void setBids(List<BidBean> bids) {
		this.bids = bids;
	}

	public List<BidBean> getBids() {
		return this.bids;
	}
}