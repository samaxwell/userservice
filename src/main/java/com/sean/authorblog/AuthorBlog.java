package com.sean.authorblog;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * DTO to hold basic author details as well as
 * a list of their blogs (e.g. title and links)
 */
@Data
@NoArgsConstructor
public class AuthorBlog {
	
	private String firstName;
	private String lastName;
	
	private List<String> blogs;

	public AuthorBlog(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

}
