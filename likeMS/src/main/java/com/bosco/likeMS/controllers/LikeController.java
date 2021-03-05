package com.bosco.likeMS.controllers;

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

import com.bosco.likeMS.dtos.LikeDTO;
import com.bosco.likeMS.entities.Like;
import com.bosco.likeMS.service.LikeService;

@RestController
public class LikeController {
	
	@Autowired
	LikeService service;
	
	
	public static final Logger LOGGER = LoggerFactory.getLogger(LikeController.class);
	
	@GetMapping(value="test")
	public String test() {
		return "Like Controller Working Very fine!";
	}
	
	@PostMapping(value="add")
	public Like addLike(@RequestBody LikeDTO likeDto) {
		LOGGER.info("=====================Like form post details==================");
		LOGGER.info(likeDto.toString());
		
		return service.addLike(LikeDTO.toLike(likeDto));
	}
	
	@GetMapping(value="likes")
	public Iterable<Like> getAll(){
		return service.getAllLike();
	}
	
	@GetMapping(value="likes/{id}")
	public Optional<Like> getById(@PathVariable("id") int id){
		return service.getLikeById(id);
	}
	
	@GetMapping(value="likes/author")
	public Iterable<Like> getLikeByAuthor(@RequestParam("id") Integer authorId){
		return service.getLikeByAuthor(authorId);
	}
	

}
