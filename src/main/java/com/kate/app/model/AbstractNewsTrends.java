package com.kate.app.model;

import java.util.Date;

/**
 * AbstractNewsTrends entity provides the base persistence definition of the
 * NewsTrends entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractNewsTrends implements java.io.Serializable {

	// Fields

	private Integer id;
	private String title;
	private Date time;
	private String detail;
	private String image;

	// Constructors

	/** default constructor */
	public AbstractNewsTrends() {
	}

	/** full constructor */
	public AbstractNewsTrends(String title, Date time, String detail,
			String image) {
		this.title = title;
		this.time = time;
		this.detail = detail;
		this.image = image;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}