package com.haniuchenko.controllers;


import com.haniuchenko.controllers.dispatchers.UsersDelete;
import com.haniuchenko.controllers.dispatchers.UsersGetAll;
import com.haniuchenko.services.UserService;
import com.haniuchenko.services.UserServiceIml;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Controller extends HttpServlet {

    private UserService userServ = new UserServiceIml();

    private static final Map<String, Dispatcher> URLS = new HashMap<String, Dispatcher>() {{

        put("/users/getAll", new UsersGetAll());
        put("/users/delete", new UsersDelete());
    }};

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String url = req.getRequestURI();
        Dispatcher disp = URLS.get(url);
        if (disp != null) {
            disp.dispatch(req, resp);
        } else {
            req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req, resp);
        }


    }
}
