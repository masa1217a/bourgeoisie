package com.bourgeoisie.servlet.user;


import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bourgeoisie.dao.EvaluationDao;
import com.bourgeoisie.dto.Review;
import com.bourgeoisie.model.ContributionModel;


/**
 * Servlet implementation class ContributionServlet
 */
@WebServlet("/user/ContributionServlet")
public class ContributionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");

		ContributionModel model = new ContributionModel();

		String titel = request.getParameter("titel");
		int rating = Integer.parseInt(request.getParameter("rating"));
		String comment = request.getParameter("comment");
//		String userid = request.getParameter(model.getStoreid(12));
//		String userid = model.getUserid(userid);
//		Storeinfo storeid = model.getStoreid(storeid);;

		List<Review> review_list = model.allReview();

		Review rev = new Review();
		rev.setTitle(titel);
		rev.setRating(rating);
		rev.setComment(comment);
/*
		User use = new User();
		use.setUserid(userid);

		Storeinfo store = new Storeinfo();
		store.setStoreid(storeid);
*/
		//検索を行い一致した店舗があった場合検索結果を
		//一致しなかった場合、検索画面に戻す

		int result = EvaluationDao.entryEvaluation(rev);

/*
		request.setAttribute("titel", rev);
		request.setAttribute("raring", rev);
		request.setAttribute("comment", rev);
*/

		request.setAttribute("review_list", review_list);

		RequestDispatcher rd = request.getRequestDispatcher("/user/ConView.jsp");
		rd.forward(request, response);
	}

}
