package ch.aa.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class mainClass extends HttpServlet{

    @Override
    
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String str = req.getParameter("str");

        req.setAttribute("getStr", str);


        req.getRequestDispatcher("/welcome.jsp").forward(req, resp);



    }

}
