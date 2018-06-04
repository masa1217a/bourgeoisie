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
 * Servlet implementation class UpdateStoreServlet
 */
@WebServlet("/UpdateStoreServlet")
public class UpdateStoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");

		//storeidをint型でゲットパラメーター
		//int storeid = Integer.parseInt(request.getParameter("storeid"));
		int storeid = 20000356;

		//インスタンスの生成
		StoreinfoSearchModel detailmodel = new StoreinfoSearchModel();

		//StoreinfoDAOのメソッドでreturnされた店舗情報を変数に代入
		Storeinfo detail_store = detailmodel.getStore(storeid);

		System.out.println("genre:"+request.getParameter("genreno"));
		System.out.println("phoneno"+request.getParameter("phoneno"));

		/*フォームから入力された内容
		//String storename = request.getParameter("storename");
		//String storeinfomation = request.getParameter("storeinfomation");
		//int genreno = Integer.parseInt(request.getParameter("genreno"));
		//String cost = request.getParameter("cost");
		String address = request.getParameter("address");
		int phoneno = Integer.parseInt(request.getParameter("phoneno"));
		String open = request.getParameter("open");
		String url = request.getParameter("url");
		String mailaddress = request.getParameter("mailaddress");
		String operatingconpany = request.getParameter("operatingconpany");
		String representative = request.getParameter("representative");
		String storemanager = request.getParameter("storemanager");
		 */

/*
		Storeinfo storeinfo = new Storeinfo();

		storeinfo.setStorename(storename);
		storeinfo.setStoreinfomation(storeinfomation);
		storeinfo.setGenreno(genreno);
		storeinfo.setCost(cost);
		storeinfo.setAddress(address);
		storeinfo.setPhoneno(phoneno);
		storeinfo.setOpen(open);
		storeinfo.setUrl(url);
		storeinfo.setStorename(storename);
*/
		request.setAttribute("detail_store", detail_store);

		//manager.jspの変数"fileUrl"にstoredetail.jspのアドレスを代入
		request.setAttribute("fileUrl", "UpdateStore.jsp");

		//manager.jspへフォワード
		request.getRequestDispatcher("admin/storemanager/manager.jsp").forward(request, response);
	}

}
