package com.book.neo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/insta/launch/api/v1")
public class LoginController {

	private LoginService loginService;

	public LoginController(LoginService loginService) {
		super();
		this.loginService = loginService;
	}
	
	@GetMapping(value = "/users")
	public ResponseEntity<UserResponse> getAllUsers() {
		UserResponse users = loginService.getAllUsers();
		return ResponseEntity.ok(users);
	}
	
	@GetMapping(value = "/hello")
	public ResponseEntity<String> hello() {
		String users = "hellow";
		return ResponseEntity.ok(users);
	}
}
