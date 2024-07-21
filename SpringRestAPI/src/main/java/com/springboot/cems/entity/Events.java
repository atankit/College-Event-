package com.springboot.cems.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Events {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 200)
	private String title;
	@Column(length = 1000)
	private String description;
	private String eventfor;
	@Column(name = "timestamp", nullable = false,updatable = false, insertable = false,  columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Timestamp timestamp;
	
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEventfor() {
		return eventfor;
	}
	public void setEventfor(String eventfor) {
		this.eventfor = eventfor;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "Events [id=" + id + ", title=" + title + ", description=" + description + ", eventfor=" + eventfor
				+ ", timestamp=" + timestamp + "]";
	}
	
		
}
