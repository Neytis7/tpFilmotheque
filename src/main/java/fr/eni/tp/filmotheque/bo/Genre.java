package fr.eni.tp.filmotheque.bo;

public class Genre {
	
	private Integer id;
	
	private String libelle;

	public Genre(String libelle) {
		super();
		this.libelle = libelle;
	}

	public Genre() {
		super();
	}

	@Override
	public String toString() {
		return "Genre [libelle=" + libelle + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
}
