package com.example.PB_web4_team3.servlets;

import com.example.PB_web4_team3.TestData;
import com.example.PB_web4_team3.models.Tasks;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Task1Servlet", value = "/task1")
public class Task1Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("isAnyUnemployedActor", Tasks.Task1(TestData.getDB()));
        request.getRequestDispatcher("WEB-INF/jsp/Task1.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
