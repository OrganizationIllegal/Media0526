package com.kate.app.model;

/**
 * AbstractRecommendVideo entity provides the base persistence definition of the
 * RecommendVideo entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRecommendVideo implements java.io.Serializable {

	// Fields

	private RecommendVideoId id;

	// Constructors

	/** default constructor */
	public AbstractRecommendVideo() {
	}

	/** full constructor */
	public AbstractRecommendVideo(RecommendVideoId id) {
		this.id = id;
	}

	// Property accessors

	public RecommendVideoId getId() {
		return this.id;
	}

	public void setId(RecommendVideoId id) {
		this.id = id;
	}

}