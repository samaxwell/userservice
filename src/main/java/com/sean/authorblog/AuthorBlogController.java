package com.sean.authorblog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/authors/{authorId}/blogs")
public class AuthorBlogController {
	
	@Autowired
	private AuthorBlogService authorBlogService;

//	@GetMapping
//	public List<UserBlog> findAll() {
//		return userBlogService.findAll();
//	}

	@GetMapping
	public AuthorBlog findBlogsByUserId(@PathVariable("authorId") Long id) {
		return authorBlogService.findBlogsByUserId(id);
	}

}
