package com.atakanoguzdev.springbootmicroservice3apigateway.service;

import com.atakanoguzdev.springbootmicroservice3apigateway.model.Role;
import com.atakanoguzdev.springbootmicroservice3apigateway.model.User;

import java.util.Optional;

public interface UserService
{

    User saveUser(User user);

    Optional<User> findUserByUsername(String username);

    void changeRole(Role newRole, String username);
}
