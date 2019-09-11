package com.sean.user;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.sean.AuthorService;
import com.sean.author.Author;
import com.sean.author.AuthorRepository;
import com.sean.authorblog.AuthorBlog;
import com.sean.authorblog.AuthorBlogFactory;
import com.sean.authorblog.AuthorBlogService;

@RunWith(MockitoJUnitRunner.class)
public class AuthorBlogServiceTest {
	
	@InjectMocks
	private AuthorBlogService userBlogService;
	
	@Mock
	private AuthorService authorService;

	@Before
	public void setUp() throws Exception {
	}

//	@Test
//	public void testFindAll_returnsListOfUsers() {
//		// Given
//		UserBlog john = new UserBlog("John", "Doe");
//		UserBlog jane = new UserBlog("Jane", "Doe");
//		given(userRepository.findAll())
//			.willReturn(Arrays.asList(john, jane));
//		
//		// When
//		List<UserBlog> users = userService.findAll();
//		
//		// Then
//		assertThat(users)
//			.hasSize(2)
//			.contains(john, jane);
//	}

	@Test
	public void testFindUserById_returnsUser() {
		// Given
		given(authorService.findAuthorById(1L))
			.willReturn(new Author());
		
		// When
		AuthorBlog returnedAuthorBlog = userBlogService.findBlogsByUserId(1L);
		
		// Then
		assertEquals(new AuthorBlogFactory().build(new Author()), returnedAuthorBlog);
	}

}
