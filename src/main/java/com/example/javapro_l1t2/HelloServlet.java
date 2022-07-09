package com.example.javapro_l1t2;

import java.io.*;
import java.util.ArrayList;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(value = "/")
public class HelloServlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" " +
                "integrity=\"sh" + "a384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">");
        out.println("</head>");
        out.println("<body>");

        out.println("<div class='container'>");
        out.println("<div class='row nt-3 mt-3'>");
        out.println("<div class='col-6 mx-auto' style='border: 1px #d1d1d1 solid; border-radius:7px;'>");
        out.println("<table class=\"table table-borderless\" style='border: 1px #d1d1d1 solid;margin-top:10px;'>");
        out.println("<thead >");
        out.println("<tr>");
        out.println("<th class=\"table-active\">NAME</th>");
        out.println("<th class=\"table-active\">SURNAME</th>");
        out.println("<th class=\"table-active\">DEPARTMENT</th>");
        out.println("<th class=\"table-active\">SALARY</th>");
        out.println("</tr>");
        out.println("</thead>");
        out.println("<tbody>");

        ArrayList<User> users = dbManager.getAllUsers();

        for (User user : users) {
            out.println("<tr>");
            out.println("<td>" + user.getName() + "</td>");
            out.println("<td>" + user.getSurname() + "</td>");
            out.println("<td>" + user.getDepartment() + "</td>");
            out.println("<td>" + user.getSalary() + "</td>");
            out.println("</tr>");
        }
        out.println("</div></div></div>");
        out.println("</body></html>");
    }

}