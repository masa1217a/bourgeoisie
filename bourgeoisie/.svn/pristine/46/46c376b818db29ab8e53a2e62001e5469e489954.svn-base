package com.bourgeoisie.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bourgeoisie.dto.Review;

public class EvaluationDao {
	private static final String DB_URL = "jdbc:postgresql://localhost:5432/sn_tr";
	private static final String DB_USER = "postgres";
	private static final String PASSWORD = "password";
	private static final String JDBC_DRIVER = "org.postgresql.Driver";

	static {
		try {
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			System.err.println("JDBCドライバのロードに失敗しました。");
			e.printStackTrace();
		}
	}

	/**
	 * レビューテーブルの情報をすべて検索。
	 * @return リスト
	 */
	public static List<Review> getReviewList() {
		List<Review> review = new ArrayList<>();
		final String SQL = "select * from review";
		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, PASSWORD);
				PreparedStatement pstmt = con.prepareStatement(SQL)) {
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Review rev = new Review();
				rev.setReviewid(rs.getInt("reviewid"));
				rev.setStoreid(rs.getInt("storeid"));
				rev.setUserid(rs.getString("userid"));
				rev.setTitle(rs.getString("title"));
				rev.setComment(rs.getString("comment"));
				rev.setPicture(rs.getString("picture"));
				rev.setRating(rs.getInt("rating"));
				rev.setStatus(rs.getInt("status"));
				review.add(rev);
			}

		} catch (SQLException e) {
			System.err.println("SQL:" + SQL);
			e.printStackTrace();
		}
		return review;
	}

	/**
	 * 入力されたタイトル、コメント、写真、評価を登録する。
	 * @return
	 */
	public static int entryEvaluation(Review review) {
		final String SQL = "insert into review(storeid, userid, title, comment, rating, status) values(?, ?, ?, ?,?,?)";
		int rows = 0;
		String gkey = null; // キー
		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, PASSWORD);
				PreparedStatement pstmt = con.prepareStatement(SQL,Statement.RETURN_GENERATED_KEYS)) {
			//SQL文にデータをいれる
			pstmt.setInt(1, review.getStoreid());
			pstmt.setString(2, "aaa");
			pstmt.setString(3, review.getTitle());
			pstmt.setString(4, review.getComment());
//			pstmt.setString(5, review.getPicture());
			pstmt.setInt(5, review.getRating());
			pstmt.setInt(6, 1);

			//updateを実行する
			rows = pstmt.executeUpdate();

			// キーを生成
			ResultSet rs = pstmt.getGeneratedKeys();
			// 主キーの取得
			if(rs.next()) {
				gkey = rs.getString(1);
				review.setUserid(gkey);
			}

		} catch (SQLException e) {
			System.err.println("SQL:" + SQL);
			e.printStackTrace();
		}
		return rows;

	}

	/**
	 * 投稿を削除する。
	 */

	/**
	 * ユーザーのIDと一致する投稿を取得する。
	 */
	public static int userEvaluation(int userid) {

		final String SQL = "select * from userid where userid = ?";
		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, PASSWORD);
				PreparedStatement pstmt = con.prepareStatement(SQL)) {
			pstmt.setInt(1, userid);
		} catch (SQLException e) {
			System.err.println("SQL:" + SQL);
			e.printStackTrace();
		}
		return 0;

	}

	/**
	 * 店舗のIDと一致する投稿を取得する。
	 */
	public static int storeEvaluation(int storeid) {

		final String SQL = "select * from userid where userid = ?";
		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, PASSWORD);
				PreparedStatement pstmt = con.prepareStatement(SQL)) {
			pstmt.setInt(1, storeid);
		} catch (SQLException e) {
			System.err.println("SQL:" + SQL);
			e.printStackTrace();
		}
		return 0;

	}


	/**
	 * 投稿を変更する。
	 */
}
