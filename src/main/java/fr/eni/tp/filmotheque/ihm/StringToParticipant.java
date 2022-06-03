package fr.eni.tp.filmotheque.ihm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import fr.eni.tp.filmotheque.bll.ParticipantService;
import fr.eni.tp.filmotheque.bll.ParticipantServiceImpl;
import fr.eni.tp.filmotheque.bo.Participant;

@Component
public class StringToParticipant implements Converter<String,Participant>{

	private ParticipantService participantService;
	
	@Autowired
	public void setRealisateurService(ParticipantService service) {
		this.participantService = service;
	}
	
	@Override
	public Participant convert(String id) {
		Integer theId = Integer.parseInt(id);
		return participantService.getParticipantById(theId, participantService.getListeParticipants());
	}

}
