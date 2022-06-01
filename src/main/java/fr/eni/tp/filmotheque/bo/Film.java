package fr.eni.tp.filmotheque.bo;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Film {
	
	private Integer id;
	
	private String titre;
	
	private Integer annee;
	
	private Integer duree;
	
	private String synopsis;
	
	private Genre genre;
	
	private Realisateur realisateur;
	
	private ArrayList<Acteur> listeActeurs;


	@Override
	public String toString() {
		return "Film [id=" + id + ", titre=" + titre + ", annee=" + annee + ", duree=" + duree + ", synopsis="
				+ synopsis + ", genre=" + genre + ", realisateur=" + realisateur + ", listeActeur=" + listeActeurs + "]";
	}
}
