package com.example.finanzasbackend.app.domain.service;

import com.example.finanzasbackend.app.domain.model.entity.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {
    List<User> getAll();

    // authenticate username and password
    User authenticate(String username, String password);
    User create(User user);

    ResponseEntity<?> delete(Long id);

}
