package com.ecommercesystem.ecommerce.repositories;

import com.ecommercesystem.ecommerce.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
  List<Users> findByUsernameAndPassword(String username, String password);
  Optional<Users> findByUsername(String username);
 }
