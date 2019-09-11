package com.sean.authorblog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sean.AuthorService;
import com.sean.author.Author;
import com.sean.author.AuthorRepository;

@Service 
public class AuthorBlogService {
	
	@Autowired
	private AuthorService authorService;
//	private AuthorRepository authorRepository;

	public AuthorBlog findBlogsByUserId(Long id) {
		
		/*
		 * TODO (work):
		 * 		done - verify user exists
		 * 		call blog service for short details
		 * 		build and return authorBlog
		 */
		
		Author author = authorService.findAuthorById(id);
		
		return new AuthorBlogFactory().build(author);
	}


}
