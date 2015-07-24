package com.nuc.auction.business;

import java.io.Serializable;
import java.util.Date;

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
public class BidBean implements Serializable {
	private int id;
	private String user;
	private String item;
	private double price;
	private Date bidDate;

	// �޲����Ĺ�����
	public BidBean() {
	}

	// ��ʼ��ȫ�����ԵĹ�����
	public BidBean(int id, String user, String item, double price, Date bidDate) {
		this.id = id;
		this.user = user;
		this.item = item;
		this.price = price;
		this.bidDate = bidDate;
	}

	// id���Ե�setter��getter����
	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	// user���Ե�setter��getter����
	public void setUser(String user) {
		this.user = user;
	}

	public String getUser() {
		return this.user;
	}

	// item���Ե�setter��getter����
	public void setItem(String item) {
		this.item = item;
	}

	public String getItem() {
		return this.item;
	}

	// price���Ե�setter��getter����
	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return this.price;
	}

	// bidDate���Ե�setter��getter����
	public void setBidDate(Date bidDate) {
		this.bidDate = bidDate;
	}

	public Date getBidDate() {
		return this.bidDate;
	}
}