package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import beans.Machine;
import beans.Marque;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.Date;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.MachineService;
import service.MarqueService;

/**
 *
 * @author Lachgar
 */
@WebServlet(urlPatterns = {"/MachineController"})
public class MachineController extends HttpServlet {

    private static PrintWriter out;
    private MachineService ms = new MachineService();
    private MarqueService mm = new MarqueService();

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

        if (request.getParameter("op") != null) {
            if (request.getParameter("op").equals("load")) {
                response.setContentType("application/json");
                List<Machine> machines = ms.findAll();
                System.out.println("load");
                response.getWriter().write((new Gson()).toJson(machines));

            } else if (request.getParameter("op").equals("loadcmb")) {
                response.setContentType("application/json");
                List<Marque> marques = mm.findAll();
                response.getWriter().write((new Gson()).toJson(marques));

            } else if (request.getParameter("op").equals("delete")) {
                int iid = Integer.parseInt(request.getParameter("id"));
                ms.delete(ms.findById(iid));
                response.setContentType("application/json");
                List<Machine> machines = ms.findAll();
                response.getWriter().write((new Gson()).toJson(machines));
                System.out.println("delete");
            } else if (request.getParameter("op").equals("update")) {
                System.out.println("update");
                int iid = Integer.parseInt(request.getParameter("id"));
                int idmarque = Integer.parseInt(request.getParameter("idmarque"));
                String reference = request.getParameter("reference");
                double prix = Double.parseDouble(request.getParameter("prix"));
                Date dateAchat = new Date(request.getParameter("dateAchat").replace("-", "/"));
                    Machine me = ms.findById(iid);
                    me.setDateAchat(dateAchat);
                    me.setPrix(prix);
                    me.setReference(reference);
                    me.setIdmarque(idmarque);
                    ms.update(me);
                    response.setContentType("application/json");
                    List<Machine> machines = ms.findAll();
                    response.getWriter().write((new Gson()).toJson(machines));
                    System.out.println("nice");
                
            }

        } else {

            String reference = request.getParameter("reference");

           // if (ms.testreference(reference) == false) {

                double prix = Double.parseDouble(request.getParameter("prix"));
                Date dateAchat = new Date(request.getParameter("dateAchat").replace("-", "/"));
                int idmarque = Integer.parseInt(request.getParameter("idmarque"));

                ms.create(new Machine(reference, dateAchat, prix, idmarque));
                response.setContentType("application/json");
                List<Machine> machines = ms.findAll();
                response.getWriter().write((new Gson()).toJson(machines));

            //} 
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
