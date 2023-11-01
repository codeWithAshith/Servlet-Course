package com.codewithashith;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class C_SessionTrackingServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        HttpSession httpSession = req.getSession();

        PrintWriter writer = resp.getWriter();
        writer.write("<p>" + httpSession.getAttribute("name") + "</p>");

        //remove session
        httpSession.removeAttribute("name");

    }
}
