package com.example.demo.request;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PetRequest {

	@NotNull
	@ApiModelProperty(name = "Pet Name", example = "Kitty", required = true)
	private String name;

	@NotNull
	@ApiModelProperty(name = "Type", example = "Cat", required = true)
	private String type;

	@NotNull
	@ApiModelProperty(name = "Age", example = "3", required = true)
	private Integer age;

}
