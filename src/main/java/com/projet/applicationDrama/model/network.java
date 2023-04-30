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
@Table(name = "network")
public class network {
	@Id //L’attribut id correspond à la clé primaire de la table, et est donc annoté @Id. D’autre part, comme l’id est auto-incrémenté, j’ai ajouté l’annotation @GeneratedValue(strategy = GenerationType.IDENTITY).
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nom;
	
	@OneToMany
	@JoinColumn(name ="network_id")
	private Set <drama> dramaTv = new HashSet<drama>();

}
