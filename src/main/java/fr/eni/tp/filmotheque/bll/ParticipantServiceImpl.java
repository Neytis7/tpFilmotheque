package fr.eni.tp.filmotheque.bll;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import fr.eni.tp.filmotheque.bo.Participant;
import lombok.Getter;
import lombok.Setter;

@Service("ParticipantService")
public class ParticipantServiceImpl implements ParticipantService{
	
	private ArrayList<Participant> listeParticipants;
	
	@Override
	public ArrayList<Participant> creerListeParticipant() {
		
		listeParticipants =new ArrayList<>();
		
		Participant realisateur1 = new Participant(3,"Steven","Spielberg");
		Participant realisateur2 = new Participant(4,"David","Yates");
		Participant realisateur3 = new Participant(5,"James","Cameron");
		
		listeParticipants.add(realisateur1);
		listeParticipants.add(realisateur2);
		listeParticipants.add(realisateur3);

		return listeParticipants;
	}
	
	@Override
	public Participant getParticipantById(int id, ArrayList<Participant> listeRealisateur) {
		int cp = 0;
		while(listeRealisateur.get(cp).getId()!=id) {
			cp++;
		}
		Participant realisateur = listeRealisateur.get(cp);
		return realisateur;
	}
	
	@Override
	public ArrayList<Participant> getListeParticipants(){
		return listeParticipants;
	}

}
