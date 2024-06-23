package com.example.springinitializr.config;

/*
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.HashSet;
import java.util.Set;

@ConditionalOnProperty(name = "swagger.enabled", havingValue = "true")
@Configuration
@EnableSwagger2
public class SwaggerConfigurer {

	public static final Set<String> produces = new HashSet<>();

	{
		produces.add("application/json");
	}

	*/
/*@Bean
	public Docket createAdminAPIDocument() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo("运营管理接口", "运营管理接口")).produces(produces).groupName("运营管理接口").select()
				.apis(RequestHandlerSelectors.basePackage("com.zhongzhiiov.charging.admin")).paths(PathSelectors.regex("/charging/admin/.*")).build()
				.globalOperationParameters(getAdminGlobalParameters());
	}*//*


	*/
/*private List<Parameter> getAdminGlobalParameters() {
		ParameterBuilder token = new ParameterBuilder();
		List<Parameter> params = new ArrayList<>();
		token.name("Authorization") //
				.description("请求Header。请求接口需要携带access token。access token的格式：Bearer ${access_token}") //
				.modelRef(new ModelRef("string")) //
				.parameterType("header") // 这个参数的类型
				.required(true) // 是否必填
				.build();
		params.add(token.build());

		return params;
	}*//*


	@Bean
	public Docket createMpAPIDocument() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo("接口文档", "接口文档")).produces(produces).groupName("接口文档").select()
				.apis(RequestHandlerSelectors.basePackage("com.example")).paths(PathSelectors.regex("/applet/test/.*")).build();
	}

	private ApiInfo apiInfo(String title, String desc) {
		return new ApiInfoBuilder().title(title).description(desc).termsOfServiceUrl("").version("v1.0.0").build();
	}

}*/
