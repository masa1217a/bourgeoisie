package com.bourgeoisie.servlet.user;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bourgeoisie.dto.Genre;
import com.bourgeoisie.model.StoreinfoSearchModel;
import com.bourgeoisie.servlet.user.login.BaseLoginedServlet;

/**
 * Servlet implementation class TopServlet
 */
@WebServlet("/user/top")
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

		StoreinfoSearchModel model = new StoreinfoSearchModel();

		List<Genre> genre_list = model.allGenre();


		request.setAttribute("genre_list", genre_list);

		//以下2文がTOPページと合体する呪文
		//"../user/top.jsp"の部分に遷移したいURLをかく！！
		request.setAttribute("fileUrl", "usertop.jsp");

		//jspにフォワードする
		request.getRequestDispatcher("User.jsp").forward(request, response);


		//request.getRequestDispatcher("/user/top.jsp").forward(request, response);

	}

}
