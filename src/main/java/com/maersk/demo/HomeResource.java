package com.maersk.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
	@Autowired
	PersonRepository repo;
	
	@GetMapping("/persons")
	public List<Person> index() {
		List<Person> persons=(List<Person>) repo.findAll();
		System.out.println(persons);
		return persons;
	}
}
