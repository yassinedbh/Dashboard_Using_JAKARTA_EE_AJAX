/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import beans.User;
import com.google.gson.Gson;
import connexion.Connexion;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;
import org.json.simple.JSONObject;
import service.UsersService;

/**
 *
 * @author yassi
 */
@WebServlet(name = "AuthentificationController", urlPatterns = {"/AuthentificationController"})
public class AuthentificationController extends HttpServlet {

    private UsersService ms = new UsersService();
private static PrintWriter out;
private static String message;
private static Gson gson;
private JSONObject simpeJO;
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
        /*
        String username = request.getParameter("username");

        String password = request.getParameter("password");

        if (ms.Authentification(username, password)) {
            System.out.println(username + " " + password);
            HttpSession session=request.getSession();
            session.setAttribute("username",username);
            response.sendRedirect("index.jsp");

        } else {
            request.setAttribute("error", "Account doesn't exit , Please try another one");
            request.getRequestDispatcher("Authentification.jsp").forward(request, response);
        }*/
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
       // processRequest(request, response);
                 gson = new Gson();
simpeJO = new JSONObject();



String usern = request.getParameter("username");
String pass = request.getParameter("password");
response.setContentType("text/html;charset=UTF-8");

out = response.getWriter();
HttpSession session = request.getSession();
HttpServletResponse httpResponse = (HttpServletResponse) response;
httpResponse.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
response.addHeader("Cache-Control", "post-check=0, pre-check=0");
httpResponse.setHeader("Pragma", "no-cache");
httpResponse.setDateHeader("Expires", 0);
boolean login = ms.Authentification(usern, pass);
if (login) {
session.setAttribute("username", usern);
if (session.getAttribute("username") == null) {
response.sendRedirect("/Authentification.jsp");
} else {
response.sendRedirect("index.jsp");
simpeJO.put("status", true);
simpeJO.put("erreur", "Login Sucess");

}



} else {

session.invalidate();
simpeJO.put("status", false);
simpeJO.put("erreur", "Login Sucess");
request.setAttribute("error", "Account doesn't exit , Please try another one");
request.getRequestDispatcher("Authentification.jsp").forward(request, response);
}
message = gson.toJson(simpeJO);
out.println(message);
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
