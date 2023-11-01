package com.codewithashith;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class CookieTrackingServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = "";
        Cookie cookie[] = req.getCookies();

        for (Cookie c : cookie) {
            if (c.getName().equals("name"))
                name = c.getValue();
        }

        PrintWriter writer = resp.getWriter();
        writer.write("<p>" + name + "</p>");

    }
}
