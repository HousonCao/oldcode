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
@WebServlet(urlPatterns="/android/viewKind.jsp")
public class ViewKindServlet extends BaseServlet {
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		// ��ȡҵ���߼����
		AuctionManager auctionManager = (AuctionManager) getCtx()
				.getBean("mgr");
		// ��ȡϵͳ��������Ʒ����
		List<KindBean> kinds = auctionManager.getAllKind();
		// ��������Ʒ�����װ��JSONArray
		JSONArray jsonArr = new JSONArray(kinds);
		response.setContentType("text/html; charset=utf-8");
		// ��JSONArrayת����JSON�ַ�����������ͻ���
		response.getWriter().println(jsonArr.toString());
	}
}