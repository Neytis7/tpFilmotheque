package fr.eni.tp.filmotheque.ihm;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.eni.tp.filmotheque.bll.FilmService;
import fr.eni.tp.filmotheque.bo.Film;

@Controller
public class FilmController {

	private FilmService filmService;

	@Autowired
	public FilmController(FilmService filmService) {
		super();
		this.filmService = filmService;
		filmService.creerListeFilms();
	}

	@RequestMapping("/movies/detail")
	public String afficherDetail(@RequestParam int id, Model modele) {
		int cp = 0;
		while(filmService.getAllFilm().get(cp).getId()!=id) {
			cp++;
		}
		Film film = filmService.getAllFilm().get(cp);
		modele.addAttribute("film", film);
		return "detailFilm";
	}

	@RequestMapping(" ")
	public String afficherListeFilm(Model modele) {
		modele.addAttribute("listeFilm", filmService.getAllFilm());
		return "listeFilm";
	}
	
	@RequestMapping("/movies/ajouter/add")
	public String ajouterFilm(@ModelAttribute("film") Film film,Model modele,BindingResult validationResult) {
		if(validationResult.hasErrors()) {
			return "ajouterFilm";
		}
		film.setId(filmService.getCompteur());
		filmService.addCompteur();
		filmService.addFilm(film);
		modele.addAttribute("listeFilm",filmService.getAllFilm());
		return "redirect:/";
	}
	
	@RequestMapping("/movies/ajouter")
	public String afficherAjouterFilm(Model modele){
		modele.addAttribute("film",new Film());
		return "ajouterFilm";
	}
}
