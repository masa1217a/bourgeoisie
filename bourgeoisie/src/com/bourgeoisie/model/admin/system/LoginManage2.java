package com.bourgeoisie.model.admin.system;

import javax.servlet.http.HttpSession;

import com.bourgeoisie.dao.SyOperatorDAO;



public class LoginManage2 {

	HttpSession session;

	public LoginManage2(HttpSession session) {
		this.session = session;
	}

	public boolean doLogin(String id, String password) {
		session.setAttribute("adminid", SyOperatorDAO.getLoginManager(id, password));
		// ログインチェック
		if( session.getAttribute("adminid") == null) {
			return false;
		}
		// 成功
		return true;

		//失敗
		//return false;
	}

}
