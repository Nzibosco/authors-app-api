package com.bosco.likeMS.repo;

import org.springframework.data.repository.CrudRepository;

import com.bosco.likeMS.entities.Like;

public interface LikeRepo extends CrudRepository<Like, Integer>{
	
	public Iterable<Like> findLikeByAuthorId(Integer authorId);

}
