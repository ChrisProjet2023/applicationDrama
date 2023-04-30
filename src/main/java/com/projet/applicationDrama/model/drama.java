package com.projet.applicationDrama.model;

import java.util.Set;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dramas")
@Data
public class drama {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nom;
	
	private Integer views;
	
	private Integer episodes;
	
	private Integer duree;
	
	private boolean status;
	

	//categorie
	@ManyToMany()
	@JoinTable(name = "categorie_drama", joinColumns = @JoinColumn(name = "drama_id"),
	           inverseJoinColumns = @JoinColumn(name = "categorie_id"))
	Set<categorie> categories ;
	
	//pays
	@ManyToOne
	@JoinColumn(name ="pays_id",referencedColumnName = "id")
	private pays pays;
	
	//director
	@ManyToOne
	@JoinColumn(name ="director_id",referencedColumnName = "id")
	private directors director;
	
	//network
	@ManyToOne
	@JoinColumn(name ="network_id",referencedColumnName = "id")
	private network chaineTv;

	//acteurs
	@ManyToMany()
	@JoinTable(name = "role", joinColumns = @JoinColumn(name = "drama_id"),
	           inverseJoinColumns = @JoinColumn(name = "acteur_id"))
	Set<acteurs> roleActeurs ;
	
	//publications
	@ManyToMany()
	@JoinTable(name = "puslish_drama", joinColumns = @JoinColumn(name = "drama_id"),
	           inverseJoinColumns = @JoinColumn(name = "publication_id"))
	Set<publications> publish ;
	
	//commentaires
	@OneToMany(mappedBy="dramas")
	Set<commentaires> comments;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
