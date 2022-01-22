
<%@page import="com.sun.xml.rpc.processor.modeler.j2ee.xml.string"%>
<%@page import="beans.Machine"%>
<%@page import="beans.chart"%>
<%@page import="service.ChartService"%>
<%@page import="service.MachineService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="template/css.jsp" %>
        <script src="script/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/3.7.0/chart.min.js" ></script>
        <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/3.7.0/chart.min.js" ></script>
      
    </head>
    <body>
         
        <div class="container-scroller">
            <%@include file="template/header.jsp" %>
            <div class="container-fluid page-body-wrapper">
                <%@include file="template/sidebar.jsp" %>   
                <%@include file="template/menu.jsp" %>
                <div class="main-panel">
                  
                    
                    
                    
                    
                    
                    
             <div class="content-wrapper">
          <div class="row">
            <div class="col-lg-6 grid-margin stretch-card">
              <div class="card">
                <div class="card-body">
                  <h4 class="card-title">Nombre Des Machines Par Marque Avec Line chart</h4>
                  <canvas id="mycanvas2"></canvas>
                </div>
              </div>
            </div>
            <div class="col-lg-6 grid-margin stretch-card">
              <div class="card">
                <div class="card-body">
                  <h4 class="card-title">Nombre Des Machines Par Marque Avec Bar chart</h4>
                  <canvas id="mycanvas"></canvas>
                </div>
              </div>
            </div>
          </div>
                 
                   <div class="row">
            <div class="col-lg-6 grid-margin stretch-card">
              <div class="card">
                <div class="card-body">
                  <h4 class="card-title">Nombre Des Machines Par Marque Avec Polar chart</h4>
                  <canvas id="mycanvas3"></canvas>
                </div>
              </div>
            </div>
            <div class="col-lg-6 grid-margin stretch-card">
              <div class="card">
                <div class="card-body">
                  <h4 class="card-title">Nombre Des Machines Par Marque Avec Doughnut chart</h4>
                  <canvas id="mycanvas4"></canvas>
                </div>
              </div>
            </div>
          </div>
                 
                 
           </div>
                    
             
      
                    <%@include file="template/footer.jsp" %>
                    <script src="script/chartjs.js" type="text/javascript"></script>
                </div>
            </div>
        </div>

        <%@include file="template/js.jsp" %>
       



    </body>
    
</html>
