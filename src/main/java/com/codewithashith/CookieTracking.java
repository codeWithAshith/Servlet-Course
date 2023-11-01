package com.codewithashith;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CookieTracking extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        Cookie cookie = new Cookie("name", req.getParameter("name"));

        resp.addCookie(cookie);
        resp.sendRedirect("cookieTracking");

    }
}
