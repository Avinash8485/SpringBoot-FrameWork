package com.jsp.springboot.actorsdb.service;

import java.util.List;
import java.util.Optional;

import com.jsp.springboot.actorsdb.entity.Actor;

public interface ActorService {
	
	public Actor addActor(Actor actor);

	public List<Actor> findAllActor();

	public Actor findActor(int actorId);

	public Actor deleteActor(int actorId);

	public Actor updateActor(Actor actor);


}
