package com.haniuchenko.dao;

import com.haniuchenko.model.User;

import java.util.List;

/**
 * Created by Admin
 */
public interface UserDao {
    String QUERY_GET_ALL = "select * from users";
    String QUERY_DELETE = "delete from users where id=(?)";
    List<User> getAll();
    void delete(Integer id);

}
