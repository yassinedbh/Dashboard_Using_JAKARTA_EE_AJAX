package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import service.MarqueService;

/**
 *
 * @author Lachgar
 */
@WebServlet(urlPatterns = {"/MarqueController"})
public class MarqueController extends HttpServlet {

    private MarqueService ms = new MarqueService();

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
         if (request.getParameter("op") != null) {
         if (request.getParameter("op").equals("delete")) {
         int id = Integer.parseInt(request.getParameter("id"));
         ms.delete(ms.findById(id));
         response.sendRedirect("marques.jsp");
         } else if (request.getParameter("op").equals("update")) {
         int id = Integer.parseInt(request.getParameter("id"));
         Marque m = ms.findById(id);
         response.sendRedirect("marques.jsp?id=" + m.getId() + "&reference=" + m.getReference() + "&dateAchat=" + m.getDateAchat() + "&prix=" + m.getPrix());
         }
         } else if (request.getParameter("id") != null) {
         if (!request.getParameter("id").equals("")) {
         String reference = request.getParameter("reference");
         double prix = Double.parseDouble(request.getParameter("prix"));
         Date dateAchat = new Date(request.getParameter("dateAchat").replace("-", "/"));
         int id = Integer.parseInt(request.getParameter("id"));
         Marque m = ms.findById(id);
         m.setReference(reference);
         m.setPrix(prix);
         m.setDateAchat(dateAchat);
         ms.update(m);
         response.sendRedirect("marques.jsp");
         }
         } */
        if (request.getParameter("op") != null) {
            if (request.getParameter("op").equals("load")) {
                response.setContentType("application/json");
                List<Marque> marques = ms.findAll();
                response.getWriter().write((new Gson()).toJson(marques));
            } else if (request.getParameter("op").equals("delete")) {
                int iid = Integer.parseInt(request.getParameter("id"));
                ms.delete(ms.findById(iid));
                response.setContentType("application/json");
                List<Marque> marques = ms.findAll();
                response.getWriter().write((new Gson()).toJson(marques));
            } else if (request.getParameter("op").equals("update")) {

                int iid = Integer.parseInt(request.getParameter("id"));
                String code = request.getParameter("code");
                String libelle = request.getParameter("libelle");
                if (!libelle.isEmpty() && !code.isEmpty()) {
                    Marque me = ms.findById(iid);
                    me.setId(iid);

                    me.setCode(code);
                    me.setLibelle(libelle);
                    ms.update(me);
                    response.setContentType("application/json");
                    List<Marque> marques = ms.findAll();
                    response.getWriter().write((new Gson()).toJson(marques));
                }
            }

        } else {
            String code = request.getParameter("code");
            String libelle = request.getParameter("libelle");
      //      if (!libelle.isEmpty() && !code.isEmpty()) {
                ms.create(new Marque(code, libelle));
                response.setContentType("application/json");
                List<Marque> marques = ms.findAll();
                response.getWriter().write((new Gson()).toJson(marques));
          //  }
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
