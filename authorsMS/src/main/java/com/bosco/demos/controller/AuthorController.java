package com.bosco.demos.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bosco.demos.dtos.AuthorDTO;
import com.bosco.demos.dtos.QuoteDTO;
import com.bosco.demos.entities.Author;
import com.bosco.demos.service.AuthorService;

@RestController
@Validated
public class AuthorController {
	
	@Autowired
	AuthorService service;
	
	@Autowired
	ServiceInstance instances;
	
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
	
	//Get author and his quotes
	@GetMapping(value="author/quotes/{id}")
	public AuthorDTO getAuthorQuotes(@PathVariable("id") int id){
		
		AuthorDTO dto = null;
		Author author= null;
		String quoteMsUrl = "http://localhost:5000/quotes/author/?id="+id;
		
		if(getById(id) != null)
			author = getById(id).get();
		
		ResponseEntity<QuoteDTO[]> quotes = new RestTemplate().getForEntity(quoteMsUrl, QuoteDTO[].class);
		
		LOGGER.info("==============RETRIEVING QUOTE WITH REST TEMPLATE============");
		LOGGER.info(quotes.toString());
		LOGGER.info(author.toString());
		
		dto = AuthorDTO.valueOf(author);
		dto.setQuotes(quotes.getBody());
		
		return dto;
		
	}

}

