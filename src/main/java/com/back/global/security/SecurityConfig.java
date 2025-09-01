package com.back.global.jpa.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    SecurityFilterChain fitlherChain(HttpSecurity http) throws Exception{
        http
                .authorizeHttpRequests((auth -> auth
                        .requestMatchers("/**").permitAll()
                )
                );
        return http.build();
    }
}
