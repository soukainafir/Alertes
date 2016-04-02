package com.servlets;

import java.io.IOException;
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
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	 
	User_Manager um ;
    /**
     * @see HttpServlet#HttpServlet()
     */
	 public login() {
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		 String Id_user,password ;
		 String op=request.getParameter("btn");
		 Id_user=request.getParameter("Id_user");
		 password =request.getParameter("password");
		 
		 		
 if(op.equals("connect")){
      
	         utilisateur u = um.Authentificat(Id_user, password);
 		if(u!=null) 
 			{
 				HttpSession ses =request.getSession();
 				ses.setAttribute("user", u);
 				response.sendRedirect("Acceuil");
		
 			}
	}
	}

}
