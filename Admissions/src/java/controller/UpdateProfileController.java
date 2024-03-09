package controller;

import dal.ApplicantsDAO;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import model.Applicants;

/**
 * Servlet for updating user profile information.
 */
public class UpdateProfileController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String dob = request.getParameter("dob");
        String address = request.getParameter("location");

        ApplicantsDAO getA = new ApplicantsDAO();
        getA.UpdateApplicants(name, gender, dob, email, phone, address, id);

        // Redirect to the user's profile page
        response.sendRedirect("/Admissions/UserPage.jsp?id=" + id);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");
        ApplicantsDAO getA = new ApplicantsDAO();
        ArrayList<Applicants> list = getA.getAllApplicantsByID(id);
        request.setAttribute("list", list);
        request.getRequestDispatcher("updateProfile.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
