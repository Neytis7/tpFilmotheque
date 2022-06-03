package fr.eni.tp.filmotheque.bll;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import fr.eni.tp.filmotheque.bo.Film;
import fr.eni.tp.filmotheque.bo.Genre;
import fr.eni.tp.filmotheque.bo.Participant;

@Service("filmService")
public class FilmServiceImpl implements FilmService {

	private ArrayList<Film>listeFilms;
	private Integer compteur;
	
	@Override
	public ArrayList<Film> creerListeFilms() {

		this.listeFilms = new ArrayList<>();
		this.compteur = 1;

		Film filmN1 = new Film();

		filmN1.setId(this.compteur);
		filmN1.setTitre("Avatar");
		filmN1.setAnnee(2010);
		filmN1.setDuree(140);
		filmN1.setSynopsis("Alien bleu");
		
		Genre actionAventure = new Genre();
		actionAventure.setLibelle("Action-Aventure");
		filmN1.setGenre(actionAventure);

		Participant participant1 = new Participant();
		participant1.setNom("Creed");
		participant1.setPrenom("Curtis");
		filmN1.setRealisateur(participant1);
		
		ArrayList<Participant> listeActeurs = new ArrayList<>();
		
		Participant acteur1 = new Participant();
		acteur1.setNom("Jean");
		acteur1.setPrenom("Neymar");

		Participant acteur2 = new Participant();
		acteur2.setNom("Bobby");
		acteur2.setPrenom("Luke");

		listeActeurs.add(acteur1);
		listeActeurs.add(acteur2);
		filmN1.setListeActeurs(listeActeurs);

		listeFilms.add(filmN1);
		
		addCompteur();
		
		Film filmN2 = new Film();

		filmN2.setId(this.compteur);
		filmN2.setTitre("Saw");
		filmN2.setAnnee(2009);
		filmN2.setDuree(90);
		filmN2.setSynopsis("Mec en velo");

		Genre Horreur = new Genre();
		Horreur.setLibelle("Horreur");
		filmN2.setGenre(Horreur);
		

		Participant realisateur2 = new Participant();
		realisateur2.setNom("Jack");
		realisateur2.setPrenom("Brice");
		filmN2.setRealisateur(realisateur2);

		ArrayList<Participant> listeActeurs2 = new ArrayList<>();

		Participant acteur3 = new Participant();
		acteur3.setNom("Lise");
		acteur3.setPrenom("Lee");

		Participant acteur4 = new Participant();
		acteur4.setNom("Mickel");
		acteur4.setPrenom("Bryan");
		
		listeActeurs2.add(acteur3);
		listeActeurs2.add(acteur4);
		filmN2.setListeActeurs(listeActeurs2);

		listeFilms.add(filmN2);
		
		addCompteur();
		
		return listeFilms;
	}

	@Override
	public ArrayList<Film> getAllFilm() {
		return this.listeFilms;
	}

	@Override
	public int getCompteur() {
		return this.compteur;
	}

	@Override
	public void addCompteur() {
		this.compteur = this.compteur+1;
	}

	@Override
	public void addFilm(Film film) {
		this.listeFilms.add(film);
		
	}
}
