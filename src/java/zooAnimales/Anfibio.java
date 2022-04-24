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
		
		
	}
	
	public static int cantidadAnfibios() {
		return ranas + salamandras;
	}
	
	public void movimiento() {
		
	}
	
	public void crearRana() {
		Animal.setTotalAnimales(Animal.getTotalAnimales() + 1);
		Anfibio.ranas +=1;
	}
	
	public void crearSalamandra() {
		Animal.setTotalAnimales(Animal.getTotalAnimales() + 1);
		Anfibio.salamandras +=1;
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
