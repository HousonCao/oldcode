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
public interface ItemDao extends BaseDao<Item> {
	/**
	 * ���ݲ�Ʒ���࣬��ȡ��ǰ������ȫ����Ʒ
	 * 
	 * @param kindId
	 *            ����id;
	 * @return �����ȫ����Ʒ
	 */
	List<Item> findItemByKind(Integer kindId);

	/**
	 * ���������߲��Ҵ��������е���Ʒ
	 * 
	 * @param useId
	 *            ������Id;
	 * @return ָ���û����������е�ȫ����Ʒ
	 */
	List<Item> findItemByOwner(Integer userId);

	/**
	 * ����Ӯȡ�߲�����Ʒ
	 * 
	 * @param userId
	 *            Ӯȡ��Id;
	 * @return ָ���û�Ӯȡ��ȫ����Ʒ
	 */
	List<Item> findItemByWiner(Integer userId);

	/**
	 * ������Ʒ״̬������Ʒ
	 * 
	 * @param stateId
	 *            ״̬Id;
	 * @return ��״̬�µ�ȫ����Ʒ
	 */
	List<Item> findItemByState(Integer stateId);
}