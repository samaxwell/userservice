package com.sean.authorblog;

import com.sean.author.Author;

public class AuthorBlogFactory {

	public AuthorBlog build(Author author) {
		// TODO (work): add blog short views
		AuthorBlog authorBlog = new AuthorBlog();
		authorBlog.setFirstName(author.getFirstName());
		authorBlog.setLastName(author.getLastName());
		return authorBlog;
	}

}
