package com.bourgeoisie.servlet.admin.storemanager;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TopServlet
 */
@WebServlet("/admin/top")
public class TopServlet extends BaseLoginedServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public TopServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	@Override
	protected void doRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("/storemanager/top.jsp").forward(request, response);

	}

}
