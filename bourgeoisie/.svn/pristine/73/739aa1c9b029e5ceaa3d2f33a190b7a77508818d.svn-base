package com.bourgeoisie.model;

import javax.servlet.http.HttpSession;

import com.bourgeoisie.dao.UserDao;

public class LoginManage {

	HttpSession session;

	public LoginManage(HttpSession session) {
		this.session = session;
	}

	public boolean doLogin(String id, String password) {

		session.setAttribute("user", UserDao.getLoginUser(id, password));
		// ログインチェック
		if(session.getAttribute("user") == null) {
			return false;
		}
		// 成功
		return true;

		//失敗
		//return false;
	}

	public int getUserId() {
		// TODO 仮実装　誰か実装して！！！
		return 12;
	}


}
