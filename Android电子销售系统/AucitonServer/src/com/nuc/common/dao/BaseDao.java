package com.nuc.common.dao;

import java.util.List;
import java.io.Serializable;

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
public interface BaseDao<T> {
	// ����ID����ʵ��
	T get(Class<T> entityClazz, Serializable id);

	// ����ʵ��
	Serializable save(T entity);

	// ����ʵ��
	void update(T entity);

	// ɾ��ʵ��
	void delete(T entity);

	// ����IDɾ��ʵ��
	void delete(Class<T> entityClazz, Serializable id);

	// ��ȡ����ʵ��
	List<T> findAll(Class<T> entityClazz);

	// ��ȡʵ������
	long findCount(Class<T> entityClazz);
}
