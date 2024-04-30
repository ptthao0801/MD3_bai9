package org.example.servertime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", value = "/display-discount")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        float price = Float.parseFloat(req.getParameter("price"));
        float discountAmount = Float.parseFloat(req.getParameter("discount"))/100*price;
        float discountPrice = price - discountAmount;

        PrintWriter writer = resp.getWriter();
        writer.println("<HTML>");
        writer.println("<h4>Luong chiet khau: " + discountAmount +"</h4>");
        writer.println("<h4>Gia sau khi duoc chieu khau: " + discountPrice +"</h4>");
        writer.println("</HTML>");
    }
}
