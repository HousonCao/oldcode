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
public class AuctionUserDaoHibernate extends BaseDaoHibernate4<AuctionUser>
		implements AuctionUserDao {

	/**
	 * �����û�������������û�
	 * 
	 * @param username
	 *            ��ѯ������û���
	 * @param pass
	 *            ��ѯ���������
	 * @return ָ���û����������Ӧ���û�
	 */
	public AuctionUser findUserByNameAndPass(String username, String pass) {
		// ִ��HQL��ѯ
		List<AuctionUser> ul = (List<AuctionUser>) find(
				"from AuctionUser au where au.username=?0 and au.userpass=?1",
				username, pass);
		// ���ز�ѯ�õ��ĵ�һ��AuctionUser����
		if (ul.size() == 1) {
			return (AuctionUser) ul.get(0);
		}
		return null;
	}
}