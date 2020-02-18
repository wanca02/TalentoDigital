package prueba1;

import java.util.Scanner;

public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Nombre: ");
		String name=scn.nextLine();
		System.out.println("Edad: ");
		String edad=scn.nextLine();
		System.out.println("Cuidad: ");
		String ciud=scn.nextLine();
		
		System.out.println("Mi nombre es "+name);
		System.out.println("Tengo "+edad+" años de edad.");
		System.out.println("Mi ciudad es "+ciud);
		
	}

}
