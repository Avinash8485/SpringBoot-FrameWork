package com.jsp.springboot.actorsdb.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.springboot.actorsdb.entity.Actor;
import com.jsp.springboot.actorsdb.exception.ActorsNotFoundException;
import com.jsp.springboot.actorsdb.exception.UserNotFoundByIdException;
import com.jsp.springboot.actorsdb.repository.ActorRepository;
import com.jsp.springboot.actorsdb.service.ActorService;

@Service
public class ActorServiceImpl implements ActorService{
	
	@Autowired
	private ActorRepository actorRepository;

	@Override
	public Actor addActor(Actor actor) {
		return actorRepository.save(actor);
	}

	@Override
	public List<Actor> findAllActor() {
		
		List<Actor> actors= actorRepository.findAll();
		
		if(actors.isEmpty())
		     throw new ActorsNotFoundException("Failed tp found the Actors");
		else
			return actors;
	}

	@Override
	public Actor findActor(int actorId) {
		
		Optional<Actor> optional =  actorRepository.findById(actorId);
		
		if(optional.isPresent()) {
			Actor actor = optional.get();
				
		return actor;
		}
		else {
			throw new UserNotFoundByIdException("Failed to update Actor");
		}
		
	}

	@Override
	public Actor deleteActor(int actorId) {
		
		Optional<Actor> optional =  actorRepository.findById(actorId);
		
		if(optional.isPresent()) {
			Actor actor = optional.get();
			
			actorRepository.delete(actor);
			
		return actor;
		}
		else {
			throw new RuntimeException("Failed to delete Actor");
		}
	}

	@Override
	public Actor updateActor(Actor actor) {
		
		Optional<Actor> optional =  actorRepository.findById(actor.getActorId());
		
		if(optional.isPresent()) {
			Actor exActor = optional.get();
			exActor.setActorName(exActor.getActorName());
			exActor.setActorAge(exActor.getActorAge());
			exActor.setActorIndstry(exActor.getActorIndstry());
			exActor.setActorNationality(exActor.getActorNationality());
			
			return actorRepository.save(exActor);
			
			
			}else {
				throw new RuntimeException("Failed to update Actor");
			}

		
		
	}
	

}
