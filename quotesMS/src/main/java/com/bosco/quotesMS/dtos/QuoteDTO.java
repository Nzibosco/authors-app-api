package com.bosco.quotesMS.dtos;

import java.time.LocalDate;


import com.bosco.quotesMS.entities.Quote;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Data
public class QuoteDTO {
	

	private Integer authorId;
	
	private String quoteMessage;
	
	
	public static Quote toQuote(QuoteDTO dto) {
		Quote q = new Quote();
		q.setAuthorId(dto.getAuthorId());
		q.setQuoteMessage(dto.getQuoteMessage());
		q.setDatePosted(LocalDate.now());
		
		return q;
	}

}
