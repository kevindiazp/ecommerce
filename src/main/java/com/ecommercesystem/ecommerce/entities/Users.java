package com.ecommercesystem.ecommerce.entities;

import org.springframework.scheduling.support.SimpleTriggerContext;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "user")
public class Users{
  @Id
  @NotNull
  private String username;
  @NotNull
  private String password;
  @NotNull
  private String role;

  protected Users(){}

  public Users(@NotNull String username, @NotNull String password, @NotNull String role) {
    this.username = username;
    this.password = password;
    this.role = role;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  @Override
  public String toString(){
    return "user{"+
            "username='" + username + '\'' +
            ", password='" + password + '\'' +
            ", role='" + role+ '\'' +
            '}';
    }
}