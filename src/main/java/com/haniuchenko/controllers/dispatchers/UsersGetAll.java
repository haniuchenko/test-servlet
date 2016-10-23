package com.haniuchenko.controllers.dispatchers;

import com.haniuchenko.controllers.Dispatcher;
import com.haniuchenko.model.User;
import com.haniuchenko.services.UserService;
import com.haniuchenko.services.UserServiceIml;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Admin
 */
public class UsersGetAll implements Dispatcher {

    private UserService service = new UserServiceIml();

    public void dispatch(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<User> users = service.getAll();
        req.setAttribute("userList", users);
        req.getRequestDispatcher("/pages/userList.jsp").forward(req, resp);

    }
}
