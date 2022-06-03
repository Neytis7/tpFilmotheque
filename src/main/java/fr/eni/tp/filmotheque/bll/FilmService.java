package fr.eni.tp.filmotheque.bll;

import java.util.ArrayList;

import fr.eni.tp.filmotheque.bo.Film;

public interface FilmService {
	
	public abstract ArrayList<Film> creerListeFilms();
	
	public abstract ArrayList<Film> getAllFilm();
	
	public abstract int getCompteur();
	
	public abstract void addCompteur();
	

}
