package com.example.assignment.controller;

import com.example.assignment.entity.Food;
import com.example.assignment.repository.JpaRepository;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CreateProductServlet extends HttpServlet {
    private JpaRepository<Food> jpaFood = new JpaRepository<>(Food.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/admin/product/create-food.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
                req.setCharacterEncoding("UTF-8");
                String name = String.valueOf(req.getParameter("name"));
                int idCategory = Integer.parseInt(req.getParameter("idCategory"));
                String description =String.valueOf(req.getParameter("description") );
                String thumbnail = String.valueOf(req.getParameter("thumbnail"));
                double price = Double.parseDouble(req.getParameter("price"));
                Date startDate = new Date();
                Date editDate = new Date();
                System.out.println(startDate);
                System.out.println(editDate);
                int status = Integer.parseInt(req.getParameter("status"));
                //tạo đối tượng lớp Food
                Food food = new Food(name, idCategory, description, thumbnail, price, startDate, editDate, status);
                    jpaFood.save(food);
                    resp.sendRedirect("/admin/product/list");
            } catch (Exception ex) {
            System.out.println(ex.getMessage());
            resp.getWriter().println(ex.getMessage());
        }
    }
}
