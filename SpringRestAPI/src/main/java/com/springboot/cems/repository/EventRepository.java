package com.springboot.cems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.cems.entity.Events;

@Repository
public interface EventRepository extends JpaRepository<Events, Integer> {
	
    
}
