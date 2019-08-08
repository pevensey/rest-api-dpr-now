package com.example.coba_API.DAO;

import com.example.coba_API.model.Login;
import com.example.coba_API.model.User;

public interface UserDao {

    void register(User user);

    User validateUser(Login login);
}
