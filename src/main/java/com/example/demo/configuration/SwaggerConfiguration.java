package com.example.demo.configuration;

import static com.google.common.collect.Lists.newArrayList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

	@Bean
	public Docket docket() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("owner collection").apiInfo(this.apiInfo()).select()
				.apis(RequestHandlerSelectors.any()).paths(PathSelectors.regex("/owner")).build();
	}

	@Bean
	public Docket docket2() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("pet collection").apiInfo(this.apiInfo()).select()
				.apis(RequestHandlerSelectors.any()).paths(PathSelectors.ant("/pet/**")).build().apiInfo(apiInfo())
	            .useDefaultResponseMessages(false)
	            .globalResponses(HttpMethod.GET, newArrayList(
	                new ResponseBuilder().code("500")
	                    .description("500 message").build(),
	                new ResponseBuilder().code("403")
	                    .description("Forbidden!!!!!").build()
	            		));
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Telkomsel API").description("Telkomsel Sandbox API Spring Boot")
				.termsOfServiceUrl("https://www.telkomsel.com").license("API License")
				.licenseUrl("https://www.telkomsel.com").version("1.0").build();
	}

}
