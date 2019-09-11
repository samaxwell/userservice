package com.sean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sean.author.Author;
import com.sean.author.AuthorRepository;

@Service
public class AuthorService {
	
	@Autowired
	private AuthorRepository authorRepository;

	public Author findAuthorById(Long authorId) {
		// TODO - throw 404 exception
		return authorRepository.findById(authorId).orElseThrow(() -> new RuntimeException("Could not find author with id " + authorId));
	}

}
