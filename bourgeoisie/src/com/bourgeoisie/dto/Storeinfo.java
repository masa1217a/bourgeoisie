package com.bourgeoisie.dto;

/* Code Generator Information.
 * generator Version 1.0.0 release 2007/10/10
 * generated Date Wed May 30 15:02:00 JST 2018
 */
import java.io.Serializable;

/**
 * StoreinfoVo.
 * @author ilearning
 * @version 1.0
 * history
 * Symbol	Date		Person		Note
 * [1]		2018/05/30	ilearning		Generated.
 */
public class Storeinfo implements Serializable{

	public static final String TABLE = "STOREINFO";

	/**
	 * storeid:int4(10) <Primary Key>
	 */
	private int storeid;

	/**
	 * genreno:serial(10)
	 */
	private int genreno;

	/**
	 * storemanagerid:int4(10)
	 */
	private int storemanagerid;

	/**
	 * picture:text(2147483647)
	 */
	private String picture;

	/**
	 * storeinfomation:text(2147483647)
	 */
	private String storeinfomation;

	/**
	 * address:varchar(2147483647)
	 */
	private String address;

	/**
	 * open:varchar(2147483647)
	 */
	private String open;

	/**
	 * url:varchar(255)
	 */
	private String url;

	/**
	 * phoneno:int4(10)
	 */
	private int phoneno;

	/**
	 * mailaddress:varchar(255)
	 */
	private String mailaddress;

	/**
	 * cost:varchar(2147483647)
	 */
	private int cost;

	/**
	 * storename:varchar(2147483647)
	 */
	private String storename;

	/**
	 * operatingcompany:varchar(2147483647)
	 */
	private String operatingcompany;

	/**
	 * representative:varchar(255)
	 */
	private String representative;

	/**
	 * storemanager:varchar(255)
	 */
	private String storemanager;

	/**
	 * update:varchar(255)
	 */
	private String update;

	/**
	 * status:int4(10)
	 */
	private int status;

	/**
	 * storeinfomationtitle:varchar(255)
	 */
	private String storeinfomationtitle;

	/**
	* Constractor
	*/
	public Storeinfo(){}

	/**
	* Constractor
	* @param <code>storeid</code>
	*/
	public Storeinfo(int storeid){
		this.storeid = storeid;
	}

	public int getStoreid(){ return this.storeid; }

	public void setStoreid(int storeid){ this.storeid = storeid; }

	public int getGenreno(){ return this.genreno; }

	public void setGenreno(int genreno){ this.genreno = genreno; }

	public int getStoremanagerid(){ return this.storemanagerid; }

	public void setStoremanagerid(int storemanagerid){ this.storemanagerid = storemanagerid; }

	public String getPicture(){ return this.picture; }

	public void setPicture(String picture){ this.picture = picture; }

	public String getStoreinfomation(){ return this.storeinfomation; }

	public void setStoreinfomation(String storeinfomation){ this.storeinfomation = storeinfomation; }

	public String getAddress(){ return this.address; }

	public void setAddress(String address){ this.address = address; }

	public String getOpen(){ return this.open; }

	public void setOpen(String open){ this.open = open; }

	public String getUrl(){ return this.url; }

	public void setUrl(String url){ this.url = url; }

	public int getPhoneno(){ return this.phoneno; }

	public void setPhoneno(int phoneno){ this.phoneno = phoneno; }

	public String getMailaddress(){ return this.mailaddress; }

	public void setMailaddress(String mailaddress){ this.mailaddress = mailaddress; }

	public int getCost(){ return this.cost; }

	public void setCost(int cost){ this.cost = cost; }

	public String getStorename(){ return this.storename; }

	public void setStorename(String storename){ this.storename = storename; }

	public String getOperatingcompany(){ return this.operatingcompany; }

	public void setOperatingcompany(String operatingcompany){ this.operatingcompany = operatingcompany; }

	public String getRepresentative(){ return this.representative; }

	public void setRepresentative(String representative){ this.representative = representative; }

	public String getStoremanager(){ return this.storemanager; }

	public void setStoremanager(String storemanager){ this.storemanager = storemanager; }

	public String getUpdate(){ return this.update; }

	public void setUpdate(String update){ this.update = update; }

	public int getStatus(){ return this.status; }

	public void setStatus(int status){ this.status = status; }

	public String getStoreinfomationtitle(){ return this.storeinfomationtitle; }

	public void setStoreinfomationtitle(String storeinfomationtitle){ this.storeinfomationtitle = storeinfomationtitle; }

	public String toString(){
		StringBuffer buffer = new StringBuffer();
		buffer.append("[StoreinfoVo:");
		buffer.append(" storeid: ");
		buffer.append(storeid);
		buffer.append(" genreno: ");
		buffer.append(genreno);
		buffer.append(" storemanagerid: ");
		buffer.append(storemanagerid);
		buffer.append(" picture: ");
		buffer.append(picture);
		buffer.append(" storeinfomation: ");
		buffer.append(storeinfomation);
		buffer.append(" address: ");
		buffer.append(address);
		buffer.append(" open: ");
		buffer.append(open);
		buffer.append(" url: ");
		buffer.append(url);
		buffer.append(" phoneno: ");
		buffer.append(phoneno);
		buffer.append(" mailaddress: ");
		buffer.append(mailaddress);
		buffer.append(" cost: ");
		buffer.append(cost);
		buffer.append(" storename: ");
		buffer.append(storename);
		buffer.append(" operatingcompany: ");
		buffer.append(operatingcompany);
		buffer.append(" representative: ");
		buffer.append(representative);
		buffer.append(" storemanager: ");
		buffer.append(storemanager);
		buffer.append(" update: ");
		buffer.append(update);
		buffer.append(" status: ");
		buffer.append(status);
		buffer.append(" storeinfomationtitle: ");
		buffer.append(storeinfomationtitle);
		buffer.append("]");
		return buffer.toString();
	}

}
