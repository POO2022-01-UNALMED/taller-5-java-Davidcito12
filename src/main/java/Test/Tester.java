package Test;
import gestion.*;
import zooAnimales.*;


public class Tester {
	public static void testZoologico(){
			
			Zoologico zoo1 = new Zoologico();
			Zoologico zoo2 = new Zoologico("Central park", "Calle Principal");
			
			if(zoo1.getNombre() == null && zoo2.getNombre().equals("Central park")) {
				System.out.println("TestZoologico is fine");
			}else {
				System.out.println("TestZoologico is not fine");
			}
	}
	
	public static void main(String[] args) {
		testZoologico();
	}
}
