package com.bosco.demos.dtos;

import com.bosco.demos.entities.Author;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data @Getter @Setter
public class AuthorDTO {
	

	private Integer authorId;
	private String firstName;
	private String lastName;
	private Long phoneNumber;
	private String emailAddress;
	private QuoteDTO[] quotes;
	
	public static AuthorDTO valueOf(Author author) {
		AuthorDTO d = new AuthorDTO();
		
		d.setAuthorId(author.getAuthorId());
		d.setFirstName(author.getFirstName());
		d.setLastName(author.getLastName());
		d.setPhoneNumber(author.getPhoneNumber());
		d.setEmailAddress(author.getEmailAddress());
		
		return d;
	}

}
