package zooAnimales;

import java.util.ArrayList;
import gestion.Zona;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	public void movimiento() {
	}
	
	public String totalPorTipo() {
		return 
				"Mamiferos: " + Mamifero.cantidadMamiferos() +
				"Aves: " + Ave.cantidadAves() +
				"Reptiles: " + Reptil.cantidadReptiles() +
				"Peces: " + Pez.cantidadPeces() +
				"Anfibios: " + Anfibio.cantidadAnfibios();
	}
	
	public String toString() {
		return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero +
				" la zona en la que me ubico es " + zona + ", en el " + zona.getZoo().getNombre();	
	}
	
	public Animal(String nombre, int edad, String habitat, String genero, Zona zona) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat= habitat;
		this.genero = genero;
		this.zona = zona;
		
	}
	public Animal() {
		this.nombre = "No clue";
		this.edad = 69;
		this.habitat= "N";
		this.genero = "Pelmazo";
		this.zona = new Zona();
		
	}

	public static int getTotalAnimales() {
		return totalAnimales;
	}

	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}
}
