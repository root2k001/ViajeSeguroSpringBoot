package com.viajes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.viajes.repository.CiudadRepository;

@SpringBootApplication
public class ViajeSeguroSpringBootApplication implements CommandLineRunner{

	
	@Autowired //inyectar dependencias de forma automatica mediante instancias 
	private CiudadRepository repoCiudad;  //simpicacion de instancia

	private BusRepository repoBus; 
	
	public static void main(String[] args) {
		SpringApplication.run(ViajeSeguroSpringBootApplication.class, args);
	}

	
	@Override //para que una clase hija reemplaza o personalice un metodo heredado
	public void run(String ...args)throws Exception{
		
		System.out.println("=============");
		System.out.println("Listado de Ciudades");
		System.out.println("=============");
		repoCiudad.findAll().forEach(c->{
			System.out.println(c.getIdCiudad()+" - "+
								c.getNombre()+" - "+
								c.getEstado());
			
		});
		
	}
	
}
