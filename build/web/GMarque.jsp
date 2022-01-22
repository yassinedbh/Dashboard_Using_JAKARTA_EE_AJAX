<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
      <%@include file="template/css.jsp" %>
      <script src="script/jquery-3.3.1.min.js" type="text/javascript"></script>
    </head>
    <body>
        <div class="container-scroller">
        <%@include file="template/header.jsp" %>
         <div class="container-fluid page-body-wrapper">
        <%@include file="template/sidebar.jsp" %>   
        <%@include file="template/menu.jsp" %>
        <div class="main-panel">
            <%@include file="template/marque.jsp" %>
            <%@include file="template/footer.jsp" %>
        </div>
         </div>
        </div>
       
        <%@include file="template/js.jsp" %>
          <script src="script/marquejs.js" type="text/javascript"></script>
</body>
</html>
