package com.book.neo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CommonResponse {

	private int statusCode = 200;
	private String statusMessage = "SUCCESS";
	private String statusDescription = "Data Reterieved Successfully";

}
