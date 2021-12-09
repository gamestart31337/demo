package com.example.sasttest.admin;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "simpleSessionAuth", value = "/admin")
public class SimpleSessionAuth extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.getRequestDispatcher("login.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String userEmail = request.getParameter("userEmail");
        String userPassword = request.getParameter("userPassword");

        if(userEmail.equals("admin@admin.com") && userPassword.equals("admin")) {

            HttpSession session = request.getSession();
            session.setAttribute("email", userEmail);
            request.getRequestDispatcher("welcome.jsp").forward(request, response);
        } else {
            response.sendRedirect("login.jsp");
        }
    }
}
