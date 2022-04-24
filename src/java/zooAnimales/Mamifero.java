package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal{
	private ArrayList<Mamifero> listado;
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public static int cantidadMamiferos() {
		return caballos + leones;
	}
	
	public void crearCaballo() {
		Animal.setTotalAnimales(Animal.getTotalAnimales() + 1);
		Mamifero.caballos += 1;
	
	}
	
	public void crearLeon() {
		Animal.setTotalAnimales(Animal.getTotalAnimales() + 1);
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
