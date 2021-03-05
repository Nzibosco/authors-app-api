package com.bosco.demos.entities;

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
public class Author {
	
	@Id @Column(name="author_id")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer authorId;
	
	@Column(name="first_name", nullable= false)
	private String firstName;
	
	@Column(name="last_name", nullable= false)
	private String lastName;
	
	@Column(name="phone_number", nullable= false)
	private Long phoneNumber;
	
	@Column(name="email_address", nullable= false)
	private String emailAddress;
	
	@Column(name="password", nullable= false)
	private String password;


	
}