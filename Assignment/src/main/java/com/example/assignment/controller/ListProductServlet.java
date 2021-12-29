package com.example.assignment.controller;

import com.example.assignment.entity.Food;
import com.example.assignment.repository.JpaRepository;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListProductServlet extends HttpServlet {

    JpaRepository<Food> jpaFood = new JpaRepository<>(Food.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Food> list = jpaFood.findAll();

        req.setAttribute("list", list);
        req.getRequestDispatcher("/admin/product/list-food.jsp").forward(req,resp);
    }
}
