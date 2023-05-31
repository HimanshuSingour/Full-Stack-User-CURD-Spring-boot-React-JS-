package com.angular.learn.users.UserService.ExceptionHandling;

public class ResourceNotFoundException extends RuntimeException{
	
	public ResourceNotFoundException() {
		super();
	}
	
	public ResourceNotFoundException(String msg) {
		super(msg);
	}	
}
