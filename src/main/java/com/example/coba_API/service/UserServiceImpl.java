package com.example.coba_API.service;

import com.example.coba_API.DAO.UserDao;
import com.example.coba_API.model.Login;
import com.example.coba_API.model.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
    @Autowired
    public UserDao userDao;

    public void register(User user) {
        userDao.register(user);
    }

    public User validateUser(Login login) {
        return userDao.validateUser(login);
    }
}
