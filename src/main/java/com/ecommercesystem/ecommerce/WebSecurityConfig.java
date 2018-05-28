package com.ecommercesystem.ecommerce;

import com.ecommercesystem.ecommerce.entities.Users;
import com.ecommercesystem.ecommerce.repositories.UsersRepository;
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

import java.util.List;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
  @Autowired
  UsersRepository usersRepository;

  @Override
  protected void configure(HttpSecurity http) throws Exception{
    http.authorizeRequests().antMatchers("/").permitAll()
            .and()
            .authorizeRequests().antMatchers("/cart").hasRole("user")
            .and()
            .authorizeRequests().antMatchers("/profile").hasRole("user")
            .and()
            .formLogin().loginPage("/login").permitAll()
            .and()
            .logout().logoutUrl("/logout").permitAll()
            .and()
            .csrf().disable();
  }

  @Bean
  public UserDetailsService userDetailsService(){
    PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
    InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
    List<Users> users= usersRepository.findAll();
    for (Users user : users) {
      manager.createUser(User.withUsername(user.getUsername())
              .password(encoder.encode(user.getPassword()))
              .roles(user.getRole())
              .build());
    }
//    manager.createUser(Users.withUsername("rheza").password(encoder.encode("password123")).roles("user").build());
//    manager.createUser(Users.withUsername("kevin").password(encoder.encode("terserah")).roles("user").build());
    return manager;
  }
}
