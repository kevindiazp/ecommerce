package com.ecommercesystem.ecommerce.entities;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.sql.Blob;

@Entity
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer iDProduct;

  @NotNull
  private String prodName;

  @NotNull
  private String prodDesc;

  @NotNull
  private Integer price;

  @NotNull
  private String prodBrand;

  @NotNull
  private String prodImage;

  @ManyToOne
  private Category category;

  protected Product(){}

  public Product(Integer iDProduct, @NotNull String prodName, @NotNull String prodDesc, @NotNull Integer price, @NotNull String prodBrand, @NotNull String prodImage, Category category) {
    this.iDProduct = iDProduct;
    this.prodName = prodName;
    this.prodDesc = prodDesc;
    this.price = price;
    this.prodBrand = prodBrand;
    this.prodImage = prodImage;
    this.category = category;
  }

  public Integer getiDProduct() {
    return iDProduct;
  }

  public void setiDProduct(Integer IDProduct) {
    this.iDProduct = iDProduct;
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

  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public String getProdBrand() {
    return prodBrand;
  }

  public void setProdBrand(String prodBrand) {
    this.prodBrand = prodBrand;
  }

  public String getProdImage() {
    return prodImage;
  }

  public void setProdImage(String prodImage) {
    this.prodImage = prodImage;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }
}
