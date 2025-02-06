package com.jsp.springboot.actorsdb.controller;

import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.jsp.springboot.actorsdb.entity.Actor;
import com.jsp.springboot.actorsdb.service.ActorService;
import com.jsp.springboot.actorsdb.utility.ResponseStructure;

@RestController
public class ActorController {

	@Autowired
	private ActorService actorService;
	

	@PostMapping("/post-actors")
	@ResponseBody
	public ResponseEntity<ResponseStructure<Actor>>  addActor(@RequestBody Actor actor) {
		
		actor =  actorService.addActor(actor); // reassigning the actor object instead of creating the new object
		
//		ResponseStructure structure =  ResponseStructure.create(HttpStatus.CREATED.value(),"Created Sucessfull",actor);
//		return new ResponseEntity<ResponseStructure<Actor>>(structure,HttpStatus.FOUND);
		
		return ResponseEntity.status(HttpStatus.CREATED)
							.body(ResponseStructure.create(HttpStatus.CREATED.value(),"Created Sucessfull",actor));
	}

	//@RequestMapping(value ="/actors" , method = RequestMethod.GET)
	@GetMapping("/find-all-actors")
	@ResponseBody
	public ResponseEntity<ResponseStructure<List<Actor>>> findAllActor() {
		
		List<Actor> actor = actorService.findAllActor();
		
		return ResponseEntity.status(HttpStatus.FOUND)
							.body(ResponseStructure.create(HttpStatus.FOUND.value(),"Users in data base",actor));
	}


	@GetMapping("/find-actors")
	@ResponseBody
	public ResponseEntity<ResponseStructure<Actor>> findActor(@RequestParam int actorId) {
		
		Actor actor = actorService.findActor(actorId);
		
		return ResponseEntity.status(HttpStatus.FOUND)
				.body(ResponseStructure.create(HttpStatus.FOUND.value(),"User Found",actor));
	}
	


	@DeleteMapping("/delete-actors" )
	@ResponseBody
	public ResponseEntity<ResponseStructure<Actor>> deleteActor(@RequestParam int actorId) {
		
		Actor actor = actorService.deleteActor(actorId);
		
		return ResponseEntity.status(HttpStatus.OK)
				.body(ResponseStructure.create(HttpStatus.OK.value(),"User Deleted",actor));
	}

	@PutMapping("/update-actors")
	@ResponseBody
	public ResponseEntity<ResponseStructure<Actor>> deleteActor(@RequestBody Actor actor) {
		
		actor = actorService.updateActor(actor);
		
		return ResponseEntity.status(HttpStatus.OK)
				.body(ResponseStructure.create(HttpStatus.OK.value(),"User Updated",actor));
	}



}
