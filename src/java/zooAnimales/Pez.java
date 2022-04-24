package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal{
	private ArrayList<Pez> listado;
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public static int cantidadPeces() {
		return salmones + bacalaos;
	}
	
	public void movimiento() {
		
	}
	
	public void crearSalmon() {
		Animal.setTotalAnimales(Animal.getTotalAnimales() + 1);
		Pez.salmones +=1;
	}
	
	public void crearBacalao() {
		Animal.setTotalAnimales(Animal.getTotalAnimales() + 1);
		Pez.bacalaos +=1;
	}
	
	
	public ArrayList<Pez> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Pez> listado) {
		this.listado = listado;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getCantidadAletas() {
		return cantidadAletas;
	}

	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	
}
