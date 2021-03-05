package com.bosco.commentMS.repo;

import org.springframework.data.repository.CrudRepository;

import com.bosco.commentMS.entities.Comment;

public interface CommentRepo extends CrudRepository<Comment, Integer>{
	
	public Iterable<Comment> findCommentByAuthorId(Integer authorId);
	public Iterable<Comment> findCommentByQuoteId(Integer quoteId);

}
