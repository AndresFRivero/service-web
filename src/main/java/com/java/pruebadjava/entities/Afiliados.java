package com.java.pruebadjava.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "afiliado")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Afiliados implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "afi_id")
	private String id;
	
	@Column(name = "afi_nombre")
	private String nombre;
	
	@Column(name = "afi_apellidos")
	private String apellidos;
	
	@ManyToOne(targetEntity = TipoDocumento.class)
	@JoinColumn(name = "tcd_id")
	private TipoDocumento tcd_id;
	
	@Column(name = "afi_documento")
	private String documento;
	
	@Column(name = "afi_direccion")
	private String direccion;
	
	@Column(name = "afi_telefono")
	private String telefono;
	
	@Column(name = "afi_mail")
	private String mail;
	
	@Column(name = "afi_estado")
	private Integer estado;
}
