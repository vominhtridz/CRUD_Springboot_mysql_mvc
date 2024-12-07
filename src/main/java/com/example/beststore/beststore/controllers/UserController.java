package com.example.beststore.beststore.controllers;

import com.example.beststore.beststore.models.Product;
import com.example.beststore.beststore.models.User;
import com.example.beststore.beststore.repository.ProductsRepository;
import com.example.beststore.beststore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {
    @Autowired
    UserRepository userRepo;
    private ProductsRepository repo;
    @PostMapping("/process_register")
    public String processRegister(User user) {
        // Password encoding
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);

        // Save the user to the database
        userRepo.save(user);
        // Redirect to the login page after successful registration
        return "redirect:login";
    }
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "products/register";
    }
    @GetMapping("/login1")
    public String showLoginForm() {
        return "products/login";
    }
    @GetMapping("/api/products")
    public List<Product> getAllProducts() {
        return repo.findAll();
    }
}
