package com.bosco.commentMS.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity @EqualsAndHashCode @ToString
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Comment {
	
	@Id @Column(name="comment_id")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer commentId;
	
	@Column(name="quote_id", nullable= false)
	private Integer quoteId;
	
	@Column(name="author_id", nullable= false)
	private Integer authorId;
	
	@Column(name="message", nullable= false)
	private String message;
	
	@Column(name="date_posted", nullable= false)
	private LocalDate datePosted;
	
	
}
