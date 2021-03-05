package com.bosco.quotesMS.repo;

import org.springframework.data.repository.CrudRepository;

import com.bosco.quotesMS.entities.Quote;

public interface QuoteRepo extends CrudRepository<Quote, Integer>{

	Iterable<Quote> findQuoteByAuthorId(int authorId);

}
