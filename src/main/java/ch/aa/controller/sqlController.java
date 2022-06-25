package ch.aa.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ch.aa.controller.sqlCon.sqlConnect;
public class sqlController extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        sqlConnect conn = new sqlConnect();
        //boolean test;
         boolean isCon = conn.connect();

         if(isCon == true){

            String str = "connection susses!!!";

            req.setAttribute("getConstat", str);


            req.getRequestDispatcher("/welcome.jsp").forward(req, resp);




         }


  

    }
    
}
