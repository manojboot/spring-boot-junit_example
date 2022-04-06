package com.book.neo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LoginServiceTest {
	
	@InjectMocks
	LoginService loginService;
	@Mock
	UserRepository userRepository;
	
	@Test
	public void testGetAllUsers() {
		List<User> list = new ArrayList<>();
		list.add(new User(1,"mahima","gandham","gandham","hyderabad","mahima.g@gmail.com",941118282,"F","welcome1"));
		list.add(new User(2,"monisha","mehta","mmehata","delhi","monish.m@gmail.com",223118282,"F","welcome1"));

	    Mockito.when(userRepository.findAll()).thenReturn(list);
		UserResponse users = loginService.getAllUsers();
		assertNotNull(users);
		assertEquals(2, users.getUsers().size());
		verify(userRepository, times(1)).findAll();
	}
}
