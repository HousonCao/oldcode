package com.nuc.auction.domain;

import java.util.*;

import javax.persistence.*;

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
@Entity
@Table(name = "state")
public class State {
	// ��ʶ����
	@Id
	@Column(name = "state_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	// ��Ʒ��״̬��
	@Column(name = "state_name")
	private String stateName;
	// ��״̬�µ�������Ʒ
	@OneToMany(targetEntity = Item.class, mappedBy = "itemState")
	private Set<Item> items = new HashSet<Item>();

	// �޲����Ĺ�����
	public State() {
	}

	// ��ʼ��ȫ���������ԵĹ�����
	public State(Integer id, String stateName) {
		this.id = id;
		this.stateName = stateName;
	}

	// id��setter��getter����
	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return this.id;
	}

	// stateName��setter��getter����
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getStateName() {
		return this.stateName;
	}

	// items��setter��getter����
	public void setItems(Set<Item> items) {
		this.items = items;
	}

	public Set<Item> getItems() {
		return this.items;
	}
}