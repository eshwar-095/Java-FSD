package com.demo.main;

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

import com.demo.main.entity.User;
import com.demo.main.service.UserService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/user")
public class UserController {
	
	@Autowired
	UserService userService; 
	
	@GetMapping("/")
	public ResponseEntity<List<User>> getAll()
	{
		List<User> user = userService.getAllUser();
		return new ResponseEntity<>(user, HttpStatus.OK);
	}
	

	@GetMapping("/{id}")
	public User getById(@PathVariable Long id)
	{
		return userService.getUserById(id);	
	}
	
	
	
	@PostMapping("/")
	public ResponseEntity<User> addAadhar(@RequestBody User user)
	{
		User addedUser = userService.addUser(user);
		return new ResponseEntity<>(addedUser, HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<User> updateAadhars(@PathVariable Long id,@RequestBody User user)
	{
		User updatedUser = userService.updateUser(id,user);
		return new ResponseEntity<>(updatedUser, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<User> deleteAadhars(@PathVariable Long id)
	{
		userService.deleteUser(id);
		return new ResponseEntity<User>(HttpStatus.OK);
	}
	
	
	
	
	

}
