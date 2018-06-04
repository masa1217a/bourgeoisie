package com.bourgeoisie.model.user;

import java.sql.SQLException;

import com.bourgeoisie.dao.UserDao;
import com.bourgeoisie.dto.User;

public class UserCtrl {
	//public void Userentry() {

	//}

	private String password1;
	private String password2;
	private String mail1;
	private String mail2;

	public boolean RefrectUserentry() {
		if(password1!=password2 && mail1!=mail2) {
			return false;
		}
		return true;
	}

	public int update(User user) throws SQLException {
		return UserDao.insert(user);
	}

	public String getPassword1() {
		return password1;
	}

	public void setPassword1(String password1) {
		this.password1 = password1;
	}

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	public String getMail1() {
		return mail1;
	}

	public void setMail1(String mail1) {
		this.mail1 = mail1;
	}

	public String getMail2() {
		return mail2;
	}

	public void setMail2(String mail2) {
		this.mail2 = mail2;
	}


}
