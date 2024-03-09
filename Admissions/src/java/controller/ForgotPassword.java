package controller;

import dal.userDAO;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.net.HttpCookie;
import java.util.List;
import model.user;

public class ForgotPassword extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String role = request.getParameter("role");
        String name = request.getParameter("user");
        String pass = request.getParameter("pass");

        userDAO userDAO = new userDAO(); // Instantiate the UserDAO class
        List<user> userList = userDAO.getAllUser(); // Assuming you have a method named getAllUsers()

        boolean check = false; // Initialize check as false

        for (user user : userList) {
            if (user.getRole().equals(role) && user.getUsername().equals(name)) {
                userDAO.UpdatePass(pass, name, role); // Assuming you have a method named updatePassword()
                check = true;
                response.sendRedirect("Login.jsp");
                return;
            }
        }
        
        
        if (!check) {
            String error = "Cannot find username";
            request.setAttribute("error", error);
            request.getRequestDispatcher("ForgotPassword.jsp").forward(request, response);
        }
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

    @Override
    public String getServletInfo() {
        return "Forgot Password Servlet";
    }
}
