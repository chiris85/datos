package com.christian.datos.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Book {
	
	@Id
	@GeneratedValue
	private long id;
	
	@NotNull
	private String title, isbn;
}
