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
public class AddItemAction extends BaseAction {
	private Item item;
	private int avail;
	private int kindId;
	private String vercode;

	// �����û������execute����
	public String execute() throws Exception {
		Map session = ActionContext.getContext().getSession();
		String ver2 = (String) session.get("rand");
		// ǿ��ϵͳ�����ɵ������֤��ʧЧ
		session.put("rand", null);
		Integer userId = (Integer) session.get("userId");
		// ����û��������֤����ϵͳ�����������֤����ͬ
		if (vercode.equals(ver2)) {
			// �����û�ѡ����Чʱ��ѡ�ָ��ʵ�ʵ���Чʱ��
			switch (avail) {
			case 6:
				avail = 7;
				break;
			case 7:
				avail = 30;
				break;
			case 8:
				avail = 365;
				break;
			}
			// �����Ʒ
			mgr.addItem(item, avail, kindId, userId);
			return SUCCESS;
		} else {
			addActionError("��֤�벻ƥ��,����������");
			return INPUT;
		}
	}

	// item��setter��getter����
	public void setItem(Item item) {
		this.item = item;
	}

	public Item getItem() {
		return this.item;
	}

	// avail��setter��getter����
	public void setAvail(int avail) {
		this.avail = avail;
	}

	public int getAvail() {
		return this.avail;
	}

	// kindId��setter��getter����
	public void setKindId(int kindId) {
		this.kindId = kindId;
	}

	public int getKindId() {
		return this.kindId;
	}

	// vercode��setter��getter����
	public void setVercode(String vercode) {
		this.vercode = vercode;
	}

	public String getVercode() {
		return this.vercode;
	}
}