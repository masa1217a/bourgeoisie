package com.bourgeoisie.servlet.admin.storemanager;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/admin/loginStoreManager")
public class LoginServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("/admin/storemanager/login.jsp").forward(request, response);
	}

}
