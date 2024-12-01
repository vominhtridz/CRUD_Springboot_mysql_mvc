package com.example.beststore.beststore.repository;
import com.example.beststore.beststore.models.User;
import com.example.beststore.beststore.models.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserRepository extends JpaRepository<User, Integer> {


    User findByUsername(String username);

    User save(UserDto userDto);
}


