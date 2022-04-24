package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Mamifero extends Animal{
	private ArrayList<Mamifero> listado;
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero(String nombre, int edad, String habitat, String genero, Zona zona,boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero, zona);
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
	}
	
	public Mamifero() {
		super();
		listado.add(this);
	}
	
	public static int cantidadMamiferos() {
		return caballos + leones;
	}
	
	public void crearCaballo(String nombre, int edad, String genero, Zona zona) {
		new Mamifero(nombre, edad, "pradera", genero, zona, true, 4);
		Mamifero.caballos += 1;
	}
	
	public void crearLeon(String nombre, int edad, String genero, Zona zona) {
		new Mamifero(nombre, edad, "selva", genero, zona, true, 4);
		Mamifero.leones += 1;
	}

	public ArrayList<Mamifero> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Mamifero> listado) {
		this.listado = listado;
	}

	public boolean isPelaje() {
		return pelaje;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
	
}