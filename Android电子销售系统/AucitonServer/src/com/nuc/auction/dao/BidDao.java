package com.nuc.auction.dao;

import java.util.List;

import com.nuc.auction.business.*;
import com.nuc.auction.domain.*;
import com.nuc.common.dao.*;

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
public interface BidDao extends BaseDao<Bid> {
	/**
	 * �����û����Ҿ���
	 * 
	 * @param id
	 *            �û�id
	 * @return �û���Ӧ��ȫ��
	 * @return �û���Ӧ��ȫ������
	 */
	List<Bid> findByUser(Integer userId);

	/**
	 * ������Ʒid���Լ����۲�ѯ�û�
	 * 
	 * @param itemId
	 *            ��Ʒid;
	 * @param price
	 *            ���۵ļ۸�
	 * @return ��ָ����Ʒ��ָ�����۶�Ӧ���û�
	 */
	AuctionUser findUserByItemAndPrice(Integer itemId, Double price);
}
