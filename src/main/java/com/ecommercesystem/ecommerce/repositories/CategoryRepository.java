package com.ecommercesystem.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecommercesystem.ecommerce.entities.Category;
import org.springframework.stereotype.Repository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called categoryRepository
// CRUD refers Create, Read, Update, Delete

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
