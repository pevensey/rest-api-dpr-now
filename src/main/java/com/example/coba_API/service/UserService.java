package com.example.coba_API.service;

import com.example.coba_API.model.Login;
import com.example.coba_API.model.User;

public interface UserService {
    void register(User user);

    User validateUser(Login login);
}
