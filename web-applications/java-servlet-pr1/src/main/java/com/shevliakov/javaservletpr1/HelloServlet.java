package com.shevliakov.javaservletpr1;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/products")
public class HelloServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    response.setContentType("text/html");
    ServletContext context = getServletContext();
    String[] products = (String[]) context.getAttribute("products");
    PrintWriter writer = response.getWriter();

    writer.println("<html><body>");
    writer.println("<h1>Products</h1>");
    for (String product : products) {
      writer.println("<p>" + product + "</p>");
    }
    writer.println("<p>" + request.getContextPath() + "</p>");
    writer.println("<p>" + request.getServletPath() + "</p>");
    writer.println("<p>" + request.getPathInfo() + "</p>");
    writer.println("<p>" + request.getQueryString() + "</p>");
    writer.println("<p>" + request.getParameter("param1") + "</p>");
    writer.println("<p>" + request.getParameter("param2") + "</p>");
    writer.println("<p>" + request.getHeader("User-Agent") + "</p>");
    writer.println("<p>" + request.getSession(true).getId() + "</p>");
    writer.println("</body></html>");
    writer.flush();
    writer.close();
  }
}
