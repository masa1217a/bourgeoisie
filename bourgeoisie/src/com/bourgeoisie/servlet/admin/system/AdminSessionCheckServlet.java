package com.bourgeoisie.servlet.admin.system;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AdminSessionCheckServlet
 */
@WebServlet("/admin/system/AdminSessionCheckServlet")
public class AdminSessionCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminSessionCheckServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");

		HttpSession session = request.getSession();

		if(session.getAttribute("sys_id") == null) {

			RequestDispatcher rd = request.getRequestDispatcher("/AdminLogin.jsp");
			rd.forward(request, response);


		}else {
			RequestDispatcher rd = request.getRequestDispatcher("/AdminMypage.jsp");
			rd.forward(request, response);
		}

	}


}
