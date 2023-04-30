package com.projet.applicationDrama.model;

import java.util.Date;
import java.util.Set;




import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "acteurs")
//@Access(value=AccessType.FIELD)
@Data
public class acteurs {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nom;
	
	private String prenoms;
	
	private Date date_nais;
	
	@ManyToMany(mappedBy ="roleActeurs" )
	Set<drama> dramaActor ;
	
	
}
