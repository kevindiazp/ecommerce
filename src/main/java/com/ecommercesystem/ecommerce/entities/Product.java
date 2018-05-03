package com.ecommercesystem.ecommerce.entities;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.sql.Blob;

@Entity
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer ID_product;

  @NotNull
  private String prodName;

  @NotNull
  private String prodDesc;

  @NotNull
  private float price;

  @NotNull
  private String prodBrand;

  @NotNull
  private Blob prodImage;

//  @Null
//  private int prodRating;

  @ManyToOne
  private Category category;

  protected Product(){}

  public Product(Integer ID_product, @NotNull String prodName, @NotNull String prodDesc, @NotNull float price, @NotNull String prodBrand, @NotNull Blob prodImage, int prodRating, Category category) {
    this.ID_product = ID_product;
    this.prodName = prodName;
    this.prodDesc = prodDesc;
    this.price = price;
    this.prodBrand = prodBrand;
    this.prodImage = prodImage;
//    this.prodRating = prodRating;
    this.category = category;
  }

  public Integer getID_product() {
    return ID_product;
  }

  public void setID_product(Integer ID_product) {
    this.ID_product = ID_product;
  }

  public String getProdName() {
    return prodName;
  }

  public void setProdName(String prodName) {
    this.prodName = prodName;
  }

  public String getProdDesc() {
    return prodDesc;
  }

  public void setProdDesc(String prodDesc) {
    this.prodDesc = prodDesc;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
  }

  public String getProdBrand() {
    return prodBrand;
  }

  public void setProdBrand(String prodBrand) {
    this.prodBrand = prodBrand;
  }

  public Blob getProdImage() {
    return prodImage;
  }

  public void setProdImage(Blob prodImage) {
    this.prodImage = prodImage;
  }

//  public int getProdRating() {
//    return prodRating;
//  }
//
//  public void setProdRating(int prodRating) {
//    this.prodRating = prodRating;
//  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }
}
