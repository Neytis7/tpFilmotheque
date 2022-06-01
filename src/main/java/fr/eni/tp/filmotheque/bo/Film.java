package fr.eni.tp.filmotheque.bo;

import java.util.ArrayList;

public class Film {
	
	private Integer id;
	
	private String titre;
	
	private Integer annee;
	
	private Integer duree;
	
	private String synopsis;
	
	private Genre genre;
	
	private Realisateur realisateur;
	
	private ArrayList<Acteur> listeActeurs;


	public Film() {
		super();
		listeActeurs = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "Film [id=" + id + ", titre=" + titre + ", annee=" + annee + ", duree=" + duree + ", synopsis="
				+ synopsis + ", genre=" + genre + ", realisateur=" + realisateur + ", listeActeur=" + listeActeurs + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Integer getAnnee() {
		return annee;
	}

	public void setAnnee(Integer annee) {
		this.annee = annee;
	}

	public Integer getDuree() {
		return duree;
	}

	public void setDuree(Integer duree) {
		this.duree = duree;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public Realisateur getRealisateur() {
		return realisateur;
	}

	public void setRealisateur(Realisateur realisateur) {
		this.realisateur = realisateur;
	}

	public ArrayList<Acteur> getListeActeurs() {
		return listeActeurs;
	}

	public void setListeActeurs(ArrayList<Acteur> listeActeurs) {
		this.listeActeurs = listeActeurs;
	}
	
}
