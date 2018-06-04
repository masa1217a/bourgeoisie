package com.bourgeoisie.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bourgeoisie.dto.Storeinfo;

public class StoreinfoDao {

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
	 * 店舗ID順に店舗の情報をすべて取得する
	 * @return 書籍オブジェクトのリスト
	 */

	public static List<Storeinfo> getStoreinfoList() {

		//SQL文
		final String SQL = "select * from Storeinfo order by storeid";

		//String型の可変長引数paramsの配列を生成
		String params[] = new String[] {};

		//SQLとparamsを引数にSQL文の実行
		List<Storeinfo> list = executeQuery(SQL, params);

		//list(Storeinfoオブジェクト)を返す
		return list;
	}

	/**
	 * 管理者が保有している店舗名一覧の取得
	 * @param keyword
	 * @return
	 */
	public static List<String> getStorename(int keyword) {
		//String型の可変長引数paramsの配列を生成
		List<String> list = new ArrayList<>();

		// SQL文
		final String SQL = "select storename from storeinfo where storeid = ?";

		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
				PreparedStatement pstmt = con.prepareStatement(SQL)) {

			// SQLの変数に値をセット
			pstmt.setInt(1, keyword); // 書籍番号

			// 結果をセットする
			ResultSet rs = pstmt.executeQuery();

			int i = 0;
			// rx.nextがtrueの場合
			while (rs.next() == true) {
				list.add(rs.getString("storename"));
			}
		} catch (SQLException e) {
			System.err.println("SQL:" + SQL);
			e.printStackTrace();
		}
		return list;
	}

	/**
	 * 店舗IDが一致する店舗情報を取得する
	 * @param Storeinfono
	 * @return 一致したStoreinfoオブジェクト。一致しない場合はnull。
	 */
	public static Storeinfo find(int Storeinfono) {

		//SQL文
		final String SQL = "select * from Storeinfo where storeid = ?";
		Storeinfo dto = null;

		//String型の可変長引数paramsの配列を生成し
		//SQL文を前もってコンパイル
		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
				PreparedStatement pstmt = con.prepareStatement(SQL)) {

			//パラメーターの値をセット
			pstmt.setInt(1, Storeinfono);

			//SQL文の実行
			ResultSet rs = pstmt.executeQuery();

			//Storeinfoオブジェクトのdtoに情報を代入
			while (rs.next()) {
				dto = createStoreinfo(rs);

			}
		} catch (SQLException e) {
			System.out.println("SQL:" + SQL);
			e.printStackTrace();
		}
		return dto;
	}

	private static Storeinfo createStoreinfo(ResultSet rs) throws SQLException {
		Storeinfo dto = new Storeinfo();
		dto.setStoreid(rs.getInt("storeid"));
		dto.setGenreno(rs.getInt("genreno"));
		dto.setStoremanagerid(rs.getInt("storemanagerid"));
		dto.setPicture(rs.getString("picture"));
		dto.setStoreinfomation(rs.getString("storeinfomation"));
		dto.setAddress(rs.getString("address"));
		dto.setOpen(rs.getString("open"));
		dto.setUrl(rs.getString("url"));
		dto.setPhoneno(rs.getInt("phoneno"));
		dto.setMailaddress(rs.getString("mailaddress"));
		dto.setCost(rs.getInt("cost"));
		dto.setStorename(rs.getString("storename"));
		dto.setOperatingcompany(rs.getString("operatingcompany"));
		dto.setRepresentative(rs.getString("representative"));
		dto.setStoremanager(rs.getString("storemanager"));
		dto.setUpdate(rs.getString("update"));
		dto.setStatus(rs.getInt("status"));
		dto.setStoreinfomationtitle(rs.getString("storeinfomationtitle"));
		return dto;
	}

	/**
	 * 店舗名の一部が一致する店舗情報を取得する
	 * @param keyword
	 * @param i
	 * @return 一致したStoreinfoオブジェクト。一致しない場合はnull。
	 *
	 */
	public static List<Storeinfo> search(String keyword, int genreno) {

		//SQL文
		String sql = "select * from Storeinfo where storename like ?";

		if (genreno!=0) {
			sql += " and genreno=?";
		}


		//Storeinfo型のArrayListのインスタンスlistを生成
		List<Storeinfo> list = new ArrayList<>();

		//コネクションの作成
		//SQL文を前もってコンパイル
		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
				PreparedStatement pstmt = con.prepareStatement(sql)) {

			pstmt.setString(1, "%"+keyword+"%");
			if (genreno!=0) {
				pstmt.setInt(2, genreno);
			}

			//SQL文の実行
			ResultSet rs = pstmt.executeQuery();

			//Storeinfoオブジェクトのdtoに情報を代入
			while (rs.next()) {
				Storeinfo dto = createStoreinfo(rs);
				list.add(dto);
			}
		} catch (SQLException e) {
			System.out.println("SQL:" + sql);
			e.printStackTrace();
		}

		//list(Storeinfoオブジェクト)を返す
		return list;

	}

	/**
	 * getStoreinfoList,getStoreinfoBy,getStoreinfoListByに共通する処理の部分を抽出し、
	 * select文を実行するexecuteQueryメソッド
	 * @param SQL
	 * @param params
	 * @return
	 */
	private static List<Storeinfo> executeQuery(String SQL, String... params) {

		//Storeinfo型のArrayListのインスタンスlistを生成
		List<Storeinfo> list = new ArrayList<>();

		//コネクションの作成
		//SQL文を前もってコンパイル
		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
				PreparedStatement pstmt = con.prepareStatement(SQL)) {

			//パラメーターの値をセット
			for (int i = 0; i < params.length; i++) {
				pstmt.setString(i + 1, params[i]);
			}

			//SQL文の実行
			ResultSet rs = pstmt.executeQuery();

			//Storeinfoオブジェクトのdtoに情報を代入
			while (rs.next()) {
				Storeinfo dto = createStoreinfo(rs);
				list.add(dto);

			}
		} catch (SQLException e) {
			System.out.println("SQL:" + SQL);
			e.printStackTrace();
		}

		//list(Storeinfoオブジェクト)を返す
		return list;
	}

	//店舗情報の詳細情報を表示するためのメソッド
	public static Storeinfo getStore(int storeid) {
		//SQL文
		final String sql = "select * from Storeinfo where storeid = ?";
		Storeinfo dto = null;

		//String型の可変長引数paramsの配列を生成し
		//SQL文を前もってコンパイル
		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
				PreparedStatement pstmt = con.prepareStatement(sql)) {

			//パラメーターの値をセット
			pstmt.setInt(1, storeid);

			//SQL文の実行
			ResultSet rs = pstmt.executeQuery();

			//Storeinfoオブジェクトのdtoに情報を代入
			while (rs.next()) {
				dto = createStoreinfo(rs);

			}
		} catch (SQLException e) {
			System.out.println("SQL:" + sql);
			e.printStackTrace();
		}
		return dto;

	}

	/**
	 * 店舗情報を更新する。
	 * @return
	 */
	public static boolean updateStoreinfo(Storeinfo storeinfo) {
		final String SQL = "update storeinfo set "
				+ "storename=? , storeinfomation=?, genreno=?, cost=?, address=?, phoneno=?, open=?,"
				+ "url=?, mailaddress=?, operatingcompany=?, representative=?, storemanager=? "
				+ " where storeid=?";
		int rows = 0;
		String gkey = null; // キー
		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
				PreparedStatement pstmt = con.prepareStatement(SQL)) {
			//SQL文にデータをいれる
			pstmt.setString(1, storeinfo.getStorename());
			pstmt.setString(2, storeinfo.getStoreinfomation());
			pstmt.setInt(3, storeinfo.getGenreno());
			pstmt.setInt(4, storeinfo.getCost());
			pstmt.setString(5, storeinfo.getAddress());
			pstmt.setInt(6, storeinfo.getPhoneno());
			pstmt.setString(7, storeinfo.getOpen());
			pstmt.setString(8, storeinfo.getUrl());
			pstmt.setString(9, storeinfo.getMailaddress());
			pstmt.setString(10, storeinfo.getOperatingcompany());
			pstmt.setString(11, storeinfo.getRepresentative());
			pstmt.setString(12, storeinfo.getStoremanager());
			pstmt.setInt(13, storeinfo.getStoreid());

			//updateを実行する
			rows = pstmt.executeUpdate();

		} catch (SQLException e) {
			System.err.println("SQL:" + SQL);
			e.printStackTrace();
		}
		return rows==1;

	}
