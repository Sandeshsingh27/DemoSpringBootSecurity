package com.sandesh.springbootsecurity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf().disable() // Disable CSRF protection
                .authorizeRequests(authorize -> authorize
                        .requestMatchers("/login/**").permitAll() // Allow all to access /login/**
                        .anyRequest().authenticated()) // All other requests need authentication
                .httpBasic() // Use HTTP Basic Authentication
                .and()
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)); // Stateless session management

        return http.build();
    }
    
    @Bean
    public UserDetailsService userDetailsService() {
        // Define an in-memory user store with a single user
        UserDetails user = User.withDefaultPasswordEncoder()
            .username("Sandesh")
            .password("1234")
            .roles("USER")
            .build();

        return new InMemoryUserDetailsManager(user);
    }
}