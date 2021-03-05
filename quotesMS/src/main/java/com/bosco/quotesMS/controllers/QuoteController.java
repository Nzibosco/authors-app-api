package com.bosco.quotesMS.controllers;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bosco.quotesMS.dtos.QuoteDTO;
import com.bosco.quotesMS.entities.Quote;
import com.bosco.quotesMS.service.QuoteService;

@RestController
public class QuoteController {

	@Autowired
	QuoteService service;
	
	
	public static final Logger LOGGER = LoggerFactory.getLogger(QuoteController.class);
	
	@GetMapping(value="test")
	public String test() {
		return "Quote Controller Working Very fine!";
	}
	
	@PostMapping(value="add")
	public Quote addAuthor(@RequestBody QuoteDTO quoteDto) {
		LOGGER.info("=====================Author form post details==================");
		LOGGER.info(quoteDto.toString());
		
		return service.addQuote(QuoteDTO.toQuote(quoteDto));
	}
	
	@GetMapping(value="quotes")
	public Iterable<Quote> getAll(){
		return service.getAllQuotes();
	}
	
	@GetMapping(value="quotes/{id}")
	public Optional<Quote> getById(@PathVariable("id") int id){
		return service.getQuoteById(id);
	}
	
	@GetMapping(value="quotes/author")
	public Iterable<Quote> getQuotesByAuthor(@RequestParam("id") Integer authorId){
		return service.getQuoteByAuthor(authorId);
	}
	

}
