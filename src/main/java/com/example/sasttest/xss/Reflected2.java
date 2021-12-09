package com.example.sasttest.xss;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "xss2", value = "/reflected2")
public class Reflected2 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String xss = request.getParameter("xss");
        request.setAttribute("xss", xss);
        request.getRequestDispatcher("reflected2.jsp").forward(request, response);

    }
}
