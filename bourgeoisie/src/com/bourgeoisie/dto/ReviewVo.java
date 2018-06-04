package com.bourgeoisie.dto;

/* Code Generator Information.
 * generator Version 1.0.0 release 2007/10/10
 * generated Date Fri Jun 01 15:22:46 JST 2018
 */
import java.io.Serializable;

/**
 * ReviewVo.
 * @author ilearning
 * @version 1.0 
 * history 
 * Symbol	Date		Person		Note
 * [1]		2018/06/01	ilearning		Generated.
 */
public class ReviewVo implements Serializable{

	public static final String TABLE = "REVIEW";

	/**
	 * reviewid:serial(10) <Primary Key>
	 */
	private int reviewid;

	/**
	 * storeid:int4(10)
	 */
	private int storeid;

	/**
	 * userid:varchar(255)
	 */
	private String userid;

	/**
	 * title:varchar(255)
	 */
	private String title;

	/**
	 * comment:text(2147483647)
	 */
	private String comment;

	/**
	 * picture:bytea(2147483647)
	 */
	private byte[] picture;

	/**
	 * rating:int4(10)
	 */
	private int rating;

	/**
	 * status:int4(10)
	 */
	private int status;

	/**
	 * created_at:timestamptz(35,6)
	 */
	private java.sql.Timestamp created_at;

	/**
	* Constractor
	*/
	public ReviewVo(){}

	/**
	* Constractor
	* @param <code>reviewid</code>
	*/
	public ReviewVo(int reviewid){
		this.reviewid = reviewid;
	}

	public int getReviewid(){ return this.reviewid; }

	public void setReviewid(int reviewid){ this.reviewid = reviewid; }

	public int getStoreid(){ return this.storeid; }

	public void setStoreid(int storeid){ this.storeid = storeid; }

	public String getUserid(){ return this.userid; }

	public void setUserid(String userid){ this.userid = userid; }

	public String getTitle(){ return this.title; }

	public void setTitle(String title){ this.title = title; }

	public String getComment(){ return this.comment; }

	public void setComment(String comment){ this.comment = comment; }

	public byte[] getPicture(){ return this.picture; }

	public void setPicture(byte[] picture){ this.picture = picture; }

	public int getRating(){ return this.rating; }

	public void setRating(int rating){ this.rating = rating; }

	public int getStatus(){ return this.status; }

	public void setStatus(int status){ this.status = status; }

	public java.sql.Timestamp getCreated_at(){ return this.created_at; }

	public void setCreated_at(java.sql.Timestamp created_at){ this.created_at = created_at; }

	public String toString(){
		StringBuffer buffer = new StringBuffer();
		buffer.append("[ReviewVo:");
		buffer.append(" reviewid: ");
		buffer.append(reviewid);
		buffer.append(" storeid: ");
		buffer.append(storeid);
		buffer.append(" userid: ");
		buffer.append(userid);
		buffer.append(" title: ");
		buffer.append(title);
		buffer.append(" comment: ");
		buffer.append(comment);
		buffer.append(" picture: ");
		buffer.append(picture);
		buffer.append(" rating: ");
		buffer.append(rating);
		buffer.append(" status: ");
		buffer.append(status);
		buffer.append(" created_at: ");
		buffer.append(created_at);
		buffer.append("]");
		return buffer.toString();
	}

}
