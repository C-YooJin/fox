package com.deepjin.fox.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("DeepJin Swagger project")
                .description("Swagger UI를 활용한 rest api test 전용 페이지")
                .license("Deepjin").licenseUrl("https://deep-jin.tistory.com/").version("1")
                .build();
    }

    @Bean
    public Docket swaggerApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(this.apiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("com.deepjin.fox.controller"))
                .paths(PathSelectors.ant("/api/**"))
                .build()
                .useDefaultResponseMessages(false); // 기본으로 세팅되는 200, 401, 403, 404 메시지를 표시하지 않음
    }
}
