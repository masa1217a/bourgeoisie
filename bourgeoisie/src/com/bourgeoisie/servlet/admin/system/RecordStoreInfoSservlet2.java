package com.bourgeoisie.servlet.admin.system;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bourgeoisie.dto.Storemanager;
import com.bourgeoisie.model.admin.system.RecordStoreCtrl;

@WebServlet("/admin/system/RecordStoreInfoServlet2")
public class RecordStoreInfoSservlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");


		if (!validateAndInsert(request)){
			response.sendRedirect("admin/system//RecordStoreInfoServlet");
			return;
		}

		request.getRequestDispatcher("admin/system/complete.jsp").forward(request, response);
	}



	private boolean validateAndInsert(HttpServletRequest request) {
		HttpSession session =  request.getSession();
		session.removeAttribute("error_message");

		int managerid = Integer.parseInt(request.getParameter("storemanagerid"));
		String managerpw = request.getParameter("password");

		Storemanager manager = new Storemanager();
		manager.setStoremanageid(managerid);
		manager.setPassword(managerpw);


		RecordStoreCtrl rsc = new RecordStoreCtrl();
		ArrayList<String> error_message = rsc.reflectRecordInfo(manager);

		if (error_message.size()!=0){
			session.setAttribute("error_message", error_message);
			session.setAttribute("manager", manager);
			return false;
		}
		//session.setAttribute("manager", manager);

		return rsc.insert(manager);
	}
}
