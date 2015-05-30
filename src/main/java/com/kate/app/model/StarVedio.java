package com.kate.app.model;

/**
 * StarVedio entity. @author MyEclipse Persistence Tools
 */
public class StarVedio extends AbstractStarVedio implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public StarVedio() {
	}

	/** full constructor */
	public StarVedio(Integer starNum, String videoPic, String videoId) {
		super(starNum, videoPic, videoId);
	}

}
