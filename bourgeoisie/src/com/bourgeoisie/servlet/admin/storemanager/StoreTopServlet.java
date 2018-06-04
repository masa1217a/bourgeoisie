package com.bourgeoisie.servlet.admin.storemanager;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bourgeoisie.model.admin.storemanager.StoreTopBean;

/**
 * Servlet implementation class StoreTopServlet
 */
@WebServlet("/StoreTopServlet")
public class StoreTopServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");

		HttpSession session = request.getSession();

		//フォームの入力情報を取得
		Integer storeid = (Integer)session.getAttribute("storeid");

		storeid = 20000356;

		//StoreTopBeanに店舗idを渡す
		StoreTopBean stb = new StoreTopBean();
		stb.setStoreid(storeid);

		request.setAttribute("fileUrl", "storetop.jsp");

		//jspにフォワードする
		session.setAttribute("storename", stb.getStorename());
		session.setAttribute("storeid", stb.getStoreid());
		request.getRequestDispatcher("admin/storemanager/manager.jsp").forward(request, response);

	}

}
