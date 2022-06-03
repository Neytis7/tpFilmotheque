package fr.eni.tp.filmotheque.bo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Participant {

	private Integer id;
	
	private String nom;
	
	private String prenom;

	@Override
	public String toString() {
		return "Realisateur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}	
}
