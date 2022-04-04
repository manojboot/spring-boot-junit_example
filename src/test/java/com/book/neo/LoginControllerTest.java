package com.book.neo;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

@RunWith(MockitoJUnitRunner.class)
public class LoginControllerTest {

	@InjectMocks
	LoginController loginController;
	
	@Mock
	LoginService loginService;
	
	
	@Test
	public void testGetAllUsers() {
	    Mockito.when(loginService.getAllUsers()).thenReturn(new UserResponse());
		ResponseEntity<UserResponse> users = loginController.getAllUsers();
		assertNotNull(users);
		assertEquals(200, users.getStatusCodeValue());
	}
	
}
