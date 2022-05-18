package com.java.pruebadjava.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tipo_documento")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TipoDocumento {
	
	@Id
	@Column(name = "tcd_id")
	private String id;
	
	@Column(name = "tcd_nombre")
	private String nombre;
	
	@Column(name = "tcd_estado")
	private Integer estado;

}
