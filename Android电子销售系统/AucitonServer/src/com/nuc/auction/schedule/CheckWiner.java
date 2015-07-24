package com.nuc.auction.schedule;

import java.util.TimerTask;

import com.nuc.auction.exception.AuctionException;
import com.nuc.auction.service.AuctionManager;

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
public class CheckWiner extends TimerTask {
	// ������������ҵ���߼����
	private AuctionManager mgr;

	// ����ע��ҵ���߼���������setter����
	public void setMgr(AuctionManager mgr) {
		this.mgr = mgr;
	}

	// �������ִ����
	public void run() {
		try {
			mgr.updateWiner();
		} catch (AuctionException ae) {
			ae.printStackTrace();
		}
	}
}
