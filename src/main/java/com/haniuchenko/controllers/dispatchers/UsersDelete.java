package com.haniuchenko.controllers.dispatchers;

import com.haniuchenko.controllers.Dispatcher;
import com.haniuchenko.services.UserService;
import com.haniuchenko.services.UserServiceIml;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Admin
 */
public class UsersDelete implements Dispatcher {

    private UserService userDelete = new UserServiceIml();

    public void dispatch(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Integer parameter = Integer.parseInt(req.getParameter("id"));
        userDelete.delete(parameter);
        resp.sendRedirect("/users/getAll");
    }
}
