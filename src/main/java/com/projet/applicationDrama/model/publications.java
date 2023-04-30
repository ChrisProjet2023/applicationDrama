package com.projet.applicationDrama.model;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "publications")
@Data
public class publications {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String num_publication;
	
	private Date date_publish;
	
	@ManyToMany(mappedBy ="publish" )
	Set<drama> dramaPublish ;
	
	//director
	@ManyToOne
	@JoinColumn(name ="user_id",referencedColumnName = "id")
	private utilisateur user;
	
}
