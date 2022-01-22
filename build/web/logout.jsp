<%
HttpSession httpSession = request.getSession();
httpSession.invalidate();
RequestDispatcher dispatcher = request.getRequestDispatcher("/Authentification.jsp");
dispatcher.include(request, response);
%>