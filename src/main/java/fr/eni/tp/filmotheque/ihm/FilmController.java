package fr.eni.tp.filmotheque.ihm;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.eni.tp.filmotheque.bll.FilmService;
import fr.eni.tp.filmotheque.bo.Film;

@Controller
public class FilmController {

	private FilmService filmService;
	private ArrayList<Film> listeFilm;

	@Autowired
	public FilmController(FilmService filmService) {
		super();
		this.filmService = filmService;
		listeFilm = filmService.creerListeFilms();
	}

	@RequestMapping("movies/detail")
	public String afficherDetail(@RequestParam int id, Model modele) {
		int cp = 0;
		while(listeFilm.get(cp).getId()!=id) {
			cp++;
		}
		Film film = listeFilm.get(cp);
		modele.addAttribute("film", film);
		return "detailFilm";
	}

	@RequestMapping({"","/movies"})
	public String afficherListeFilm(Model modele) {
		modele.addAttribute("listeFilm", listeFilm);
		return "listeFilm";
	}
}
