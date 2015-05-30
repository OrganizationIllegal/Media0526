package com.kate.app.model;

/**
 * AbstractStarImage entity provides the base persistence definition of the
 * StarImage entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractStarImage implements java.io.Serializable {

	// Fields

	private Integer id;
	private String img;
	private Integer starNum;

	// Constructors

	/** default constructor */
	public AbstractStarImage() {
	}

	/** full constructor */
	public AbstractStarImage(String img, Integer starNum) {
		this.img = img;
		this.starNum = starNum;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getImg() {
		return this.img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Integer getStarNum() {
		return this.starNum;
	}

	public void setStarNum(Integer starNum) {
		this.starNum = starNum;
	}

}