package com.bosco.likeMS.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosco.likeMS.entities.Like;
import com.bosco.likeMS.repo.LikeRepo;


@Service
public class LikeService {

	@Autowired
	LikeRepo repo;
	
	public Iterable<Like> getAllLike(){
		return repo.findAll();
	}
	
	public Like addLike(Like l) {
		return repo.save(l);
	}
	
	public Optional<Like> getLikeById(int id){
		return repo.findById(id);
	}

	public Iterable<Like> getLikeByAuthor(int authorId){
		return repo.findLikeByAuthorId(authorId);
	}
}
