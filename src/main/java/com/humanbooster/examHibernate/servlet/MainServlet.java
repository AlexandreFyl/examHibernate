package com.humanbooster.examHibernate.servlet;


import com.humanbooster.examHibernate.service.MainService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainServlet extends HttpServlet {

    private MainService us;

    public MainServlet() {
        super();
        this.us = new MainService();
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
        req.getRequestDispatcher("main.jsp");
    }
}
