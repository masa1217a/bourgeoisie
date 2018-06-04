package com.bourgeoisie.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bourgeoisie.dto.Genre;

public class GenreDao {

	//フィールド
	private static final String DB_URL = ("jdbc:postgresql://localhost:5432/sn_tr");
	private static final String DB_USER = ("postgres");
	private static final String DB_PASSWORD = ("password");
	private static final String JDBC_DRIVER = ("org.postgresql.Driver");

	//ドライバのロード
	static {
		try {
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			System.err.println("JDBCドライバのロードに失敗しました。");
			e.printStackTrace();
		}
	}

	/**
	 * すべての書籍の情報を取得する
	 * @return 書籍オブジェクトのリスト
	 */

	public static List<Genre> all() {

		//SQL文
		final String sql = "select * from genre where status=1 order by genreno";

		//Storeinfo型のArrayListのインスタンスlistを生成
		List<Genre> list = new ArrayList<>();

		//コネクションの作成
		//SQL文を前もってコンパイル
		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
				PreparedStatement pstmt = con.prepareStatement(sql)) {


			//SQL文の実行
			ResultSet rs = pstmt.executeQuery();

			//Storeinfoオブジェクトのdtoに情報を代入
			while (rs.next()) {
				Genre dto = createGenre(rs);
				list.add(dto);
			}
		} catch (SQLException e) {
			System.out.println("SQL:" + sql);
			e.printStackTrace();
		}

		//list(Storeinfoオブジェクト)を返す
		return list;
	}

	private static Genre createGenre(ResultSet rs) throws SQLException {
		Genre dto = new Genre();
		dto.setGenreno(rs.getInt("genreno"));
		dto.setGenre(rs.getString("genre"));
		dto.setStatus(rs.getInt("status"));
		return dto;
	}

}