package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Anfibio extends Animal{
	private ArrayList<Anfibio> listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(String nombre, int edad, String habitat, String genero, Zona zona,String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero, zona);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
	}
	
	public Anfibio(String nombre, int edad, String habitat, String genero,String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
	}
	
	public Anfibio() {
		super();
		listado.add(this);
	}
	
	public static int cantidadAnfibios() {
		return ranas + salamandras;
	}
	
	public String movimiento() {
		return "saltar";
	}
	
	public Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio.ranas +=1;
		return new Anfibio(nombre, edad, "selva", genero, "rojo", true);
	}
	
	public Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio.salamandras +=1;
		return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean getVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}

	public ArrayList<Anfibio> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Anfibio> listado) {
		this.listado = listado;
	}
	
}
