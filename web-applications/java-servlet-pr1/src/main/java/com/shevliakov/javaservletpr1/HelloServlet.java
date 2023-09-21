package com.shevliakov.javaservletpr1;

import com.shevliakov.javaservletpr1.persistence.Product;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/products")
public class HelloServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    response.setContentType("text/html");
    ServletContext context = getServletContext();
    Product[] products = (Product[]) context.getAttribute("products");
    PrintWriter out = response.getWriter();
    out.println("<html><body>");
    out.println("<h1>Products</h1>");
    for (int i = 0; i < 10; i++) {
      out.println("<p>" + products[i].getTitle() + "</p>");
    }
    out.println("</body></html>");
    out.flush();
    out.close();
  }
}
