package com.rest.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// @RestController : @Controller + @ResponseBody
@RestController
public class HomeController {

	// localhost:8080/rest/users

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public String allUsers() {
		return "all users";
	}

	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
	public String oneUser(@PathVariable String id) {
		return "one user:" + id;
	}

	@RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
	public String deleteUser(@PathVariable String id) {
		return "delete user:" + id;
	}

	@RequestMapping(value = "/users/{id}", method = RequestMethod.POST, headers = { "Content-type=application/json" })
	public String insertUser(@PathVariable String id) {
		return "insert user:" + id;
	}

	@RequestMapping(value = "/users", method = RequestMethod.PUT, headers = { "Content-type=application/json" })
	public String updateUser() {
		return "update user";
	}

}
