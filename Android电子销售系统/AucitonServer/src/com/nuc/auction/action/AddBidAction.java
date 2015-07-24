package com.nuc.auction.action;

import java.util.*;

import com.nuc.auction.action.base.BaseAction;
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
public class AddBidAction extends BaseAction {
	// ��װ�������������
	private int itemId;
	private Bid bid;
	private double maxPrice;
	private String vercode;

	// ��дvalidate��������Զ�������У��
	@Override
	public void validate() {
		// �û����۱��������Ʒ�ĵ�ǰ��߼�
		if (bid.getBidPrice() <= maxPrice) {
			addFieldError("bid.bidPrice", "������ľ��۱�����ڵ�ǰ��߼ۣ�");
		}
	}

	// �����û�����
	public String execute() throws Exception {
		Map session = ActionContext.getContext().getSession();
		// ȡ��Session�е�userId�͸ո����ɵ������֤��
		Integer userId = (Integer) session.get("userId");
		String ver2 = (String) session.get("rand");
		session.put("rand", null);
		// ����û��������֤���Session�е������֤����ͬ
		if (vercode.equals(ver2)) {
			mgr.addBid(itemId, bid, userId);
			return SUCCESS;
		} else {
			addActionError("��֤�벻ƥ��,����������");
			return INPUT;
		}
	}

	// itemId��setter��getter����
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getItemId() {
		return this.itemId;
	}

	// bid��setter��getter����
	public void setBid(Bid bid) {
		this.bid = bid;
	}

	public Bid getBid() {
		return this.bid;
	}

	// maxPrice��setter��getter����
	public void setMaxPrice(double maxPrice) {
		this.maxPrice = maxPrice;
	}

	public double getMaxPrice() {
		return this.maxPrice;
	}

	// vercode��setter��getter����
	public void setVercode(String vercode) {
		this.vercode = vercode;
	}

	public String getVercode() {
		return this.vercode;
	}
}