package com.angular.learn.users.UserService.Service;

import java.util.List;

import com.angular.learn.users.UserService.DTO.UserDTO;

public interface UserService {
	
	//create User
	UserDTO saveUser(UserDTO userdto);
		
	//update User
	UserDTO updateUser(UserDTO userdto , Integer userId);
		
	//Delete User
	void deletUser(Integer userId);
		
	//get all Users
	List<UserDTO> getAll();
	
	//get Single User by Id
	
	UserDTO getSingle(Integer userId);
		

}
