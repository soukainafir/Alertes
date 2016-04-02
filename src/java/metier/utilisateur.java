package metier;

public class utilisateur {
	
	private String nom;
	private String prenom;
	private String email;
	private String tel;
	private String password;
	private String dt_visit;
	private String Id_user ;
	private String type;
	
	
	
	
	
	public utilisateur(String password, String id_user) {
		super();
		this.password = password;
		Id_user = id_user;
	}



	public utilisateur(String nom, String prenom, String email, String tel, String password, String dt_visit,
			String id_user, String type) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.tel = tel;
		this.password = password;
		this.dt_visit = dt_visit;
		Id_user = id_user;
		this.type = type;
	}



	public utilisateur() {

	}
	
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDt_visit() {
		return dt_visit;
	}
	public void setDt_visit(String dt_visit) {
		this.dt_visit = dt_visit;
	}
	public String getId_user() {
		return Id_user;
	}
	public void setId_user(String Id_user) {
		this.Id_user = Id_user;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String toString() {
		return "view.Produit[ id=" + Id_user + " ]"; 
	}

	
	
}
