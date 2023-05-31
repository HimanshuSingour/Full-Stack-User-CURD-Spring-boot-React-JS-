package com.angular.learn.users.UserService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angular.learn.users.UserService.DTO.UserDTO;
import com.angular.learn.users.UserService.Service.UserService;
import com.angular.learn.users.UserService.configuration.responseAPI;

@CrossOrigin(origins = "http://localhost:3000")
@RestController


@RequestMapping("/users")
public class Controller {
	
	@Autowired
	private UserService userservice;

	@PostMapping("/create")
	public ResponseEntity<UserDTO> create(@RequestBody UserDTO userdto){
		UserDTO save = userservice.saveUser(userdto);
		return new ResponseEntity<UserDTO>(save , HttpStatus.CREATED);
	}
	
	@PutMapping("/update/{userId}")
	public ResponseEntity<UserDTO> update(UserDTO userdto , @PathVariable Integer userId){
		UserDTO save = userservice.updateUser(userdto, userId);
		return new ResponseEntity<UserDTO>(save , HttpStatus.OK);
	}
	
	
	@GetMapping("/get/{userId}")
	public ResponseEntity<UserDTO> update(@PathVariable Integer userId){
		UserDTO save = userservice.getSingle(userId);
		return new ResponseEntity<UserDTO>(save , HttpStatus.OK);
	}
	
	
	@DeleteMapping("/delet/{userId}")
	public ResponseEntity<responseAPI> delet(@PathVariable Integer userId){
		userservice.deletUser(userId);
		return new ResponseEntity<responseAPI>(HttpStatus.OK);

	}
	
	@GetMapping("/all")
	public ResponseEntity<List<UserDTO>> getAlls(){
		List<UserDTO> all = userservice.getAll();
		return new ResponseEntity<List<UserDTO>>(all , HttpStatus.OK);
	}
	
}
