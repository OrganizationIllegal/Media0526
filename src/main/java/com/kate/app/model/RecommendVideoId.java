package com.kate.app.model;

/**
 * RecommendVideoId entity. @author MyEclipse Persistence Tools
 */
public class RecommendVideoId extends AbstractRecommendVideoId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public RecommendVideoId() {
	}

	/** full constructor */
	public RecommendVideoId(Integer id, String videoPic, String videoId) {
		super(id, videoPic, videoId);
	}

}
