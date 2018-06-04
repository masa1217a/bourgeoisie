
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.NewRecordBeans;

/**
 * Servlet implementation class MyFirstServlet
 */
@WebServlet("/NewRecordServlet")
public class NewRecordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	//public MyFirstServlet() {
	//super();
	// TODO Auto-generated constructor stub
	//}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {//requestが入力のオブジェクト、responseが出力

		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {//requestが入力のオブジェクト、responseが出力

		//System.out.println(message); //コンソールに出力、ブラウザには出力されない
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");

		String ID = request.getParameter("ID");
		String password = request.getParameter("password");
		String mail = request.getParameter("mail");



		NewRecordBeans user = new NewRecordBeans();
		user.setID(ID);
		user.setPassword(password);
		user.setMail(mail);

		System.out.println("*1: " + user);

		request.setAttribute("user", user);//第一引数文字列(任意の変数)、第二がデータ
		RequestDispatcher rd = request.getRequestDispatcher("/UserKakunin.jsp");//rdは値を送るための
		rd.forward(request, response);

	}

}
