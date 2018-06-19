package com.el.ally.wimp.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="actor")
public class Actor {

	@GeneratedValue(generator="actor_id_seq", strategy=GenerationType.AUTO)
	@SequenceGenerator(name="actor_id_seq", sequenceName="actor_id_seq")
	private int id;
	@Column(name="firstName", nullable=false,length=75)
	private String firstName;
	@Column(name="lastName", nullable=true, length=75)
	private String lastName;
	@Column(name="activeSinceYear",nullable=true)
	private long activeSinceYear;
	@Column(name="birthDate",nullable=true)
	private Date birthDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getActiveSinceYear() {
		return activeSinceYear;
	}
	public void setActiveSinceYear(long activeSinceYear) {
		this.activeSinceYear = activeSinceYear;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	
}
