package com.sean.init;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sean.author.Author;
import com.sean.author.AuthorRepository;

@Component
public class SeedData {
	
	@Autowired
	private AuthorRepository userRepository;
	
	@PostConstruct
	public void initializeDB() {
		populateUsers();
	}

	private void populateUsers() {
		
		Arrays.asList(new Author("Sean", "Maxwell"), 
					  new Author("Katie", "Maxwell"), 
					  new Author("John", "Doe")).
			forEach(user -> userRepository.save(user));
	}

}
