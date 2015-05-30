package com.kate.app.model;

/**
 * AbstractStarVedio entity provides the base persistence definition of the
 * StarVedio entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractStarVedio implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer starNum;
	private String videoPic;
	private String videoId;

	// Constructors

	/** default constructor */
	public AbstractStarVedio() {
	}

	/** full constructor */
	public AbstractStarVedio(Integer starNum, String videoPic, String videoId) {
		this.starNum = starNum;
		this.videoPic = videoPic;
		this.videoId = videoId;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStarNum() {
		return this.starNum;
	}

	public void setStarNum(Integer starNum) {
		this.starNum = starNum;
	}

	public String getVideoPic() {
		return this.videoPic;
	}

	public void setVideoPic(String videoPic) {
		this.videoPic = videoPic;
	}

	public String getVideoId() {
		return this.videoId;
	}

	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}

}