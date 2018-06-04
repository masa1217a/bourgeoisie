package com.bourgeoisie.servlet.user;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bourgeoisie.dto.Genre;
import com.bourgeoisie.dto.Storeinfo;
import com.bourgeoisie.model.StoreinfoSearchModel;

/**
 * Servlet implementation class KensakuServle
 */
@WebServlet("/user/search")
public class SearchServle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");

		String keyword = request.getParameter("keyword");
		int genreno = Integer.parseInt(request.getParameter("genreno"))  ;

		StoreinfoSearchModel model = new StoreinfoSearchModel();


		//検索を行い一致した店舗があった場合検索結果を
		//一致しなかった場合、検索画面に戻す
		List<Storeinfo> store_list = model.search(keyword, genreno);
		List<Genre> genre_list = model.allGenre();


		System.out.println("store_list:"+store_list.size());

		request.setAttribute("keyword", keyword);
		request.setAttribute("store_list", store_list);

		request.setAttribute("genreno", genreno);
		request.setAttribute("genre_list", genre_list);

		request.setAttribute("pagination", "123");
		
		request.setAttribute("fileUrl", "storesearch.jsp");
		request.getRequestDispatcher("/user/User.jsp").forward(request, response);
	}
}
