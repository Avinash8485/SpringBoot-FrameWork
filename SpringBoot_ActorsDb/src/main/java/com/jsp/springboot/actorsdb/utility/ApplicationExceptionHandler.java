package com.jsp.springboot.actorsdb.utility;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jsp.springboot.actorsdb.exception.ActorsNotFoundException;
import com.jsp.springboot.actorsdb.exception.UserNotFoundByIdException;

@RestControllerAdvice
public class ApplicationExceptionHandler {



	@ExceptionHandler
	@ResponseBody
	public ErrorStructure handleUserNotFoundById(UserNotFoundByIdException e) {

		//		Map<String,Object> response = new HashMap<String,Object>();
		//		response.put("status",404);
		//		response.put("message", e.getMessage());
		//		response.put("rootcause","user not found by the given Id");

		return ErrorStructure.cause(HttpStatus.NOT_FOUND.value(),e.getMessage(), "user not found by the given Id");
	}

	@ExceptionHandler
	@ResponseBody
	public ErrorStructure handleUserNotFoundById(ActorsNotFoundException e) {

		//		Map<String,Object> response = new HashMap<String,Object>();
		//		response.put("status",404);
		//		response.put("message", e.getMessage());
		//		response.put("rootcause","Actors not found");

		return ErrorStructure.cause(HttpStatus.NOT_FOUND.value(),e.getMessage(), "Actors not found");

	}
}
