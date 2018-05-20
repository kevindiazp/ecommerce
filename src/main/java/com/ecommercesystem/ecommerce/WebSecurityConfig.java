package com.ecommercesystem.ecommerce;

import com.ecommercesystem.ecommerce.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
  @Autowired
  UserRepository userRepository;

  @Override
  protected void configure(HttpSecurity http) throws Exception{
    http
            .authorizeRequests()
            .antMatchers("/**").permitAll()
            .and()
            .formLogin().loginPage("/login").permitAll()
            .and()
            .logout().permitAll();
  }

  @Bean
  @Override
  public UserDetailsService userDetailsService(){
    PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
    InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
    manager.createUser(User.withUsername(userRepository.findByUsername("rheza").get().getUsername())
            .password(encoder.encode(userRepository.findByUsername("rheza").get().getPassword()))
            .build());
    return manager;
  }
}
