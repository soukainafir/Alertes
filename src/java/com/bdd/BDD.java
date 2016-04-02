package com.bdd;


import java.sql.*;

import metier.User_Manager;
import metier.utilisateur;

public class BDD {
	 Connection connection ;
   Statement st ;
   ResultSet rs ;
 String url ;
 
	
  public BDD() {
	
		try{
            Class.forName("com.mysql.jdbc.Driver");
            url="jdbc:mysql://localhost:3306/alerte" ;
          
        }catch(Exception e){
        
        	e.printStackTrace();
        }
		
		
}

public void connect() {
		
	try {
		
		  connection =DriverManager.getConnection(url,"root","");
		  st =connection.createStatement();
		System.out.print("connexion reussite MR : " );
	} catch (Exception e) {
		e.printStackTrace();
	}
}

public void disconnect(){
	
	try {
		 connection.close();
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}

}

public ResultSet Select(String sql){
	
	try { 
		  rs =st.executeQuery(sql);
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return rs ;
	
}

 public int MAJ(String sql){
	 int nb =0 ; 
	 
	 try {
           nb = st.executeUpdate(sql) ;   
		System.out.println("succes"); 
	} catch (Exception e) {
		// TODO: handle exception
	 System.out.println("requete dajout non exécutée");
                e.printStackTrace();
	}
	 
	return nb ; 
 }
     	
 public boolean next() {
	 
	 
	 try {
		    return rs.next() ;  
		 
	} catch (Exception e) {
		// TODO: handle exception
		
		e.printStackTrace(); 
		return false ;
	}
	 
	 
 }
   
}