package com.haniuchenko.services;

import com.haniuchenko.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin
 */
public interface UserService {
    List<User> getAll();
    void delete(Integer id);
}
