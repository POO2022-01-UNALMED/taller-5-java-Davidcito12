package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Ave extends Animal{
	private ArrayList<Ave> listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave(String nombre, int edad, String habitat, String genero, Zona zona,String colorPlumas) {
		super(nombre, edad, habitat, genero, zona);
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}
	
	public Ave(String nombre, int edad, String habitat, String genero,String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}
	
	
	public Ave() {
		super();
		listado.add(this);
	}
	
	public static int cantidadAves() {
		return halcones + aguilas;
	}
	
	public String movimiento() {
		return "volar";
	}
	
	public void crearHalcon(String nombre, int edad, String genero, Zona zona)  {
		new Ave(nombre, edad, "montanas", genero, zona, "cafe glorioso");
		Ave.halcones +=1;
	}
	
	public void crearAguila(String nombre, int edad, String genero, Zona zona) {
		new Ave(nombre, edad, "montanas", genero, zona, "blanco y amarillo");
		Ave.aguilas += 1;
	}

	
	public ArrayList<Ave> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Ave> listado) {
		this.listado = listado;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
}
