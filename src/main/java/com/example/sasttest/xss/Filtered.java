package com.example.sasttest.xss;

import org.owasp.html.PolicyFactory;
import org.owasp.html.Sanitizers;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "filtered", value = "/filtered")
public class Filtered extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String xss = request.getParameter("xss");

        PolicyFactory policy = Sanitizers.FORMATTING.and(Sanitizers.LINKS);
        String safeHTML = policy.sanitize(xss);


        PrintWriter out = response.getWriter();
        out.println("SafeHTML: "+safeHTML);
    }
}
