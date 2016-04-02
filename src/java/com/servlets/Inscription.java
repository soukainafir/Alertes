package com.servlets;

import java.io.IOException;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import metier.User_Manager;
import metier.utilisateur;

/**
 * Servlet implementation class login
 */
@WebServlet("/Inscription")
public class Inscription extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 public static final String ATT_FORM = "message";
	 
	User_Manager um ;
    /**
     * @see HttpServlet#HttpServlet()
     */
	 public Inscription() {
	        super();
	        // TODO Auto-generated constructor stub
	    }
	    
	    public void init() throws ServletException {
	    	super.init();
	    	um = new User_Manager();
	    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher( "/inscription.jsp" ).forward( request, response );
         
     //  this.getServletContext().getRequestDispatcher( "/Inscription" ).forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
                
                String  id_user=request.getParameter("Id_user");
                String  nom=request.getParameter("nom");
                
        /* Traitement de la requête et récupération du bean en résultant */
        utilisateur utilisateur = new utilisateur(nom, "", "", "", "", "",
			id_user, "") ;
        um.deleteuser(id_user);
        um.Adduser(utilisateur);
        /* Stockage du formulaire et du bean dans l'objet request */
          request.setAttribute( ATT_FORM, "yes!" );
       out.print("YEssss");
       
     this.getServletContext().getRequestDispatcher( "/inscription.jsp" ).forward( request, response );
 			
	}
	}


