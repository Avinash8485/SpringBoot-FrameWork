package com.jsp.springboot.actorsdb.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Actor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int actorId;
	private String actorName;
	private int actorAge;
	private String actorIndstry;
	private String actorNationality;
	
	
	public int getActorId() {
		return actorId;
	}
	public void setActorId(int actorId) {
		this.actorId = actorId;
	}
	public String getActorName() {
		return actorName;
	}
	public void setActorName(String actorName) {
		this.actorName = actorName;
	}
	public int getActorAge() {
		return actorAge;
	}
	public void setActorAge(int actorAge) {
		this.actorAge = actorAge;
	}
	public String getActorNationality() {
		return actorNationality;
	}
	public void setActorNationality(String actorNationality) {
		this.actorNationality = actorNationality;
	}
	public String getActorIndstry() {
		return actorIndstry;
	}
	public void setActorIndstry(String actorIndstry) {
		this.actorIndstry = actorIndstry;
	}
	

	
	
}
