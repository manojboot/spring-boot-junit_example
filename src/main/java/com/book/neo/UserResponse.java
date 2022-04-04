package com.book.neo;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse extends CommonResponse {

	private List<User> users;
}
