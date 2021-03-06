package com.bosco.demos.dtos;

import java.time.LocalDate;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data @Setter @Getter
public class QuoteDTO {
	
	private Integer quoteId;
	private Integer authorId;
	private String quoteMessage;
	private LocalDate datePosted;
	

}
