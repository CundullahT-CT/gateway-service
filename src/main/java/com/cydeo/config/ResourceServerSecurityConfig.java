package com.cydeo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
public class ResourceServerSecurityConfig {

    @Bean
    public SecurityWebFilterChain configureResourceServer(ServerHttpSecurity httpSecurity) throws Exception {

        return httpSecurity
                .authorizeExchange().pathMatchers("/actuator/health/**").permitAll()
                .pathMatchers(HttpMethod.GET, "/webjars/**").permitAll()
                .pathMatchers(HttpMethod.GET, "/swagger-ui.html").permitAll()
                .pathMatchers(HttpMethod.GET, "/swagger-resources/**").permitAll()
                .pathMatchers(HttpMethod.GET, "/v3/api-docs/**").permitAll()
                .pathMatchers(HttpMethod.GET, "/user-service/v3/api-docs/**").permitAll()
                .pathMatchers(HttpMethod.GET, "/project-service/v3/api-docs/**").permitAll()
                .pathMatchers(HttpMethod.GET, "/task-service/v3/api-docs/**").permitAll()
                .anyExchange().authenticated()
                .and()
                .oauth2ResourceServer().jwt().and()
                .and().build();

    }

}
