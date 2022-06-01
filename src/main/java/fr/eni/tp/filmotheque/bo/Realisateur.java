package fr.eni.tp.filmotheque.bo;

public class Realisateur {

	private Integer id;
	
	private String nom;
	
	private String prenom;

	public Realisateur() {
		super();
	}

	@Override
	public String toString() {
		return "Realisateur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
	
	
}