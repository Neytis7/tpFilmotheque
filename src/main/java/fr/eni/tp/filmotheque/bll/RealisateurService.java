package fr.eni.tp.filmotheque.bll;

import java.util.ArrayList;

import fr.eni.tp.filmotheque.bo.Realisateur;

public interface RealisateurService {
	
	public abstract ArrayList<Realisateur> creerListeRealisateur();

	public abstract Realisateur getRealisateurById(int id, ArrayList<Realisateur> listeRealisateur);

}
