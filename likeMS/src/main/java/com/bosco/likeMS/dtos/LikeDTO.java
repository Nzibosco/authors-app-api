package com.bosco.likeMS.dtos;

import java.time.LocalDate;

import com.bosco.likeMS.entities.Like;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data @Getter @Setter
public class LikeDTO {
	
	private Integer authorId;
	
	private Integer quoteId;
	
	
	public static Like toLike(LikeDTO likeDto) {
		Like like = new Like();
		
		like.setAuthorId(likeDto.getAuthorId());
		like.setQuoteId(likeDto.getQuoteId());
		like.setDatePosted(LocalDate.now());
		
		return like;
	}

}
