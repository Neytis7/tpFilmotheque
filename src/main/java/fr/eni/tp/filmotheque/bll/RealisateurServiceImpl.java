package fr.eni.tp.filmotheque.bll;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import fr.eni.tp.filmotheque.bo.Realisateur;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Service("realisateurService")
public class RealisateurServiceImpl implements RealisateurService{
	
	private ArrayList<Realisateur> listeRealisateur;
	
	@Override
	public ArrayList<Realisateur> creerListeRealisateur() {
		
		listeRealisateur =new ArrayList<>();
		
		Realisateur realisateur1 = new Realisateur(3,"Steven","Spielberg");
		Realisateur realisateur2 = new Realisateur(4,"David","Yates");
		Realisateur realisateur3 = new Realisateur(5,"James","Cameron");
		
		listeRealisateur.add(realisateur1);
		listeRealisateur.add(realisateur2);
		listeRealisateur.add(realisateur3);

		return listeRealisateur;
	}
	
	@Override
	public Realisateur getRealisateurById(int id, ArrayList<Realisateur> listeRealisateur) {
		int cp = 0;
		while(listeRealisateur.get(cp).getId()!=id) {
			cp++;
		}
		Realisateur realisateur = listeRealisateur.get(cp);
		return realisateur;
	}

}
