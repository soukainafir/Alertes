<%-- 
    Document   : acceuil
    Created on : 22 mars 2016, 14:50:15
    Author     : Soukaina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome, Authentification Success</h1>
        <p> <label>You are:  ${utilisateur.nom}</label>
            <label> ${utilisateur.prenom}</label></p>
         <p><label>Email : ${utilisateur.email}</label></p>
         <p><label>Telephone : ${utilisateur.tel}</label></p>
          <p><label>${utilisateur.dt_visit}</label></p>
         
         
    </body>
</html>
