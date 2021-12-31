package com.example.assignment.controller;

import com.example.assignment.entity.Food;
import com.example.assignment.repository.JpaRepository;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

public class EditProductServlet extends HttpServlet {
    private JpaRepository<Food> jpaFood = new JpaRepository<>(Food.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            int id = Integer.parseInt(req.getParameter("id")) ;
            Food food = jpaFood.findById(id);
            if (food == null){
                resp.getWriter().println("Product is not found");
            }else {
                req.setAttribute("food", food);
                req.getRequestDispatcher("/admin/product/edit-food.jsp").forward(req, resp);
            }
        }catch (Exception ex){
            ex.printStackTrace();
            resp.getWriter().println("Bad request!");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            req.setCharacterEncoding("UTF-8");
            int id = Integer.parseInt(req.getParameter("id"));
            //check sản phẩm tồn tại hay không
            Food food = jpaFood.findById(id);
            if (food == null){
                 resp.getWriter().println("Sản phẩm không tồn tại, vui lòng thử lại!");
            }else {
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

                //edit giá trị mới
                food.setName(name);
                food.setIdCategory(idCategory);
                food.setDescription(description);
                food.setThumbnail(thumbnail);
                food.setPrice(price);
                food.setStartDate(startDate);
                food.setEditDate(editDate);
                food.setStatus(status);
//update database
                jpaFood.update(food);
                resp.sendRedirect("/admin/product/list");
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            resp.getWriter().println(ex.getMessage());
        }
    }
}