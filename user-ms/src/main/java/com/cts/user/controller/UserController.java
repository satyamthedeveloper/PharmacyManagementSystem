package com.cts.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cts.user.services.UserInterface;

@RestController
public class UserController {

	@Autowired
	private UserInterface userInterface;
}
