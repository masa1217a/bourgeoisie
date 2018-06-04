package com.bourgeoisie.model.admin.storemanager;

import java.util.List;

import com.bourgeoisie.dao.StoreinfoDao;

public class StoreTopBean {
	private int storeid;
	private List<String> storename;

	public int getStoreid() {
		return storeid;
	}

	public void setStoreid(int storeid) {
		this.storeid = storeid;
	}

	public List<String> getStorename() {
		storename = StoreinfoDao.getStorename(storeid); //getStoreにstoreidを入れるとstorenameが返ってくる
		return storename;
	}

	public void setStorename(List<String> storename) {
		this.storename = storename;
	}

}
