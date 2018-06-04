package com.bourgeoisie.servlet.user.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bourgeoisie.servlet.user.BaseServlet;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/user/login")
public class LoginServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//以下2文がTOPページと合体する呪文
		//"../user/top.jsp"の部分に遷移したいURLをかく！！

		if (request.getSession().getAttribute("user") == null) {
			request.setAttribute("fileUrl", "login.jsp");
		} else {
			request.setAttribute("fileUrl", "usertop.jsp");
		}

		//jspにフォワードする
		request.getRequestDispatcher("User.jsp").forward(request, response);
	}

}
