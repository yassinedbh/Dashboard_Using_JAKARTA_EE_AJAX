<%-- 
    Document   : menu.jsp
    Created on : 2 janv. 2022, 17:09:14
    Author     : yassi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<nav class="sidebar sidebar-offcanvas" id="sidebar">
        <ul class="nav">
          <li class="nav-item">
            <a class="nav-link" href="index.jsp" >
              <i class="ti-home menu-icon"></i>
              <span class="menu-title">Dashboard</span>
            </a>
          </li>
         
          <li class="nav-item">
            <a class="nav-link" data-toggle="collapse" href="#form-elements" aria-expanded="false" aria-controls="form-elements">
              <i class="ti-clipboard menu-icon"></i>
              <span class="menu-title">Gestion</span>
              <i class="menu-arrow"></i>
            </a>
            <div class="collapse" id="form-elements">
              <ul class="nav flex-column sub-menu">
                <li class="nav-item"><a class="nav-link" href="GMachine.jsp"> Machine</a></li>
                <li class="nav-item"><a class="nav-link" href="GMarque.jsp">Marque</a></li>
              </ul>
            </div>
          </li>

          
          <li class="nav-item">
            <a class="nav-link" data-toggle="collapse" href="#charts" aria-expanded="false" aria-controls="charts">
              <i class="ti-search menu-icon"></i>
              <span class="menu-title">Recherche</span>
              <i class="menu-arrow"></i>
            </a>
            <div class="collapse" id="charts">
              <ul class="nav flex-column sub-menu">
                <li class="nav-item"> <a class="nav-link" href="GMRecherche.jsp">Par Marque</a></li>
                 <li class="nav-item"> <a class="nav-link" href="GMDate.jsp">Par Dates </a></li>
              </ul>
            </div>
          </li>
         
         
         <li class="nav-item">
            <a class="nav-link" data-toggle="collapse" href="#tables" aria-expanded="false" aria-controls="tables">
             <i class="icon-bar-graph menu-icon"></i>
              <span class="menu-title">Statistique</span>
              <i class="menu-arrow"></i>
            </a>
            <div class="collapse" id="tables">
              <ul class="nav flex-column sub-menu">
                <li class="nav-item"> <a class="nav-link" href="GChart.jsp">ChartJs</a></li>
              </ul>
            </div>
          </li>
          
          
        </ul>
      </nav>
