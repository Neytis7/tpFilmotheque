package fr.eni.tp.filmotheque.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.ApplicationScope;

import fr.eni.tp.filmotheque.bll.GenreService;
import fr.eni.tp.filmotheque.bll.ParticipantService;
import fr.eni.tp.filmotheque.bo.Genre;
import fr.eni.tp.filmotheque.bo.Participant;

@Configuration
public class FilmothequeConfig {

	@Bean
	@ApplicationScope
	public List<Genre> getGenres(GenreService genreService){
		return genreService.creerListeGenre();
	}
	
	@Bean
	@ApplicationScope
	public List<Participant> getParticipants(ParticipantService participantService){
		return participantService.creerListeParticipant();
	}
}
