package fr.eni.tp.filmotheque.bll;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import fr.eni.tp.filmotheque.bo.Acteur;
import fr.eni.tp.filmotheque.bo.Film;
import fr.eni.tp.filmotheque.bo.Genre;
import fr.eni.tp.filmotheque.bo.Realisateur;

@Service("filmService")
public class FilmServiceImpl implements FilmService {

	@Override
	public ArrayList<Film> creerListeFilms() {
		
		ArrayList<Film> listeFilms = new ArrayList<>();

		Film filmN1 = new Film();

		filmN1.setId(1);
		filmN1.setTitre("Avatar");
		filmN1.setAnnee(2010);
		filmN1.setDuree(140);
		filmN1.setSynopsis("Alien bleu");

		Genre actionAventure = new Genre();
		actionAventure.setLibelle("Action-Aventure");
		filmN1.setGenre(actionAventure);

		Realisateur realisateur1 = new Realisateur();
		realisateur1.setNom("Creed");
		realisateur1.setPrenom("Curtis");
		filmN1.setRealisateur(realisateur1);

		ArrayList<Acteur> listeActeurs = new ArrayList<>();

		Acteur acteur1 = new Acteur();
		acteur1.setNom("Jean");
		acteur1.setPrenom("Neymar");

		Acteur acteur2 = new Acteur();
		acteur2.setNom("Bobby");
		acteur2.setPrenom("Luke");

		listeActeurs.add(acteur1);
		listeActeurs.add(acteur2);

		filmN1.setListeActeurs(listeActeurs);

		listeFilms.add(filmN1);
		
		
		
		Film filmN2 = new Film();

		filmN2.setId(2);
		filmN2.setTitre("Saw");
		filmN2.setAnnee(2010);
		filmN2.setDuree(140);
		filmN2.setSynopsis("Mec en velo");

		Genre Horreur = new Genre();
		Horreur.setLibelle("Horreur");
		filmN2.setGenre(Horreur);

		Realisateur realisateur2 = new Realisateur();
		realisateur2.setNom("Jack");
		realisateur2.setPrenom("Brice");
		filmN2.setRealisateur(realisateur2);

		ArrayList<Acteur> listeActeurs2 = new ArrayList<>();

		Acteur acteur3 = new Acteur();
		acteur1.setNom("Lise");
		acteur1.setPrenom("Lee");

		Acteur acteur4 = new Acteur();
		acteur2.setNom("Mickel");
		acteur2.setPrenom("Bryan");

		listeActeurs2.add(acteur3);
		listeActeurs2.add(acteur4);

		filmN2.setListeActeurs(listeActeurs2);

		listeFilms.add(filmN2);
		
		return listeFilms;
	}

}
