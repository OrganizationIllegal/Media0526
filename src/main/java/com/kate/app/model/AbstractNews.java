package com.kate.app.model;

import java.util.Date;

/**
 * AbstractNews entity provides the base persistence definition of the News
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractNews implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer newsId;
	private String newsTitle;
	private Date newsTime;
	private String newsDetail;

	// Constructors

	/** default constructor */
	public AbstractNews() {
	}

	/** full constructor */
	public AbstractNews(Integer newsId, String newsTitle, Date newsTime,
			String newsDetail) {
		this.newsId = newsId;
		this.newsTitle = newsTitle;
		this.newsTime = newsTime;
		this.newsDetail = newsDetail;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNewsId() {
		return this.newsId;
	}

	public void setNewsId(Integer newsId) {
		this.newsId = newsId;
	}

	public String getNewsTitle() {
		return this.newsTitle;
	}

	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}

	public Date getNewsTime() {
		return this.newsTime;
	}

	public void setNewsTime(Date newsTime) {
		this.newsTime = newsTime;
	}

	public String getNewsDetail() {
		return this.newsDetail;
	}

	public void setNewsDetail(String newsDetail) {
		this.newsDetail = newsDetail;
	}

}