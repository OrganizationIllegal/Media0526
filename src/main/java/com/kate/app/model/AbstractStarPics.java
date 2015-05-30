package com.kate.app.model;

/**
 * AbstractStarPics entity provides the base persistence definition of the
 * StarPics entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractStarPics implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer starId;
	private String starImage;

	// Constructors

	/** default constructor */
	public AbstractStarPics() {
	}

	/** full constructor */
	public AbstractStarPics(Integer starId, String starImage) {
		this.starId = starId;
		this.starImage = starImage;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStarId() {
		return this.starId;
	}

	public void setStarId(Integer starId) {
		this.starId = starId;
	}

	public String getStarImage() {
		return this.starImage;
	}

	public void setStarImage(String starImage) {
		this.starImage = starImage;
	}

}