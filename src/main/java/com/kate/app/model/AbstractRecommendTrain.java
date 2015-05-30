package com.kate.app.model;

/**
 * AbstractRecommendTrain entity provides the base persistence definition of the
 * RecommendTrain entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRecommendTrain implements java.io.Serializable {

	// Fields

	private Integer id;
	private String trainImg;
	private Integer trainId;

	// Constructors

	/** default constructor */
	public AbstractRecommendTrain() {
	}

	/** full constructor */
	public AbstractRecommendTrain(String trainImg, Integer trainId) {
		this.trainImg = trainImg;
		this.trainId = trainId;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTrainImg() {
		return this.trainImg;
	}

	public void setTrainImg(String trainImg) {
		this.trainImg = trainImg;
	}

	public Integer getTrainId() {
		return this.trainId;
	}

	public void setTrainId(Integer trainId) {
		this.trainId = trainId;
	}

}