package com.nuc.auction.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import java.io.*;
import java.util.*;

import org.json.*;

import com.nuc.auction.business.*;
import com.nuc.auction.service.AuctionManager;
import com.nuc.auction.servlet.base.BaseServlet;

/**
 * Description: <br/>
 * ��վ: <a href="http://www.nuc.edu.cn/">�б���ѧ</a> <br/>
 * Copyright (C), 2001-2014, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author 2015 FanYu
 * @version 1.0
 */
 @WebServlet(urlPatterns="/android/viewOwnerItem.jsp")
public class ViewOwnerItemServlet extends BaseServlet {
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		// ��ȡuserId
		Integer userId = (Integer) request.getSession(true).getAttribute(
				"userId");
		// ��ȡҵ���߼����
		AuctionManager auctionManager = (AuctionManager) getCtx()
				.getBean("mgr");
		// ��ȡ���û���ǰ���������е�������Ʒ
		List<ItemBean> items = auctionManager.getItemsByOwner(userId);
		// ����ѯ�õ�����Ʒ��װ��JSONArray����
		JSONArray jsonArr = new JSONArray(items);
		response.setContentType("text/html; charset=utf-8");
		response.getWriter().println(jsonArr.toString());
	}
}