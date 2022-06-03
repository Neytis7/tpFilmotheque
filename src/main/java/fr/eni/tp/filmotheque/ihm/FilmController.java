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
import fr.eni.tp.filmotheque.bo.Avis;
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
	public String ajouterFilm(@ModelAttribute("film") Film film,Model modele) {
		film.setId(filmService.getCompteur());
		filmService.addCompteur();
		filmService.getAllFilm().add(film);
		modele.addAttribute("listeFilm",filmService.getAllFilm());
		return "redirect:/";
	}
	
	@RequestMapping("/movies/ajouter")
	public String afficherAjouterFilm(Model modele){
		modele.addAttribute("film",new Film());
		return "ajouterFilm";
	}
	
	@RequestMapping("/movies/avis")
	public String afficherAjoutAvisFilm(@RequestParam int id,Model modele) {
		int cp = 0;
		while(filmService.getAllFilm().get(cp).getId()!=id) {
			cp++;
		}
		Film film = filmService.getAllFilm().get(cp);
		modele.addAttribute("film", film);
		modele.addAttribute("avis",new Avis());
		return "ajoutAvis";
	}
	
	@RequestMapping("movies/avis/add")
	public String ajouterAvis(@ModelAttribute("avis") Avis avis,@RequestParam int id, Model modele) {
		int cp = 0;
		while(filmService.getAllFilm().get(cp).getId()!=id) {
			cp++;
		}
		if(filmService.getAllFilm().get(cp).getListeAvis() == null) {
			filmService.getAllFilm().get(cp).setListeAvis(new ArrayList<Avis>());
			filmService.getAllFilm().get(cp).getListeAvis().add(avis);
			return "redirect:/";
		}else {
			filmService.getAllFilm().get(cp).getListeAvis().add(avis);
			return "redirect:/";
		}
	}
}
