package com.springboot.cems.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;
import com.springboot.cems.entity.Events;
import com.springboot.cems.repository.EventRepository;

@Service
public class EventDao {
  
	@Autowired
	private EventRepository repository;
	
	// save event
	public Events save(Events events) {
	  return repository.save(events);
	}
	
	// getting event
	public List<Events> getAllEvents(){
		
		List<Events> events = new ArrayList<>();
		Streamable.of(repository.findAll()).forEach(event ->{
			events.add(event);
		});
		return events;
	}
	
}
