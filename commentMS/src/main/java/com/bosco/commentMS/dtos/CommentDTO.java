package com.bosco.commentMS.dtos;

import java.time.LocalDate;

import com.bosco.commentMS.entities.Comment;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data @Getter @Setter
public class CommentDTO {
	
	private Integer authorId;
	private Integer quoteId;
	private String message;
	
	public static Comment toComment(CommentDTO commentDto) {
		Comment c = new Comment();
		
		c.setAuthorId(commentDto.getAuthorId());
		c.setQuoteId(commentDto.getQuoteId());
		c.setMessage(commentDto.getMessage());
		c.setDatePosted(LocalDate.now());
		
		return c;
	}	

}