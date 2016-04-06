package com.spring.rest.demo.service;

import java.util.List;

import com.spring.rest.demo.model.UserModel;

public interface UserService {

	List<UserModel> findAllUsers();

}
