package com.atakanoguzdev.springbootmicroservice3apigateway.service;

import com.atakanoguzdev.springbootmicroservice3apigateway.model.User;

public interface AuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
