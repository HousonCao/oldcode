package com.nuc.auction.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import java.io.*;

import org.json.*;

import com.nuc.auction.domain.Bid;
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
 @WebServlet(urlPatterns="/android/addBid.jsp")
public class AddBidServlet extends BaseServlet {
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		// ��ȡuserId
		Integer userId = (Integer) request.getSession(true).getAttribute(
				"userId");
		request.setCharacterEncoding("utf-8");
		// ��ȡ�������
		String itemId = request.getParameter("itemId");
		String bidPrice = request.getParameter("bidPrice");
		// ��ȡҵ���߼����
		AuctionManager auctionManager = (AuctionManager) getCtx()
				.getBean("mgr");
		// ����ҵ�񷽷�����Ӿ���
		int bidId = auctionManager.addBid(Integer.parseInt(itemId), new Bid(
				Double.parseDouble(bidPrice)), userId);
		response.setContentType("text/html; charset=utf-8");
		// ���۳ɹ�
		if (bidId > 0) {
			response.getWriter().println("��ϲ�������۳ɹ�!");
		} else {
			response.getWriter().println("�Բ��𣬾���ʧ��!");
		}
	}
}