package com.codewithashith;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class B_SquareServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        int i = Integer.parseInt(req.getParameter("num"));


        PrintWriter writer = resp.getWriter();
        writer.write("<html>" +
                "<title>Servlet App</title>" +
                "<body>");
        writer.write("<p>Output:" + i * i + "</p>");
        writer.write("</body>\n" +
                "</html>\n");

    }
}
