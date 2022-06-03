package fr.eni.tp.filmotheque.ihm;

import java.util.ArrayList;

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
	private ArrayList<Film> listeFilm;
	private Integer compteur;

	@Autowired
	public FilmController(FilmService filmService) {
		super();
		this.filmService = filmService;
		listeFilm = filmService.creerListeFilms();
		this.compteur = 5;
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
	
	@RequestMapping("movies/ajouter/add")
	public String ajouterFilm(@ModelAttribute("film") Film film,Model modele,BindingResult validationResult) {
		if(validationResult.hasErrors()) {
			return "ajouterFilm";
		}
		film.setId(this.compteur);
		this.compteur = this.compteur+1;
		listeFilm.add(film);
		modele.addAttribute("listeFilm",listeFilm);
		return "redirect:/";
	}
	
	@RequestMapping("movies/ajouter")
	public String afficherAjouterFilm(Model modele){
		modele.addAttribute("film",new Film());
		return "ajouterFilm";
	}
}
