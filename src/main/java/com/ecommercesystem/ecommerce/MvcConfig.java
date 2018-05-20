package com.ecommercesystem.ecommerce;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {


  @Override
  public void addViewControllers(ViewControllerRegistry registry) {
    registry.addViewController("/").setViewName("index");
    registry.addViewController("/search_results").setViewName("static/SearchResult/search_result");
    registry.addViewController("/item_details").setViewName("static/ItemDetails/item_details");
    registry.addViewController("/login").setViewName("/login");
    registry.addViewController("/cart").setViewName("/cart");
  }

  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler(
            "/**",
            "/ItemDetails/**",
            "/SearchResult/**"
    ).addResourceLocations(
            "classpath:/static/ItemDetails",
            "classpath:/static/",
            "classpath:/static/SearchResult");
  }
}
