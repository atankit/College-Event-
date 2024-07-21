package com.springboot.cems;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.springboot.cems.dao.EventDao;
import com.springboot.cems.entity.Events;

@SpringBootTest
class CemsApplicationTests {

	@Autowired EventDao eventDao;
	
//	@Test
	void contextLoads() {
	}
	
	@Test
	void addEventTest() {
		Events events = new  Events();
		events.setTitle("Testing datetime");
		events.setDescription("Today will we your sem exam at 10AM ");
		events.setEventfor("Test");
		
		eventDao.save(events);
	}
	
//	@Test
	void getAllEvent() {
		List<Events> events = eventDao.getAllEvents();
		System.out.println(events);
	}

}
