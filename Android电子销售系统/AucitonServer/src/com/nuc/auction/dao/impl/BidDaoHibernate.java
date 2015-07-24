package com.nuc.auction.dao.impl;

import java.util.*;

import com.nuc.auction.business.*;
import com.nuc.auction.dao.*;
import com.nuc.auction.domain.*;
import com.nuc.common.dao.impl.*;

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
public class BidDaoHibernate extends BaseDaoHibernate4<Bid> implements BidDao {
	/**
	 * �����û����Ҿ���
	 * 
	 * @param id
	 *            �û�id
	 * @return �û���Ӧ��ȫ��
	 * @return �û���Ӧ��ȫ������
	 */
	public List<Bid> findByUser(Integer userId) {
		return (List<Bid>) find("from Bid as bid where bid.bidUser.id=?0",
				userId);
	}

	/**
	 * ������Ʒid���Լ����۲�ѯ�û�
	 * 
	 * @param itemId
	 *            ��Ʒid;
	 * @param price
	 *            ���۵ļ۸�
	 * @return ��ָ����Ʒ��ָ�����۶�Ӧ���û�
	 */
	public AuctionUser findUserByItemAndPrice(Integer itemId, Double price) {
		// ִ��HQL��ѯ
		List<Bid> l = (List<Bid>) find(
				"from Bid as bid where bid.bidItem.id=?0 and bid.bidPrice=?1",
				new Object[] { itemId, price });
		// ���ز�ѯ�õ��ĵ�һ��Bid���������AuctionUser����
		if (l.size() >= 1) {
			Bid b = (Bid) l.get(0);
			return b.getBidUser();
		}
		return null;
	}
}
