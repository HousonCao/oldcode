package com.nuc.auction.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import java.io.*;

import org.json.*;

import com.nuc.auction.domain.Kind;
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
 @WebServlet(urlPatterns="/android/addKind.jsp")
public class AddKindServlet extends BaseServlet {
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.setCharacterEncoding("utf-8");
		// ��ȡ�������
		String name = request.getParameter("kindName");
		String desc = request.getParameter("kindDesc");
		// ��ȡϵͳҵ���߼����
		AuctionManager auctionManager = (AuctionManager) getCtx()
				.getBean("mgr");
		// ����ҵ���߼������ҵ�񷽷��������
		int kindId = auctionManager.addKind(new Kind(name, desc));
		response.setContentType("text/html; charset=utf-8");
		// ��ӳɹ�
		if (kindId > 0) {
			response.getWriter().println("��ϲ����������ӳɹ�!");
		} else {
			response.getWriter().println("�Բ����������ʧ��!");
		}
	}
}