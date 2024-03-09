package controller;

import dal.userDAO;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DeleteAccount extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String id = request.getParameter("id");
        
        if (id != null) {
            int userId = Integer.parseInt(id);
            userDAO getU = new userDAO();
            getU.DeleteUser(userId);
        } else {
            request.setAttribute("e", "null");
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
        
        // Redirect to a suitable page after account deletion
        response.sendRedirect("/Admissions/LoginPage");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
