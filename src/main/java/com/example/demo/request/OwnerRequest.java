package com.example.demo.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class OwnerRequest {
	
	@NotNull
	@Email
	@ApiModelProperty(example = "test@gmail.com", required = true)
	private String email;
	
	@NotNull
	@ApiModelProperty(example = "sugeng", required = true)
	private String firstName;
	
	@ApiModelProperty(example = "for 2023", required = false)
	private String lastName;

	@ApiModelProperty(example = "jalan abc no 123", required = true)
	private String address;

}
