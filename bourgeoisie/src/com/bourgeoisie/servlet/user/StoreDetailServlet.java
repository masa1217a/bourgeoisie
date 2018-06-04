package com.bourgeoisie.servlet.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bourgeoisie.dto.Storeinfo;
import com.bourgeoisie.model.StoreinfoSearchModel;

/**
 * Servlet implementation class StoreDetailServlet
 */
@WebServlet("/user/StoreDetailServlet")
public class StoreDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");

		//storeidをint型でゲットパラメーター
		//int storeid = Integer.parseInt(request.getParameter("storeid"));
		int storeid = Integer.parseInt( request.getParameter("storeid") );

		//インスタンスの生成
		StoreinfoSearchModel detailmodel = new StoreinfoSearchModel();

		//StoreinfoDAOのメソッドでreturnされた店舗情報を変数に代入
		Storeinfo detail_store = detailmodel.getStore(storeid);

		request.setAttribute("detail_store", detail_store);

		//		request.setAttribute("pagination", "123");

		//User.jspの変数"fileUrl"ににstoredetail.jspのアドレスを代入
		request.setAttribute("fileUrl", "storedetail.jsp");
		//User.jspへフォワード
		request.getRequestDispatcher("User.jsp").forward(request, response);
	}

}
