package metier;

import java.sql.*;

import com.bdd.BDD;

public class User_Manager extends BDD {

	public User_Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void Adduser(utilisateur  u){
   	   
     connect();
     String sql="insert into utilisateur values('"+u.getId_user()+"','"+u.getNom()+"','"+u.getPrenom()+"','"+u.getPassword()+"','"+u.getEmail()+"','"+u.getTel()+"''"+u.getType()+"','"+u.getDt_visit()+"' ";
	MAJ(sql);
	disconnect();
     
	}
	
	public void deleteuser(String Id){
		connect();
		String sql ="delete from utilisateur where id_user ='"+Id+"' " ;
	    MAJ(sql);
	    disconnect();
	}
	
	public utilisateur find(String Id){
		utilisateur u =null ; 
		connect();
		String sql ="select * from utilisateur where Id_user ='"+Id+"'";
		ResultSet rs = Select(sql);
	try{	
		if(rs.next()){
			
			u =new utilisateur();
			u.setId_user(rs.getString(1));
			u.setPassword(rs.getString(2));
			
			
		}
	}catch(SQLException e){
			e.printStackTrace();
		}
		disconnect();
		return u ;
	}

	public utilisateur Authentificat(String Id,String pass){
		utilisateur u =null ; 
		connect();
		String sql ="select * from utilisateur where Id_user ='"+Id+"' and password='"+pass+"' ";
		ResultSet rs = Select(sql);
	try{	
		if(rs.next()){
			
			u =new utilisateur();
			u.setId_user(rs.getString("Id_user"));
			u.setPassword(rs.getString("password"));
			u.setEmail(rs.getString("Email"));
			u.setPrenom(rs.getString("Prenom"));
			 u.setTel(rs.getString("Téléphone"));
			 u.setNom(rs.getString("Nom"));
			
			
		}
	}catch(SQLException e){
			e.printStackTrace();
			System.out.println(e);
		}
		disconnect();
		return u ;
	}
	
}