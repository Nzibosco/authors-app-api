package com.bosco.commentMS.controllers;

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

import com.bosco.commentMS.dtos.CommentDTO;
import com.bosco.commentMS.entities.Comment;
import com.bosco.commentMS.service.CommentService;

@RestController
public class CommentController {
	
	@Autowired
	CommentService service;
	
	
	public static final Logger LOGGER = LoggerFactory.getLogger(CommentController.class);
	
	@GetMapping(value="test")
	public String test() {
		return "Comment Controller Working Very fine!";
	}
	
	@PostMapping(value="add")
	public Comment addComment(@RequestBody CommentDTO commentDto) {
		LOGGER.info("=====================Comment form post details==================");
		LOGGER.info(commentDto.toString());
		
		return service.addLike(CommentDTO.toComment(commentDto));
	}
	
	@GetMapping(value="comments")
	public Iterable<Comment> getAll(){
		return service.getAllComments();
	}
	
	@GetMapping(value="comment/{id}")
	public Optional<Comment> getById(@PathVariable("id") int id){
		return service.getCommentById(id);
	}
	
	@GetMapping(value="comment/author")
	public Iterable<Comment> getCommentByAuthor(@RequestParam("id") Integer authorId){
		return service.getCommentByAuthor(authorId);
	}
	
	@GetMapping(value="comment/quote")
	public Iterable<Comment> getCommentByQuote(@RequestParam("id") Integer quoteId){
		return service.getCommentByQuote(quoteId);
	}
	

}
