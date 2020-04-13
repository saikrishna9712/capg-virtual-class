package com.capg.lab2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Traniee")
public class Traniee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int tranieeId;
	private String tranieeName;
	private String tranieeDomain;
	private String tranieeLocation;
	public int getTranieeId() {
		return tranieeId;
	}
	public void setTranieeId(int tranieeId) {
		this.tranieeId = tranieeId;
	}
	public String getTranieeName() {
		return tranieeName;
	}
	public void setTranieeName(String tranieeName) {
		this.tranieeName = tranieeName;
	}
	public String getTranieeDomain() {
		return tranieeDomain;
	}
	public void setTranieeDomain(String tranieeDomain) {
		this.tranieeDomain = tranieeDomain;
	}
	public String getTranieeLocation() {
		return tranieeLocation;
	}
	public void setTranieeLocation(String tranieeLocation) {
		this.tranieeLocation = tranieeLocation;
	}
	
	public Traniee() {
		// TODO Auto-generated constructor stub
	}
	public Traniee(int tranieeId, String tranieeName, String tranieeDomain, String tranieeLocation) {
		super();
		this.tranieeId = tranieeId;
		this.tranieeName = tranieeName;
		this.tranieeDomain = tranieeDomain;
		this.tranieeLocation = tranieeLocation;
	}
	@Override
	public String toString() {
		return "Traniee [tranieeId=" + tranieeId + ", tranieeName=" + tranieeName + ", tranieeDomain=" + tranieeDomain
				+ ", tranieeLocation=" + tranieeLocation + "]";
	}
	
	

}
