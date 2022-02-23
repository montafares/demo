package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/user")
public class UserControleur {
	
	List<String> listOfNames;
@GetMapping("/hello")
public String dattaa() {
	return "hi hello ";
}
@PostMapping("/ajout")
public List<String> ajouter(String name) {
	listOfNames.add(name);
	return listOfNames;
	}
@GetMapping("/list")
public List<String> list() {
	return listOfNames;
}
}
