package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal{
	private ArrayList<Reptil> listado;
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public static int cantidadReptiles() {
		return iguanas + serpientes;
	}
	
	public void movimiento() {
		
	}
	
	public void crearIguana() {
		Animal.setTotalAnimales(Animal.getTotalAnimales() + 1);
		Reptil.iguanas +=1;

	}
	
	public void crearSerpiente() {
		Animal.setTotalAnimales(Animal.getTotalAnimales() + 1);
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
