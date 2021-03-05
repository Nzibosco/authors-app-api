package com.bosco.demos.repository;

import org.springframework.data.repository.CrudRepository;

import com.bosco.demos.entities.Author;

public interface AuthorRepo extends CrudRepository<Author, Integer> {

}
