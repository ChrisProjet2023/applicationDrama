package com.projet.applicationDrama.model;

import java.util.Set;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "categorie")
public class categorie {
		@Id //L’attribut id correspond à la clé primaire de la table, et est donc annoté @Id. D’autre part, comme l’id est auto-incrémenté, j’ai ajouté l’annotation @GeneratedValue(strategy = GenerationType.IDENTITY).
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		
	//	@Column(name="code")
		private String code;
		
		private String libelle;
		
		@ManyToMany(mappedBy ="categories" )
		Set<drama> dramaCatego ;
}
