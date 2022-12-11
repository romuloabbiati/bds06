package com.devsuperior.movieflix.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.movieflix.dto.UserDTO;
import com.devsuperior.movieflix.entities.User;
import com.devsuperior.movieflix.services.AuthService;
import com.devsuperior.movieflix.services.UserService;

@RestController
@RequestMapping(path = "/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private AuthService authService;
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<UserDTO> findById(@PathVariable Long id) {
		UserDTO userDTO = userService.findById(id);
		return ResponseEntity.ok(userDTO);
	}
	
	@PreAuthorize("hasAnyRole('MEMBER', 'VISITOR')")
	@GetMapping(path = "/profile")
	public ResponseEntity<UserDTO> getUserProfile() {
		User user = authService.authenticated();
		UserDTO userDTO = userService.findById(user.getId());
		return ResponseEntity.ok(userDTO);
	}
	
}
