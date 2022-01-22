<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
      <%@include file="template/css.jsp" %>
    </head>
    <body>
        <div class="container-scroller">
        <%@include file="template/header.jsp" %>
         <div class="container-fluid page-body-wrapper">
        <%@include file="template/sidebar.jsp" %>   
        <%@include file="template/menu.jsp" %>
        <div class="main-panel">
            <%@include file="template/dashboard.jsp" %>
            <%@include file="template/footer.jsp" %>
        </div>
         </div>
        </div>
        <%@include file="template/js.jsp" %>  
        <script src="script/dashboard.js" type="text/javascript"></script>
</body>
</html>
