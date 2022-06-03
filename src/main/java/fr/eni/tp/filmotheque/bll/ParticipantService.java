package fr.eni.tp.filmotheque.bll;

import java.util.ArrayList;

import fr.eni.tp.filmotheque.bo.Participant;

public interface ParticipantService {
	
	public abstract ArrayList<Participant> creerListeParticipant();

	public abstract Participant getParticipantById(int id, ArrayList<Participant> listeParticipant);

	public abstract ArrayList<Participant> getListeParticipants();

}
