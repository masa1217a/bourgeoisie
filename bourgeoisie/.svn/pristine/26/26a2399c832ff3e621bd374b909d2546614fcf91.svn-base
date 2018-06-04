package com.bourgeoisie.model.admin.system;

import java.util.ArrayList;

import com.bourgeoisie.dao.StoremanagerDao;
import com.bourgeoisie.dto.Storemanager;

public class RecordStoreCtrl {

	public ArrayList<String> reflectRecordInfo(Storemanager manager) {

		ArrayList<String> error_message = new ArrayList<>();
		int rows = 0;

		int id = manager.getStoremanageid();
		String password = manager.getPassword();

		//rows = StoremanagerDao.insertStoremanager(manager);

		if (StoremanagerDao.getStoremanager(id) != null) {
			error_message.add("IDが重複しています。");
		}

		if (id / 10000000 != 0) {
			error_message.add("idは8桁の整数で入力してください。");
		}

		if ((password.length() < 4 || 16 < password.length())) {
			error_message.add("パスワードは4文字以上16文字以下で入力してください。");
		}

		return error_message;
	}

	public boolean insert(Storemanager manager) {
		int row = StoremanagerDao.insertStoremanager(manager);

		if (row == 0) {
			return false;
		}
		return true;
	}
}
