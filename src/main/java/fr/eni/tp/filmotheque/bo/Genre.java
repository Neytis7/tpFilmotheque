package fr.eni.tp.filmotheque.bo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Genre {
	
	private Integer id;
	
	private String libelle;

	public Genre(String libelle) {
		super();
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return "Genre [libelle=" + libelle + "]";
	}	
}
