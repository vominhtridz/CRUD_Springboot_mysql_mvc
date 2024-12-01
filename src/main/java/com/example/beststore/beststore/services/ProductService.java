package com.example.beststore.beststore.services;


import com.example.beststore.beststore.models.Product;
import com.example.beststore.beststore.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductsRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
