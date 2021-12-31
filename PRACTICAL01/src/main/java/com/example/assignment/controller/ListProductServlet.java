package com.example.assignment.controller;

import com.example.assignment.entity.Phone;
import com.example.assignment.repository.JpaRepository;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListProductServlet extends HttpServlet {

    JpaRepository<Phone> jpaPhone = new JpaRepository<>(Phone.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Phone> list = jpaPhone.findAll();

        req.setAttribute("list", list);
        req.getRequestDispatcher("/admin/product/list-phone.jsp").forward(req,resp);
    }
}
