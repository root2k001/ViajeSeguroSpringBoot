package com.viajes.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

public class Ruta {

	@Entity
	@Table(name="tb_ruta")
	public class Rura{
		
		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		@Column(name="id_ruta")
		private int idRuta;
		
		
		//relacionar de muchos a uno.... muchas rutas pueden tener  la misma ciudad
		// de origen
@ManyToOne
@JoinColumn(name="id_ciudad_origen",nullable=false)
private Ciudad ciudadOrigen;
//muchas rutas puden tener  la misma ciudad de destino
@ManyToOne
@JoinColumn(name="id_ciudad_destino", nullable=false)
private Ciudad ciudadDestino;
@Column(name="duracion_horas", nullable=false)
private double duracionHoras;
@Column(name="precio",nullable=false)
private double precio;

@Column(name="estado",nullable = false,length = 20)
private String estado;

public Rura() {
	super();
}

public int getIdRuta() {
	return idRuta;
}

public void setIdRuta(int idRuta) {
	this.idRuta = idRuta;
}

public Ciudad getCiudadOrigen() {
	return ciudadOrigen;
}

public void setCiudadOrigen(Ciudad ciudadOrigen) {
	this.ciudadOrigen = ciudadOrigen;
}

public Ciudad getCiudadDestino() {
	return ciudadDestino;
}

public void setCiudadDestino(Ciudad ciudadDestino) {
	this.ciudadDestino = ciudadDestino;
}

public double getDuracionHoras() {
	return duracionHoras;
}

public void setDuracionHoras(double duracionHoras) {
	this.duracionHoras = duracionHoras;
}

public double getPrecio() {
	return precio;
}

public void setPrecio(double precio) {
	this.precio = precio;
}

public String getEstado() {
	return estado;
}

public void setEstado(String estado) {
	this.estado = estado;
}



		
	}
	
	
	
}
