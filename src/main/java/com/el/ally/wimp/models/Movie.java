package com.el.ally.wimp.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Movie {

	@Id 
	@GeneratedValue(generator="movie_id_seq", strategy=GenerationType.AUTO)
	@SequenceGenerator(name="movie_id_seq", sequenceName="movie_id_seq")
	private int id;
	@Column(name="title", nullable=false,length=300)
	private String title;
	@Column(name="releaseDate", nullable=true)
	private Date releaseDate;
	@Column(name="budget", nullable=true)
	private long budget;
	@Column(name="distributor", nullable=false, length=500)
	private String distributor;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public long getBudget() {
		return budget;
	}
	public void setBudget(long budget) {
		this.budget = budget;
	}
	public String getDistributor() {
		return distributor;
	}
	public void setDistributor(String distributor) {
		this.distributor = distributor;
	}
	
	
}
