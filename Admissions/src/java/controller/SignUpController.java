/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dal.ApplicantsDAO;
import dal.userDAO;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import model.user;

/**
 *
 * @author ACER
 */
public class SignUpController extends HttpServlet {

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
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String DOB = request.getParameter("birthday");
        String gender = request.getParameter("gender");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String role = request.getParameter("role");
        String password = request.getParameter("password");
        String location = request.getParameter("location");

        // Validate the input here if needed
        // Create a new user
        userDAO userDAO = new userDAO();
        userDAO.addNewUser(email, password, role);

        // Get the ID of the last added user
        int userId = userDAO.getLastAddedUserId();

        // Convert the date string to a Date object
        Date date = null;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            date = new Date(dateFormat.parse(DOB).getTime());
        } catch (ParseException e) {
            // Handle the parse exception
            e.printStackTrace();
            // You may want to add error handling here and forward the request back to the form
        }

        // Create a new applicant
        ApplicantsDAO applicantsDAO = new ApplicantsDAO();
        applicantsDAO.addNewApplicants(userId, firstname + " " + lastname, gender, date, location, phone, email);

        // Redirect to a success page
        response.sendRedirect("/Admissions/LoginPage");

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
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String DOB = request.getParameter("birthday");
        String gender = request.getParameter("gender");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String role = request.getParameter("role");
        String password = request.getParameter("password");
        String location = request.getParameter("location");

        // Validate the input here if needed
        // Create a new user
        userDAO userDAO = new userDAO();
        userDAO.addNewUser(email, password, role);

        // Get the ID of the last added user
        int userId = userDAO.getLastAddedUserId();

        // Convert the date string to a Date object
        Date date = null;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            date = new Date(dateFormat.parse(DOB).getTime());
        } catch (ParseException e) {
            // Handle the parse exception
            e.printStackTrace();
            // You may want to add error handling here and forward the request back to the form
        }

        // Create a new applicant
        ApplicantsDAO applicantsDAO = new ApplicantsDAO();
        applicantsDAO.addNewApplicants(userId, firstname + " " + lastname, gender, date, location, phone, email);

        // Redirect to a success page
        response.sendRedirect("/Admissions/LoginPage");
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
