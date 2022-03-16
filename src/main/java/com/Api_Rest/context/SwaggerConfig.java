package com.Api_Rest.context;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration

@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api(){
       return new Docket(DocumentationType.SWAGGER_2)
               .select().apis(RequestHandlerSelectors.basePackage("com.Api_Rest.controller"))
               .paths(PathSelectors.any())
               .build().apiInfo(apiInfo());
    }

    private ApiInfo apiInfo(){
    return new ApiInfo(
            "TODO SOBRE LA API",
            "Es una Api para la gestión de tareas personales",
            "v1",
            "TERMINOS DE SERICIO",
            new Contact("Ricardo",
                    "https://www.linkedin.com/in/joserbernalleon/",
                    "josericardobl1@outlook.com"),"License of API", "API license URL",
            Collections.emptyList());
    }
}
