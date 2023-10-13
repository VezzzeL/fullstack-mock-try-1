package com.browslkv.service;

import com.browslkv.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User createUser(User user);

    User updateUser(User user);

    Optional<User> getUserById(Long userId);

    User getUserByEmail(String email);

    List<User> getAllUsers();

    void deleteUser(Long userId);
}
