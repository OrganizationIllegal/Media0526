package com.kate.app.model;

import java.util.Date;

/**
 * News entity. @author MyEclipse Persistence Tools
 */
public class News extends AbstractNews implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public News() {
	}

	/** full constructor */
	public News(Integer newsId, String newsTitle, Date newsTime,
			String newsDetail) {
		super(newsId, newsTitle, newsTime, newsDetail);
	}

}
