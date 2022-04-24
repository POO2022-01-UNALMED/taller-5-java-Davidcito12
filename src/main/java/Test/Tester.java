package Test;
import gestion.*;
import zooAnimales.*;


public class Tester {
	public static void testTotalTipo(){
		
		new Anfibio();
		new Anfibio();
		new Mamifero();
		new Mamifero();
		new Mamifero();
		new Reptil();
		new Pez();
		new Ave();
		new Ave();
		String  comp = "Mamiferos: 4\n" + 
				"Aves: 4\n" + 
				"Reptiles: 2\n" + 
				"Peces: 2\n" + 
				"Anfibios: 3";
		
		System.out.println(Animal.totalPorTipo());
		if(Animal.totalPorTipo().equals(comp)) {
			System.out.println("Is fine");
		}else {
			System.out.println("Is not fine");
		}
    }
	
	public static void main(String[] args) {
		testTotalTipo();
	}
}
