package com.bourgeoisie.model;
import java.util.List;

import com.bourgeoisie.dao.EvaluationDao;
import com.bourgeoisie.dao.StoreinfoDao;
import com.bourgeoisie.dao.UserDao;
import com.bourgeoisie.dto.Review;
import com.bourgeoisie.dto.Storeinfo;
import com.bourgeoisie.dto.User;

public class ContributionModel {

	public List<Review> allReview() {
		return EvaluationDao.getReviewList();
	}

	public Storeinfo getStoreid(int storeid) {
		return StoreinfoDao.getStore(storeid);
	}

	public User getUserid(String userid) {
		return UserDao.getUser(userid);
	}


}
