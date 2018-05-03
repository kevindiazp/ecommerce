package com.ecommercesystem.ecommerce.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "category")
public class Category {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer ID_category;

  @Column(name = "category_name", length = 20)
  @NotNull
  private String category_name;

  protected Category(){}

  public Category(Integer ID_category, @NotNull String category_name) {
    this.ID_category = ID_category;
    this.category_name = category_name;
  }

  public Integer getID_category() {
    return ID_category;
  }

  public void setID_category(Integer ID_category) {
    this.ID_category = ID_category;
  }

  public String getCategory_name() {
    return category_name;
  }

  public void setCategory_name(String category_name) {
    this.category_name = category_name;
  }
}
