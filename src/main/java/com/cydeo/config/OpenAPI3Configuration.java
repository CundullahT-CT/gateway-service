package com.cydeo.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class OpenAPI3Configuration {

    @Bean
    public OpenAPI gatewayOpenApi() {

        return new OpenAPI().info(new Info().title("Ticketing Application Microservices API Docs ")
                .description("Swagger Documentations for all the Microservices in Ticketing Application")
                .version("v1.0")
                .contact(new Contact()
                        .name("Ticketing Application Development Team")
                        .email("support@ticketingappcontact.com")));

    }

}
