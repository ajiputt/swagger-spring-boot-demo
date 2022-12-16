package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.request.OwnerRequest;
import com.example.demo.response.ApiCommonResponse;
import com.example.demo.response.OwnerResponse;

import io.swagger.annotations.ApiImplicitParam;

@RestController
@RequestMapping("/owner")
public class OwnerController {

	@GetMapping
	public ResponseEntity<?> getOwner() {
		return ResponseEntity.ok(new ApiCommonResponse(OwnerResponse.builder()
				.address("Jalan ABC No.123")
				.email("test@abc.com")
				.firstName("Sugeng")
				.lastName("For 2023")
				.build()));
	}
	
	@PostMapping
	@ApiImplicitParam(name = "Authorization", value = "Access Token", required = true, 
		allowEmptyValue = false, paramType = "header", dataTypeClass = String.class, example = "Bearer access_token")
	public ResponseEntity<?> postOwner(@RequestBody @Valid OwnerRequest request) {
		return ResponseEntity.ok(new ApiCommonResponse());
	}

}
