package com.projet.applicationDrama.model;

import java.time.LocalDateTime;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import lombok.Data;

//table associative de drama et internaute
@Entity
@Data
public class commentaires {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	//@MapsId signifie que nous lions ces champs à une partie de la clé, et ce sont les clés étrangères d'une relation plusieurs-à-un. Nous en avons besoin car, comme nous l'avons mentionné, nous ne pouvons pas avoir d'entités dans la clé composite.
	
	@ManyToOne
	@JoinColumn(name = "dramaId",referencedColumnName = "id")
	drama dramas;

	@ManyToOne
	@JoinColumn(name = "internauteId",referencedColumnName = "id")
	internaute internautes;
	  
	private String commentaires;
	
	private LocalDateTime heureComment;
}
