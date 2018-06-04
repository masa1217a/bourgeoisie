package com.bourgeoisie.servlet.user.newRecode;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bourgeoisie.dto.User;
import com.bourgeoisie.model.user.UserCtrl;

/**
 * Servlet implementation class Userregister
 */
@WebServlet("/user/recode_checker")
public class Userregister extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");

		String id = request.getParameter("uid");
		String password1 = request.getParameter("password1");
		String password2 = request.getParameter("password2");
		String mail1 = request.getParameter("mail1");
		String mail2 = request.getParameter("mail2");

		UserCtrl uc = new UserCtrl();
		uc.setPassword1(password1);
		uc.setPassword2(password2);
		uc.setMail1(mail1);
		uc.setMail2(mail2);

		if (uc.RefrectUserentry() == true) {
			User user = new User();
			user.setUserid(id);
			user.setPassword(password1);
			//user.setName(name);
			user.setMailadress(mail1);
			try {
				if (uc.update(user) == 1) {
					request.setAttribute("fileUrl", "usertop.jsp");
					request.getRequestDispatcher("./User.jsp").forward(request, response);
				}
			} catch (SQLException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}

	}
}
