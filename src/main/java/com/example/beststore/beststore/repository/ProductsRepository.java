package com.example.beststore.beststore.repository;
import com.example.beststore.beststore.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface ProductsRepository extends JpaRepository<Product, Integer> {


}


