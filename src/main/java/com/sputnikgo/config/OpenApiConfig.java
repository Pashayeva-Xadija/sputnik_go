package com.sputnikgo.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.Components;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI sputnikOpenAPI() {
        final String bearerSchemeName = "BearerAuth";

        SecurityScheme bearerScheme = new SecurityScheme()
                .type(SecurityScheme.Type.HTTP)
                .scheme("bearer")
                .bearerFormat("JWT");

        return new OpenAPI()
                .info(new Info()
                        .title("SputnikGo API")
                        .version("v1")
                        .description("Backend API for SputnikGo")
                        .contact(new Contact().name("SputnikGo Backend").email("backend@sputnikgo.local")))
                .components(new Components().addSecuritySchemes(bearerSchemeName, bearerScheme))
                .addSecurityItem(new SecurityRequirement().addList(bearerSchemeName));


    }

    @Bean
    public GroupedOpenApi publicDir() {
        return GroupedOpenApi.builder()
                .group("public-dir")
                .packagesToScan("com.sputnikgo.controller")
                .pathsToMatch("/api/**")
                .build();
    }
}