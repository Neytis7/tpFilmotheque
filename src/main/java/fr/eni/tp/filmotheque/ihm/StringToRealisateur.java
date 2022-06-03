package fr.eni.tp.filmotheque.ihm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import fr.eni.tp.filmotheque.bll.RealisateurServiceImpl;
import fr.eni.tp.filmotheque.bo.Realisateur;

@Component
public class StringToRealisateur implements Converter<String,Realisateur>{

	private RealisateurServiceImpl realisateurServiceImpl;
	
	@Autowired
	public void setRealisateurService(RealisateurServiceImpl service) {
		this.realisateurServiceImpl = service;
	}
	
	@Override
	public Realisateur convert(String id) {
		Integer theId = Integer.parseInt(id);
		return realisateurServiceImpl.getRealisateurById(theId, realisateurServiceImpl.getListeRealisateur());
	}

}
