package com.nuc.auction.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import java.io.*;

import org.json.*;

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
@WebServlet(urlPatterns="/android/login.jsp")
public class LoginServlet extends BaseServlet {
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		// ��ȡϵͳ��ҵ���߼����
		AuctionManager auctionManager = (AuctionManager) getCtx()
				.getBean("mgr");
		// ��֤�û���¼
		int userId = auctionManager.validLogin(user, pass);
		response.setContentType("text/html; charset=utf-8");
		// ��¼�ɹ�
		if (userId > 0) {
			request.getSession(true).setAttribute("userId", userId);
		}
		try {
			// ����֤��userId��װ��JSONObject
			JSONObject jsonObj = new JSONObject().put("userId", userId);
			// �����Ӧ
			response.getWriter().println(jsonObj.toString());
		} catch (JSONException ex) {
			ex.printStackTrace();
		}
	}
}