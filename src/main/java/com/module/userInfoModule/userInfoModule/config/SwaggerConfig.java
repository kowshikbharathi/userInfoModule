package com.module.userInfoModule.userInfoModule.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

/**
 * SwaggerConfig service is used to generate EndPoint Detail Documentation.
 * @author Kowshik Bharathi M
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("Health Care Management").apiInfo(apiInfo()).select()
				.paths(regex("/Users.*")).build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Health Care Management User Profile")
				.description("Detailed End Point Documentation for  Users Rest API")
				//.termsOfServiceUrl("")
				.license("HealthCare")
				//.licenseUrl("")
				.version("1.0").build();
	}
	
}
