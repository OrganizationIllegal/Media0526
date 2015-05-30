package com.kate.app.model;

/**
 * NewsImage entity. @author MyEclipse Persistence Tools
 */
public class NewsImage extends AbstractNewsImage implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public NewsImage() {
	}

	/** full constructor */
	public NewsImage(Integer newsId, String newsImage) {
		super(newsId, newsImage);
	}

}