//	/**
//	 * 新しく書籍を追加する処理
//	 * @param Storeinfo
//	 * @return 追加に成功した場合は1、追加に失敗した場合は0
//	 */
//	public static int insert(Storeinfo Storeinfo) {
//
//		//SQL文
//		final String SQL = "insert into Storeinfo(title, author, price) values(?, ?, ?)";
//
//		int rows = 0;
//		Integer gkey = null;
//
//		//コネクションの作成
//		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
//				PreparedStatement pstmt = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS)) {
//
//			//パラメーターの値をセット
////			pstmt.setString(1, Storeinfo.getTitle());
////			pstmt.setString(2, Storeinfo.getAuthor());
////			pstmt.setInt(3, Storeinfo.getPrice());
//
//			//SQL文の実行
//			rows = pstmt.executeUpdate();
//
//			//getしたGeneratedKeysをrsに代入
//			ResultSet rs = pstmt.getGeneratedKeys();
//
//			if (rs.next()) {
//				gkey = (int) rs.getLong(1);
////				Storeinfo.setStoreinfono(gkey);
//			}
//			//ロールバック処理希望‼
//
//		} catch (SQLException e) {
//			System.out.println("SQL :" + SQL);
//			e.printStackTrace();
//		}
//		//SQL文の実行に成功した行数を返す
//		return rows;
//	}

	/**
	 * 価格の更新をする処理
	 * @param Storeinfono
	 * @param price
	 * @return 更新に成功した場合→1、更新に失敗した場合→0
	 */

