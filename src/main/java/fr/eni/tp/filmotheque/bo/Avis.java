package fr.eni.tp.filmotheque.bo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Avis {
	
	private Integer id;
	
	private String texte;

	@Override
	public String toString() {
		return "Avis [id=" + id + ", texte=" + texte + "]";
	}
}
