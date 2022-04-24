package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Reptil extends Animal{
	private ArrayList<Reptil> listado;
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	
	public Reptil(String nombre, int edad, String habitat, String genero, Zona zona,String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero, zona);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
	}
	
	public Reptil() {
		super();
		listado.add(this);
	}
	
	
	public static int cantidadReptiles() {
		return iguanas + serpientes;
	}
	
	public String movimiento() {
		return "reptar";
	}
	
	public void crearIguana(String nombre, int edad, String genero, Zona zona) {
		new Reptil(nombre, edad, "humedal",genero, zona, "verde", 3);
		Reptil.iguanas +=1;

	}
	
	public void crearSerpiente(String nombre, int edad, String genero, Zona zona) {
		new Reptil(nombre, edad, "jungla",genero, zona, "blanco", 1);
		Reptil.serpientes +=1;
	}
	
	
	
	public ArrayList<Reptil> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Reptil> listado) {
		this.listado = listado;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getLargoCola() {
		return largoCola;
	}

	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}

	
}
