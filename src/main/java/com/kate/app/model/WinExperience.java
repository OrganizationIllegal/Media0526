package com.kate.app.model;

import java.util.Date;

/**
 * WinExperience entity. @author MyEclipse Persistence Tools
 */
public class WinExperience extends AbstractWinExperience implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public WinExperience() {
	}

	/** full constructor */
	public WinExperience(StarInfo starInfo, String detail, Date time) {
		super(starInfo, detail, time);
	}

}
