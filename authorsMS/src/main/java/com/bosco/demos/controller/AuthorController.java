package com.bosco.demos.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bosco.demos.entities.Author;
import com.bosco.demos.service.AuthorService;

@RestController
@Validated
public class AuthorController {
	
	@Autowired
	AuthorService service;
	
	public static final Logger LOGGER = LoggerFactory.getLogger(AuthorController.class);
	
	@GetMapping(value="test")
	public String test() {
		return "Author Controller Working very fine!";
	}
	
	@PostMapping(value="add")
	public Author addAuthor(@RequestBody Author author) {
		LOGGER.info("=====================Author form post details==================");
		LOGGER.info(author.toString());
		
		return service.addAuthor(author);
	}
	
	@GetMapping(value="authors")
	public Iterable<Author> getAll(){
		return service.getAllAuthors();
	}
	
	@GetMapping(value="author/{id}")
	public Optional<Author> getById(@PathVariable("id") int id){
		return service.getById(id);
	}

}

