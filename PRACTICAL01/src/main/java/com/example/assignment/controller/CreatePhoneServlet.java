package com.example.assignment.controller;

import com.example.assignment.entity.Phone;
import com.example.assignment.repository.JpaRepository;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

public class CreatePhoneServlet extends HttpServlet {
    private JpaRepository<Phone> jpaPhone = new JpaRepository<>(Phone.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/admin/product/create-phone.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
                req.setCharacterEncoding("UTF-8");
                String name = String.valueOf(req.getParameter("name"));
                String brand = String.valueOf(req.getParameter("brand"));
                double price = Double.parseDouble(req.getParameter("price"));
                String description =String.valueOf(req.getParameter("description") );

            Phone phone = new Phone(name,brand,price, description);
                    jpaPhone.save(phone);
                    resp.sendRedirect("/admin/product/list");
            } catch (Exception ex) {
            System.out.println(ex.getMessage());
            resp.getWriter().println(ex.getMessage());
        }
    }
}
