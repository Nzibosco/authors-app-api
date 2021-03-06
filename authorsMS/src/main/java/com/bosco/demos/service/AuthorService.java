package com.bosco.demos.service;


import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosco.demos.dtos.AuthorDTO;
import com.bosco.demos.entities.Author;
import com.bosco.demos.repository.AuthorRepo;

@Service
public class AuthorService {
	
	@Autowired
	private AuthorRepo repo;
	
	public Iterable<Author> getAllAuthors(){
		return repo.findAll();
	}
	
	public Optional<Author> getById(int id){
		return repo.findById(id);
	}
	
	@Transactional
	public Author addAuthor(Author author) {
		
		return repo.save(author);
	}
	
	
}
