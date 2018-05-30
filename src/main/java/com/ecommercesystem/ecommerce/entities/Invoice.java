package com.ecommercesystem.ecommerce.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name="invoice")
public class Invoice implements Serializable {
  @Id
  @GeneratedValue
  private int id;

  @NotNull
  private String username;

  @NotNull
  private int quantity;

  @NotNull
  private long total_price;

  protected Invoice(){}

  public Invoice(int id, @NotNull String username, @NotNull int quantity, @NotNull long total_price) {
    this.id = id;
    this.username = username;
    this.quantity = quantity;
    this.total_price = total_price;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public long getTotal_price() {
    return total_price;
  }

  public void setTotal_price(long total_price) {
    this.total_price = total_price;
  }

  @Override
  public String toString() {
    return "Invoice{" +
            "id= " + id +
            ", username= '" + username + '\'' +
            ", quantity= " + quantity +
            ", total_price= " + total_price +
            '}';
  }
}
