///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
// */
//
//package controller;
//
//import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;
//import com.sun.xml.internal.ws.wsdl.writer.document.Message;
//import java.io.IOException;
//import java.io.PrintWriter;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import jakarta.websocket.Session;
//import java.util.Properties;
//import sun.rmi.transport.Transport;
//
///**
// *
// * @author ACER
// */
//public class EmailControll extends HttpServlet {
//   
//    /** 
//     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//    throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        
//      // Recipient's email ID needs to be mentioned.
//      String to = "mh512475@gmail.com";
//
//      // Sender's email ID needs to be mentioned
//      String from = "hson512475@gmail.com";
//
//      // Assuming you are sending email from localhost
//      String host = "localhost";
//
//      // Get system properties
//      Properties properties = System.getProperties();
//
//      // Setup mail server
//      properties.setProperty("mail.smtp.host", host);
//
//      // Get the default Session object.
//      Session session = Session.getDefaultInstance(properties);
//
//      // Set response content type
//      response.setContentType("text/html");
//      PrintWriter out = response.getWriter();
//
//      try{
//         // Create a default MimeMessage object.
//         MimeMessage message = new MimeMessage(session);
//         // Set From: header field of the header.
//         message.setFrom(new InternetAddress(from));
//         // Set To: header field of the header.
//         message.addRecipient(Message.RecipientType.TO,
//                                  new InternetAddress(to));
//         // Set Subject: header field
//         message.setSubject("This is the Subject Line!");
//         // Now set the actual message
//         message.setText("This is actual message");
//         // Send message
//         Transport.send(message);
//         String title = "Send Email";
//         String res = "Sent message successfully....";
//      }catch (MessagingException mex) {
//         mex.printStackTrace();
//      }
//    } 
//
//    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
//    /** 
//     * Handles the HTTP <code>GET</code> method.
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//    throws ServletException, IOException {
//        processRequest(request, response);
//    } 
//
//    /** 
//     * Handles the HTTP <code>POST</code> method.
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//    throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /** 
//     * Returns a short description of the servlet.
//     * @return a String containing servlet description
//     */
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>

//}
