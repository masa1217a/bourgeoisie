package com.bourgeoisie.model.admin.storemanager;

import javax.servlet.http.HttpSession;

import com.bourgeoisie.dao.StoremanagerDao;


public class LoginManage {

	HttpSession session;

	public LoginManage(HttpSession session) {
		this.session = session;
	}

	public boolean doLogin(String id, String password) {
		session.setAttribute("storemanagerid", StoremanagerDao.getLoginManager(id, password));
		// ログインチェック
		if(session.getAttribute("storemanagerid") == null) {
			return false;
		}
		// 成功
		return true;

		//失敗
		//return false;
	}

}
