package com.teoriejava.site_teorie.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorize -> authorize
                        // Rute permise pentru oricine (fizic sau neautentificat)
                        .requestMatchers("/", "/lectie/**", "/css/**","/downloads/**", "/js/**").permitAll()
                        // Orice altă rută (cum ar fi adăugare/ștergere/editare) cere rolul de ADMIN
                        .anyRequest().authenticated()
                )
                .formLogin(form -> form
                        .defaultSuccessUrl("/", true) // Unde te duce după un login reușit
                        .permitAll()
                )
                .logout(logout -> logout
                        .logoutSuccessUrl("/") // Unde te duce după logout
                        .permitAll()
                );

        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        // Creăm un utilizator normal
        UserDetails regularUser = User.withDefaultPasswordEncoder()
                .username("user")
                .password("parola123")
                .roles("USER")
                .build();

        // Creăm un administrator
        UserDetails adminUser = User.withDefaultPasswordEncoder()
                .username("admin")
                .password("admin123")
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(regularUser, adminUser);
    }
}