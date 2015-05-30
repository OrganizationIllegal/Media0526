package com.kate.app.model;

/**
 * StarPics entity. @author MyEclipse Persistence Tools
 */
public class StarPics extends AbstractStarPics implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public StarPics() {
	}

	/** full constructor */
	public StarPics(Integer starId, String starImage) {
		super(starId, starImage);
	}

}
