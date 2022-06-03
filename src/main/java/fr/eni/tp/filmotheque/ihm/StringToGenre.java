package fr.eni.tp.filmotheque.ihm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import fr.eni.tp.filmotheque.bll.GenreServiceImpl;
import fr.eni.tp.filmotheque.bo.Genre;

@Component
public class StringToGenre implements Converter<String,Genre>{

	private GenreServiceImpl genreServiceImpl;
	
	@Autowired
	public void setGenreService(GenreServiceImpl service) {
		this.genreServiceImpl = service;
	}
	
	
	@Override
	public Genre convert(String id) {
		Integer theId = Integer.parseInt(id);
		return genreServiceImpl.getGenreById(theId, genreServiceImpl.getListeGenre());
	}

}
