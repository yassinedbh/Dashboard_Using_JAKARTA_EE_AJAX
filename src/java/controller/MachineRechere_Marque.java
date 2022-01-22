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
@WebServlet(urlPatterns = {"/MachineRechere_Marque"})
public class MachineRechere_Marque extends HttpServlet {

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
            /*
            if (request.getParameter("op").equals("load")) {
                response.setContentType("application/json");
                List<Machine> machines = ms.findAll();
                System.out.println("load");
                response.getWriter().write((new Gson()).toJson(machines));

                
            }else
            */
            if(request.getParameter("op").equals("loadcmb")){
                 response.setContentType("application/json");
                List<Marque> marques = mm.findAll();
                response.getWriter().write((new Gson()).toJson(marques));
                
            } 
        }
            else {
            
            int idmarque=Integer.parseInt(request.getParameter("idmarque"));
  
            response.setContentType("application/json");
            List<Machine> machines = ms.RechercheParMarque(idmarque);
            response.getWriter().write((new Gson()).toJson(machines));
            
           
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
