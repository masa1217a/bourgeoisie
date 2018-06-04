package com.bourgeoisie.servlet.admin.storemanager;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bourgeoisie.dto.Storeinfo;
import com.bourgeoisie.model.StoreinfoSearchModel;

/**
 * Servlet implementation class UpdateCompleteServlet
 */
@WebServlet("/UpdateCompleteServlet")
public class UpdateCompleteServlet extends HttpServlet {
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
		String storename = request.getParameter("storename");
		String storeinfomation = request.getParameter("storeinfomation");
		int genreno = Integer.parseInt(request.getParameter("genreno"));
		int cost = Integer.parseInt(request.getParameter("cost"));
		String address = request.getParameter("address");
		int phoneno = Integer.parseInt(request.getParameter("phoneno"));
		String open = request.getParameter("open");
		String url = request.getParameter("url");
		String mailaddress = request.getParameter("mailaddress");
		String operatingcompany = request.getParameter("operatingcompany");
		String representative = request.getParameter("representative");
		String storemanager = request.getParameter("storemanager");

		//インスタンスの生成
		StoreinfoSearchModel detailmodel = new StoreinfoSearchModel();

		//StoreinfoDAOのメソッドでreturnされた店舗情報を変数に代入
		//Storeinfo detail_store = detailmodel.getStore(storeid);

		Storeinfo detail_store = new Storeinfo();
		detail_store.setStoreid(storeid);
		detail_store.setStorename(storename);
		detail_store.setGenreno(genreno);
		detail_store.setCost(cost);
		detail_store.setAddress(address);
		detail_store.setPhoneno(phoneno);
		detail_store.setOpen(open);
		detail_store.setUrl(url);
		detail_store.setMailaddress(mailaddress);
		detail_store.setOperatingcompany(operatingcompany);
		detail_store.setRepresentative(representative);
		detail_store.setStoremanager(storemanager);


		detailmodel.updateStore(detail_store);



		request.setAttribute("detail_store", detail_store);

		//		request.setAttribute("pagination", "123");

		//manager.jspの変数"fileUrl"ににstoredetail.jspのアドレスを代入
		request.setAttribute("fileUrl", "UpdateComplete.jsp");

		//manager.jspへフォワード
		request.getRequestDispatcher("admin/storemanager/manager.jsp").forward(request, response);
	}
}