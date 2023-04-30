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
@Table(name = "pays")
public class pays {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String code_iso;
	
	private String libelle;
	
	private String indicatif;
	
	@OneToMany
	@JoinColumn(name ="pays_id")
	private Set <drama> dramaPays = new HashSet<drama>();

}
