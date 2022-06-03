package fr.eni.tp.filmotheque.bll;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import fr.eni.tp.filmotheque.bo.Genre;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Service("genreService")
public class GenreServiceImpl implements GenreService{

	private ArrayList<Genre> listeGenre;
	
	@Override
	public ArrayList<Genre> creerListeGenre() {
		
		listeGenre = new ArrayList<>();
		
		Genre genre1 = new Genre(7,"Sport");
		Genre genre2 = new Genre(8,"Comédie");
		Genre genre3 = new Genre(9,"Drame");
		listeGenre.add(genre1);
		listeGenre.add(genre2);
		listeGenre.add(genre3);
		return listeGenre;
	}

	@Override
	public Genre getGenreById(int id, ArrayList<Genre> listeGenre) {
		
		int cp = 0;
		while(listeGenre.get(cp).getId()!=id) {
			cp++;
		}
		Genre genre = listeGenre.get(cp);
		return genre;
	}

}
