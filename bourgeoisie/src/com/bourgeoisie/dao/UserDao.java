package com.bourgeoisie.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bourgeoisie.dto.User;


/**
 * 検索を行うクラス
 * @author ilearning
 */
public class UserDao {
	// データベースの情報
	private static final String DB_URL = "jdbc:postgresql://localhost:5432/sn_tr"; // URL
	private static final String DB_USER = "postgres"; // ユーザー名
	private static final String PASSWORD = "password"; // パスワード

	private static final String JDBC_DRIVER = "org.postgresql.Driver";

	static {
		try {
			Class.forName(JDBC_DRIVER);
		}catch(ClassNotFoundException e) {
			System.err.println("ドライバのロードに失敗しました");
			e.printStackTrace();
		}
	}


	/**
	*	Storemanagerに値をセット
	 * @throws SQLException
	*/
	private static User setUser(ResultSet rs) throws SQLException{

		User user = new User();
		user.setUserid(rs.getString("userid"));
		user.setPassword(rs.getString("password"));
		user.setName(rs.getString("name"));
		user.setMailadress(rs.getString("mailaddress"));
		user.setStatus(rs.getInt("status"));
		return user;
	}

	/**
	 *	storemanagerテーブルの全件を検索し返す
	 * @return storemanagerリスト
	 */
	public static List<User> getAlluser() {
		// Bookリスト
		List<User> list = new ArrayList<>();
		// SQL文
		final String SQL = "select * from sn_user order by name";

		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, PASSWORD);
				PreparedStatement pstmt = con.prepareStatement(SQL)) {

			// 実行結果をセット
			ResultSet rs = pstmt.executeQuery();
			// リストにBookを追加する
			while (rs.next()) {
				//インスタンスの生成
				User user = setUser(rs);
				list.add(user);  // リストに追加
			}
		} catch (SQLException e) {
			System.err.println("SQL:" + SQL);
			e.printStackTrace();
		}
		return list;
	}

	/**
	 * 書籍番号をもとに1件返す
	 * @param keyword 検索したい番号(int)
	 * @return Book型
	 */
	public static User getUser(String keyword) {
		// Bookの変数指定
		User user = null;

		// SQL文
		final String SQL = "select * from sn_user where userid = ?";

		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, PASSWORD);
				PreparedStatement pstmt = con.prepareStatement(SQL)) {

			// SQLの変数に値をセット
			pstmt.setString(1, keyword); // 書籍番号

			// 結果をセットする
			ResultSet rs = pstmt.executeQuery();

			// rx.nextがtrueの場合
			if (rs.next() == true) {
				user = setUser(rs);
			}
		} catch (SQLException e) {
			System.err.println("SQL:" + SQL);
			e.printStackTrace();
		}
		return user;
	}

	/**
	 * 書名や著者をもとに検索を行う
	 * @param keyword  検索条件（String）
	 * @return List<Book>
	 */
	public static User getLoginUser(String id, String password) {
		User user = null;
		final String SQL = "select * from sn_user where (userid = ? and password = ?)";

		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, PASSWORD);
				PreparedStatement pstmt = con.prepareStatement(SQL)) {

			pstmt.setString(1, id );
			pstmt.setString(2, password);

			ResultSet rs = pstmt.executeQuery();
			if (rs.next() == true) {
				user = setUser(rs);
			}
		} catch (SQLException e) {
			System.err.println("SQL:" + SQL);
			e.printStackTrace();
		}

		return user;


	}

	/**
	 * データの追加
	 * @param book
	 * @return 追加したデータ数
	 */
	public static int insert(User user) {

		final String SQL = "insert into sn_user(userid, password, mailaddress, status) values( ?, ?, ?, 1)";
		int rows = 0;

		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, PASSWORD);
				PreparedStatement pstmt = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS)) {

			// SQLに変数を挿入
			pstmt.setString(1, user.getUserid());
			pstmt.setString(2, user.getPassword()); // 1番目：書名
//			pstmt.setString(3, user.getName());// 2番目：著者
			pstmt.setString(3, user.getMailadress());// 2番目：著者
//			pstmt.setInt(4, user.getStatus());	 // 3番目：価格

			rows = pstmt.executeUpdate();

		} catch (SQLException e) {
			System.err.println("SQL:" + SQL);
			e.printStackTrace();
		}
		return rows;
	}

	/**
	 * 価格データの更新
	 * @param bookno
	 * @param price
	 * @return 更新したデータ数
	 */
/*	public static int updateBookPrice(int bookno, int price) {

		final String SQL = "update book set price = ? where bookno = ?";
		int rows = 0; // *行

		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, PASSWORD);
				PreparedStatement pstmt = con.prepareStatement(SQL)) {

			// SQLの変数に挿入
			pstmt.setInt(1, price);		// 価格
			pstmt.setInt(2, bookno);	// 書籍番号

			rows = pstmt.executeUpdate();

		} catch (SQLException e) {
			System.err.println("SQL:" + SQL);
			e.printStackTrace();
		}
		return rows;
	}

	/**
	 * データの削除
	 * @param bookno
	 * @return
	 */
/*	public static int deleteBook(int bookno) {

		final String SQL = "delete from book where bookno = ?";
		int rows = 0;

		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, PASSWORD);
				PreparedStatement pstmt = con.prepareStatement(SQL)) {

			// SQLの変数に挿入
			pstmt.setInt( 1, bookno); // 書籍番号

			rows = pstmt.executeUpdate();

		} catch (SQLException e) {
			System.err.println("SQL:" + SQL);
			e.printStackTrace();
		}
		return rows;
	}*/
}