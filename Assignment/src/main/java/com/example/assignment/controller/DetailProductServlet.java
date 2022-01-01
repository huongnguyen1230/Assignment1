package com.example.assignment.controller;

import com.example.assignment.entity.Food;
import com.example.assignment.repository.JpaRepository;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DetailProductServlet extends HttpServlet {

    private JpaRepository<Food> jpaFood = new JpaRepository<>(Food.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            int id = Integer.parseInt(req.getParameter("id"));
            Food food = jpaFood.findById(id);
            if (food == null){
                resp.getWriter().println("Không tìm thấy sản phẩm");
            }else {
                req.setAttribute("food", food);
                req.getRequestDispatcher("/admin/product/detail-food.jsp").forward(req,resp);
            }
        }catch (Exception ex){
            ex.printStackTrace();
            resp.getWriter().println("Bad request");
        }
    }
}
