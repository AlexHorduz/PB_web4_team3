package com.example.PB_web4_team3.servlets;

import com.example.PB_web4_team3.TestData;
import com.example.PB_web4_team3.models.Tasks;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Task2Servlet", value = "/task2")
public class Task2Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("commonActors", Tasks.Task2(TestData.getActor()));
        request.getRequestDispatcher("WEB-INF/jsp/Task2.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
