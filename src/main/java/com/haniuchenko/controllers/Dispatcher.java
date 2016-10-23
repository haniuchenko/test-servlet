package com.haniuchenko.controllers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Admin
 */
public interface Dispatcher  {

    void dispatch(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException;

}
