package com.bosco.commentMS.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosco.commentMS.entities.Comment;

import com.bosco.commentMS.repo.CommentRepo;


@Service
public class CommentService {

	@Autowired
	CommentRepo repo;
	
	public Iterable<Comment> getAllComments(){
		return repo.findAll();
	}
	
	public Comment addLike(Comment c) {
		return repo.save(c);
	}
	
	public Optional<Comment> getCommentById(int id){
		return repo.findById(id);
	}

	public Iterable<Comment> getCommentByAuthor(int authorId){
		return repo.findCommentByAuthorId(authorId);
	}
	
	public Iterable<Comment> getCommentByQuote(int quoteId){
		return repo.findCommentByQuoteId(quoteId);
	}
	
}
