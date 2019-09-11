package com.sean.user;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.sean.authorblog.AuthorBlogService;

@RunWith(SpringRunner.class)
@WebMvcTest
public class AuthorBlogControllerTest {
	
	
	@Autowired
	MockMvc mvc;
	
	@MockBean
	private AuthorBlogService authorBlogService;

	@Before
	public void setUp() throws Exception {

	}
	
//	@Test
//	public void givenRequestToFindAll_thenAStatusCodeOf200IsReturned() throws Exception {
//		given(userService.findAll()).willReturn(new ArrayList<>());
//		
//		MockHttpServletResponse response = 
//				mvc.perform(get("/v1/users")
//				.contentType(MediaType.APPLICATION_JSON))
//				.andReturn().getResponse();
//		
//		assertEquals(HttpStatus.OK.value(), response.getStatus());
//	}
	
	// TODO (test) - As above, but should test content is sent back i.e. List of users

	@Test
	public void givenRequestToFindUserById_thenAUserIsReturned() throws Exception {
		given(authorBlogService.findBlogsByUserId(1L)).willReturn(null);

		mvc.perform(get("/v1/authors/1/blogs")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());
	}


}
