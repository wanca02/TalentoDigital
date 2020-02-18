package prueba1;

import java.lang.Math;
import java.util.Scanner;
public class Pythagorean {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Cateto 1: ");
		int c1=scn.nextInt();
		System.out.print("Cateto 2: ");
		int c2=scn.nextInt();
		System.out.print("La hipotenusa es: "+calculateHypotenuse(c1,c2));
	}
	public static double calculateHypotenuse(int legA, int legB) {
		double c= Math.pow(legA, 2) + Math.pow(legB, 2);
		return Math.sqrt(c);
	}

}
