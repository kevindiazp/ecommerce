package com.ecommercesystem.ecommerce.entities;

import com.ecommercesystem.ecommerce.entities.Product;
public class Cart {

  private Product product;
  private int quantity;
  private long amount;

  public Cart(){}

  public Cart(Product product) {
    this.product = product;
    this.quantity = 1;
    this.amount = this.product.getPrice();
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
    this.amount = this.product.getPrice() * this.quantity;
  }

  public void incrementQuantity(){
    this.quantity++;
    this.amount = this.product.getPrice() * this.quantity;
  }

  public void decrementQuantity(){
    this.quantity--;
    this.amount = this.product.getPrice() * this.quantity;
  }

  public long getAmount() {
    return amount;
  }

  public void setAmount(long amount) {
    this.amount = amount;
  }

  @Override
  public String toString() {
    return "Cart" +
            "product= " + product +
            ", quantity= " + quantity +
            ", amount= " + amount +
            '}';
  }
}