//	public static int updateStoreinfoPrice(int Storeinfono, int price) {
//
//		//SQL文
//		final String SQL = "update Storeinfo set price = CAST ( ? AS int ) where Storeinfono = CAST ( ? AS int )";
//		int rows = 0;
//
//		//パラメーターの値をセット
//		String[] params = new String[] { String.valueOf(Storeinfono), String.valueOf(price) };
//
//		//SQL文の実行
//		rows = executeUpdate(SQL, params);
//
//		//SQL文の実行に成功した行数を返す
//		return rows;
//	}

	/**
	 * 	指定した書籍情報を削除する処理
	 * @param Storeinfono
	 * @return 削除が成功した場合は1、削除に失敗した場合は0
	 */
//	public static int delete(int Storeinfono) {
//
//		//SQL文
//		final String SQL = "delete from Storeinfo where Storeinfono =CAST ( ? AS int )";
//		int rows = 0;
//
//		//パラメーターの値をセット
//		String[] params = new String[] { String.valueOf(Storeinfono) };
//
//		//SQL文の実行
//		rows = executeUpdate(SQL, params);
//
//		//SQL文の実行に成功した行数を返す
//		return rows;
//	}
//
//	private static int executeUpdate(String SQL, String... params) {
//		int rows = 0;
//
//		//コネクションの作成
//		//SQL文を前もってコンパイル
//		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
//				PreparedStatement pstmt = con.prepareStatement(SQL)) {
//
//			//パラメーターの値をセット
//			for (int i = 0; i < params.length; i++) {
//				pstmt.setString(i + 1, params[i]);
//			}
//
//			//SQL文の実行
//			rows = pstmt.executeUpdate();
//
//		} catch (SQLException e) {
//			System.out.println("SQL :" + SQL);
//			e.printStackTrace();
//		}
//
//		//SQL文の実行に成功した行数を返す
//		return rows;
//
//	}
}