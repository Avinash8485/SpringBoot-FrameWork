package com.jsp.springboot.actorsdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jsp.springboot.actorsdb.entity.Actor;

public interface ActorRepository extends JpaRepository<Actor,Integer>{
	
	//Save()
	//findAll()
	//findById()
	//deleteById()

}
