package fr.eni.tp.filmotheque.bll;

import java.util.ArrayList;

import fr.eni.tp.filmotheque.bo.Genre;

public interface GenreService {

	public abstract ArrayList<Genre> creerListeGenre();
	public abstract Genre getGenreById(int id, ArrayList<Genre> listeGenre);
}
