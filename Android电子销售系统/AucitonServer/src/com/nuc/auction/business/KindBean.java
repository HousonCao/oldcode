package com.nuc.auction.business;

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
public class KindBean {
	private int id;
	private String kindName;
	private String kindDesc;

	// �޲����Ĺ�����
	public KindBean() {
	}

	// ��ʼ��ȫ�����ԵĹ�����
	public KindBean(int id, String kindName, String kindDesc) {
		this.id = id;
		this.kindName = kindName;
		this.kindDesc = kindDesc;
	}

	// id��setter��getter����
	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	// kindName��setter��getter����
	public void setKindName(String kindName) {
		this.kindName = kindName;
	}

	public String getKindName() {
		return this.kindName;
	}

	// kindDesc��setter��getter����
	public void setKindDesc(String kindDesc) {
		this.kindDesc = kindDesc;
	}

	public String getKindDesc() {
		return this.kindDesc;
	}
}