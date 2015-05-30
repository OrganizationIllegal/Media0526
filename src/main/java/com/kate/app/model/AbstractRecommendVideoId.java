package com.kate.app.model;

/**
 * AbstractRecommendVideoId entity provides the base persistence definition of
 * the RecommendVideoId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRecommendVideoId implements java.io.Serializable {

	// Fields

	private Integer id;
	private String videoPic;
	private String videoId;

	// Constructors

	/** default constructor */
	public AbstractRecommendVideoId() {
	}

	/** full constructor */
	public AbstractRecommendVideoId(Integer id, String videoPic, String videoId) {
		this.id = id;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractRecommendVideoId))
			return false;
		AbstractRecommendVideoId castOther = (AbstractRecommendVideoId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getVideoPic() == castOther.getVideoPic()) || (this
						.getVideoPic() != null
						&& castOther.getVideoPic() != null && this
						.getVideoPic().equals(castOther.getVideoPic())))
				&& ((this.getVideoId() == castOther.getVideoId()) || (this
						.getVideoId() != null && castOther.getVideoId() != null && this
						.getVideoId().equals(castOther.getVideoId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getVideoPic() == null ? 0 : this.getVideoPic().hashCode());
		result = 37 * result
				+ (getVideoId() == null ? 0 : this.getVideoId().hashCode());
		return result;
	}

}