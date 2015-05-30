package com.kate.app.model;

/**
 * AbstractNewsImage entity provides the base persistence definition of the
 * NewsImage entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractNewsImage implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer newsId;
	private String newsImage;

	// Constructors

	/** default constructor */
	public AbstractNewsImage() {
	}

	/** full constructor */
	public AbstractNewsImage(Integer newsId, String newsImage) {
		this.newsId = newsId;
		this.newsImage = newsImage;
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

	public String getNewsImage() {
		return this.newsImage;
	}

	public void setNewsImage(String newsImage) {
		this.newsImage = newsImage;
	}

}