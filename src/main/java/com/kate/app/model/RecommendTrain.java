package com.kate.app.model;

/**
 * RecommendTrain entity. @author MyEclipse Persistence Tools
 */
public class RecommendTrain extends AbstractRecommendTrain implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public RecommendTrain() {
	}

	/** full constructor */
	public RecommendTrain(String trainImg, Integer trainId) {
		super(trainImg, trainId);
	}

}
