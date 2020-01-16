package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO: show the registration form
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // TODO: ensure the submitted information is valid
        System.out.println("request.getParameter(\"username\") = " + request.getParameter("username"));
        System.out.println("request.getParameter(\"email\") = " + request.getParameter("email"));
        System.out.println("request.getParameter(\"password\") = " + request.getParameter("password"));

        // TODO: create a new user based off of the submitted information

        // TODO: if a user was successfully created, send them to their profile
        if (!request.getParameter("username").equals("") &&
                !request.getParameter("email").equals("") &&
                !request.getParameter("password").equals("")) {
            User user = new User(
                    request.getParameter("username"),
                    request.getParameter("email"),
                    request.getParameter("password")
            );
            Long result = DaoFactory.getUsersDao().insert(user);
            if (result != 0) {

                request.getSession().setAttribute("user", user.getUsername());
                response.sendRedirect("/profile");
                return;
            }
            response.sendRedirect("/register");
        }
    }
}

