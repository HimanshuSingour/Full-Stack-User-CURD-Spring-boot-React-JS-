package com.angular.learn.users.UserService.ServiceImple;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angular.learn.users.UserService.DTO.UserDTO;
import com.angular.learn.users.UserService.Entities.User;
import com.angular.learn.users.UserService.ExceptionHandling.ResourceNotFoundException;
import com.angular.learn.users.UserService.Repositories.Repositories;
import com.angular.learn.users.UserService.Service.UserService;

@Service
public class UserServiceImple implements UserService {
	
	@Autowired
	private Repositories repositories;

	@Override
	public UserDTO saveUser(UserDTO userdto) {
		
		User newUser = dtoToUser(userdto);
		User saveuser = repositories.save(newUser);
		UserDTO userD = userToDTO(saveuser);
		return userD;
	}

	@Override
	public UserDTO updateUser(UserDTO userdto, Integer userId) {
		
		User findUser = repositories.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("resource Not found"));
		
		findUser.setDeveloperName(userdto.getDeveloperName());
		findUser.setDeveloperRoles(userdto.getDeveloperRoles());
		findUser.setEmail(userdto.getEmail());
		findUser.setLocation(userdto.getLocation());
		findUser.setSalary(userdto.getSalary());

		
		UserDTO convert = userToDTO(findUser);
		return convert;
	}

	@Override
	public void deletUser(Integer userId) {
		
		User findUser = repositories.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("resource Not found"));
		
		repositories.delete(findUser);
	}

	@Override
	public List<UserDTO> getAll() {
		
		List<User> all = repositories.findAll();
		List<UserDTO> sendall = all.stream().map((e) -> userToDTO(e)).collect(Collectors.toList());
		return sendall;
	}
	
	@Override
	public UserDTO getSingle(Integer userId) {
		
		User findUser = repositories.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("resource Not found"));
		
		UserDTO user = userToDTO(findUser);
		return user;
	}
	
//	conversion 
	
	public UserDTO userToDTO(User user) {
		
		UserDTO u = new UserDTO();
		u.setDeveloperName(user.getDeveloperName());
		u.setDeveloperRoles(user.getDeveloperRoles());
		u.setEmail(user.getEmail());
		u.setLocation(user.getLocation());
		u.setSalary(user.getSalary());
		
		return u;
		
	}
	
	public User dtoToUser(UserDTO userdto) {
		
		User u = new User();
		u.setDeveloperName(userdto.getDeveloperName());
		u.setDeveloperRoles(userdto.getDeveloperRoles());
		u.setEmail(userdto.getEmail());
		u.setLocation(userdto.getLocation());
		u.setSalary(userdto.getSalary());
		
		return u;
		
	}

	

}
