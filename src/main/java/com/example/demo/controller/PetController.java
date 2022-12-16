package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.request.PetRequest;
import com.example.demo.response.ApiCommonResponse;
import com.example.demo.response.PetResponse;

import io.swagger.annotations.ApiImplicitParam;

@RestController
@RequestMapping("/pet")
public class PetController {

	@GetMapping
	public ResponseEntity<?> getPets() {
		return ResponseEntity.ok(new ApiCommonResponse(PetResponse.builder().age(11).name("Tom").type("cat").build()));
	}

	@PostMapping
	@ApiImplicitParam(name = "Authorization", value = "Access Token", required = true, allowEmptyValue = false, paramType = "header", dataTypeClass = String.class, example = "Bearer access_token")
	public ResponseEntity<?> postPets(@RequestBody @Valid PetRequest request) {
		return ResponseEntity.ok(new ApiCommonResponse());
	}

}
