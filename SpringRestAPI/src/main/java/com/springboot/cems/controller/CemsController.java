package com.springboot.cems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.cems.dao.EventDao;
import com.springboot.cems.entity.Events;

@RestController
public class CemsController {
	
	@Autowired
	private EventDao eventDao;
	
	@GetMapping("/cems/event")
	public List<Events> getEvents(){
		return eventDao.getAllEvents();
	}

	@PostMapping("/cems/event")
	public Events save(@RequestBody Events events) {
		 return eventDao.save(events);
	}
}
