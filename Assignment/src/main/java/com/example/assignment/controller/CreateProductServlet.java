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
                String name = req.getParameter("name");
                int idCategory = Integer.parseInt(req.getParameter("idCategory"));
                String description = req.getParameter("description");
                String thumbnail = req.getParameter("thumbnail");
                Double price = Double.parseDouble(req.getParameter("price"));
//                SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
//                Date startDate = simpleDateFormat.parse(req.getParameter("startDate"));
//                Date editDate = simpleDateFormat.parse(req.getParameter("editDate"));
                SimpleDateFormat formater =  new SimpleDateFormat("yyyy-MM-dd");
                Date startDate = formater.parse(req.getParameter("startDate"));
                Date editDate = formater.parse(req.getParameter("editDate"));
                System.out.println(startDate);
                System.out.println(editDate);
                int status = Integer.parseInt(req.getParameter("status"));
                //tạo đối tượng lớp Food
                Food food = new Food(name, idCategory, description, thumbnail, price, startDate, editDate, status);
                //kiểm tra tính hợp lệ của Food
                if (food.isValid()){
                    jpaFood.save(food);
                    resp.sendRedirect("/admin/product/list");
                }else {
                    req.getRequestDispatcher("/admin/product/create-food.jsp").forward(req, resp);
                }
            } catch (Exception ex) {
            ex.printStackTrace();
            resp.getWriter().println(ex.getMessage());
        }
    }
}
