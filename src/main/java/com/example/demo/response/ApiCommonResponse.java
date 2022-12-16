package com.example.demo.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@JsonInclude(value = Include.NON_NULL)
public class ApiCommonResponse {

	private String responseCode;

	private String responseMessage;

	private Object data;

	public ApiCommonResponse() {
		this.responseCode = "200";
		this.responseMessage = "success";
	}
	
	public ApiCommonResponse(Object data) {
		this.responseCode = "200";
		this.responseMessage = "success";
		this.data = data;
	}

}
