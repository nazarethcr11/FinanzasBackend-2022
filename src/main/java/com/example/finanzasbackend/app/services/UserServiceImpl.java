package com.example.finanzasbackend.app.services;

import com.example.finanzasbackend.app.domain.model.entity.User;
import com.example.finanzasbackend.app.domain.persistence.UserRepository;
import com.example.finanzasbackend.app.domain.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.validation.Validator;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private static final String ENTITY = "User";
    private final UserRepository userRepository;
    private final Validator validator;

    public UserServiceImpl(UserRepository userRepository, Validator validator) {
        this.userRepository = userRepository;
        this.validator = validator;
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public User authenticate(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }

    @Override
    public ResponseEntity<?> delete(Long id) {
        userRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
