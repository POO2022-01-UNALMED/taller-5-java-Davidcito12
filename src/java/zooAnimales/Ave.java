package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal{
	private ArrayList<Ave> listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public static int cantidadAves() {
		return halcones + aguilas;
	}
	
	public void movimiento() {
		
	}
	
	public void crearHalcon() {
		Animal.setTotalAnimales(Animal.getTotalAnimales() + 1);
		Ave.halcones +=1;
	}
	
	public void crearAguila() {
		Animal.setTotalAnimales(Animal.getTotalAnimales() + 1);
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
