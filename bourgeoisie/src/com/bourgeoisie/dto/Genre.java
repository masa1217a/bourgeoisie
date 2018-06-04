package com.bourgeoisie.dto;

/* Code Generator Information.
 * generator Version 1.0.0 release 2007/10/10
 * generated Date Thu May 31 10:12:33 JST 2018
 */
import java.io.Serializable;

/**
 * GenreVo.
 * @author ilearning
 * @version 1.0
 * history
 * Symbol	Date		Person		Note
 * [1]		2018/05/31	ilearning		Generated.
 */
public class Genre implements Serializable{

	public static final String TABLE = "GENRE";

	/**
	 * genreno:serial(10) <Primary Key>
	 */
	private int genreno;

	/**
	 * genre:varchar(2147483647)
	 */
	private String genre;

	/**
	 * status:int4(10)
	 */
	private int status;

	/**
	* Constractor
	*/
	public Genre(){}

	/**
	* Constractor
	* @param <code>genreno</code>
	*/
	public Genre(int genreno){
		this.genreno = genreno;
	}

	public int getGenreno(){ return this.genreno; }

	public void setGenreno(int genreno){ this.genreno = genreno; }

	public String getGenre(){ return this.genre; }

	public void setGenre(String genre){ this.genre = genre; }

	public int getStatus(){ return this.status; }

	public void setStatus(int status){ this.status = status; }

	public String toString(){
		StringBuffer buffer = new StringBuffer();
		buffer.append("[GenreVo:");
		buffer.append(" genreno: ");
		buffer.append(genreno);
		buffer.append(" genre: ");
		buffer.append(genre);
		buffer.append(" status: ");
		buffer.append(status);
		buffer.append("]");
		return buffer.toString();
	}

}
