package com.projet.applicationDrama.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "utilisateur")
public class utilisateur {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String login;
	
	private String mot_passe;
	
	//publications
	@OneToMany
	@JoinColumn(name ="user_id")
	private Set <publications> userPublish = new HashSet<publications>();

}
