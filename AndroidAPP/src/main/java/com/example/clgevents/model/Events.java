package com.example.clgevents.model;

import java.sql.Timestamp;

public class Events {

	private int id;
	private String title;
	private String description;
	private String eventfor;
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
