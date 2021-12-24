package com.example.assignment.controller;

import com.example.assignment.entity.Food;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Food food = new Food();
        food.setId(1);
        food.setName("Bánh mỳ");
        food.setId(1);
        food.setId(1);
        food.setId(1);
        food.setId(1);
        food.setId(1);
        food.setId(1);
        req.getRequestDispatcher("/admin/product/list-food.jsp").forward(req, resp);
    }
}
