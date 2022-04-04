package com.book.neo;

import java.util.List;

import org.springframework.stereotype.Service;



@Service
public class LoginService {

		private UserRepository userRepository;

		public LoginService(UserRepository userRepository) {
			super();
			this.userRepository = userRepository;
		}

		public UserResponse getAllUsers() {
			
			UserResponse userResponse = new UserResponse();
			List<User> users = userRepository.findAll();
			userResponse.setUsers(users);
			return userResponse;
		}
		
}
