package com.haniuchenko.services;

import com.haniuchenko.dao.UserDao;
import com.haniuchenko.dao.UserDaoImpl;
import com.haniuchenko.model.User;

import java.util.List;

/**
 * Created by Admin
 */
public class UserServiceIml implements UserService {

    private UserDao userDao = new UserDaoImpl();

    public List<User> getAll() {

        return userDao.getAll();
    }

    public void delete(Integer id) {

        userDao.delete(id);
    }
}
