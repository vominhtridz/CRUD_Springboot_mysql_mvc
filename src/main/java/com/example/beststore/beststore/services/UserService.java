package com.example.beststore.beststore.services;


import com.example.beststore.beststore.models.User;
import com.example.beststore.beststore.models.UserDto;

public interface UserService {
    User findByUsername(String username);

    User save(UserDto userDto);

}
