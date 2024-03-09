/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dal.userDAO;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.util.ArrayList;
import model.user;

/**
 *
 * @author ACER
 */
public class LoginControll extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String role = request.getParameter("role");
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");

        try {
            if (role != null && user != null && pass != null) {
                userDAO userDAO = new userDAO();
                ArrayList<user> userList = userDAO.getAllUser();

                boolean validUser = false;
                HttpSession session = request.getSession();
                int id = 0;
                for (user userObject : userList) {
                    if (userObject.getUsername().equals(user) && userObject.getPassword().equals(pass)) {
                        if (role.equals(userObject.getRole())) {
                            // Set the user's role in the session
                            session.setAttribute("check", role);
                            id = userObject.getId();
                            validUser = true;
                            break;
                        }
                    }
                }

                if (!validUser) {
                    String error = "Please check your information";
                    request.setAttribute("error", error);
                    request.getRequestDispatcher("Login.jsp").forward(request, response);
                } else {
                    // Perform the redirection outside the for loop
                    if (role.equalsIgnoreCase("admin")) {
                        response.sendRedirect("/Admissions/AdminPage");
                    } else if (role.equalsIgnoreCase("user")) {
                        request.setAttribute("user", user);
                        response.sendRedirect("/Admissions/UserPage.jsp?id=" + id);
                    }
                }
            } else {
                request.getRequestDispatcher("Login.jsp").forward(request, response);
            }

        } catch (IOException e) {
            out.println("check again");
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
