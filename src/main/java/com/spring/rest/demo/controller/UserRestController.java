package com.spring.rest.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.demo.model.UserModel;
import com.spring.rest.demo.service.UserService;

@RestController
public class UserRestController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/user/", method = RequestMethod.GET)
	public ResponseEntity<List<UserModel>> listAllUsers() {
		List<UserModel> users = userService.findAllUsers();
		if (users.isEmpty()) {
			return new ResponseEntity<List<UserModel>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<UserModel>>(users, HttpStatus.OK);
	}

}
