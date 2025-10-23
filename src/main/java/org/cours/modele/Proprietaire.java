package org.cours.modele;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity 
@Data 
@RequiredArgsConstructor 
//@NoArgsConstructor 
public class Proprietaire { 
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO) 
	@Setter
	@Getter
	private long id; 
	
	@NonNull 
	private String nom; 
	
	@NonNull 
	private String prenom; 
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="proprietaire")
	@JsonIgnore
	private List<Voiture> voitures; 
		
	public Proprietaire(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public void setId(Long id) {
		this.setId(id);
		
	}

	public  Proprietaire getId() {
		return this.getId();
	}
} 
