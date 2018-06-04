package com.bourgeoisie.servlet.user.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bourgeoisie.model.LoginManage;
import com.bourgeoisie.servlet.user.BaseServlet;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/user/login_check")
public class LoginCheckServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		LoginManage lm = new LoginManage(request.getSession());

		if (lm.doLogin(request.getParameter("uid"), request.getParameter("upassword")) == true) {
			response.sendRedirect("./top");
			return;
		}
		session.setAttribute("error_login", "IDまたはパスワードが違います");
		response.sendRedirect("./login");
	}

}
