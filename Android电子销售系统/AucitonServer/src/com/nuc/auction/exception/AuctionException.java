package com.nuc.auction.exception;

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
public class AuctionException extends RuntimeException {
	// ����һ���޲����Ĺ�����
	public AuctionException() {
	}

	// ����һ����message�����Ĺ������
	public AuctionException(String message) {
		super(message);
	}
}
