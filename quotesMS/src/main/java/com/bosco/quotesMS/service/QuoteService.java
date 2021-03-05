package com.bosco.quotesMS.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosco.quotesMS.entities.Quote;
import com.bosco.quotesMS.repo.QuoteRepo;

@Service
public class QuoteService {
	
	@Autowired
	QuoteRepo repo;
	
	public Iterable<Quote> getAllQuotes(){
		return repo.findAll();
	}
	
	public Quote addQuote(Quote q) {
		return repo.save(q);
	}
	
	public Optional<Quote> getQuoteById(int id){
		return repo.findById(id);
	}

	public Iterable<Quote> getQuoteByAuthor(int authorId){
		return repo.findQuoteByAuthorId(authorId);
	}
	
}
