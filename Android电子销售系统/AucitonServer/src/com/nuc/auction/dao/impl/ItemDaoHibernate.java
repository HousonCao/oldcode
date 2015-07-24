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
public class ItemDaoHibernate extends BaseDaoHibernate4<Item> implements
		ItemDao {
	/**
	 * ���ݲ�Ʒ���࣬��ȡ��ǰ������ȫ����Ʒ
	 * 
	 * @param kindId
	 *            ����id;
	 * @return �����ȫ����Ʒ
	 */
	public List<Item> findItemByKind(Integer kindId) {
		return find("from Item as i where i.kind.id=?0 and i.itemState.id=1",
				kindId);
	}

	/**
	 * ���������߲��Ҵ��������е���Ʒ
	 * 
	 * @param useId
	 *            ������Id;
	 * @return ָ���û����������е�ȫ����Ʒ
	 */
	public List<Item> findItemByOwner(Integer userId) {
		return (List<Item>) find(
				"from Item as i where i.owner.id=?0 and i.itemState.id=1",
				userId);
	}

	/**
	 * ����Ӯȡ�߲�����Ʒ
	 * 
	 * @param userId
	 *            Ӯȡ��Id;
	 * @return ָ���û�Ӯȡ��ȫ����Ʒ
	 */
	public List<Item> findItemByWiner(Integer userId) {
		return find("from Item as i where i.winer.id =?0 and i.itemState.id=2",
				userId);
	}

	/**
	 * ������Ʒ״̬������Ʒ
	 * 
	 * @param stateId
	 *            ״̬Id;
	 * @return ��״̬�µ�ȫ����Ʒ
	 */
	public List<Item> findItemByState(Integer stateId) {
		return find("from Item as i where i.itemState.id = ?0", stateId);
	}
}