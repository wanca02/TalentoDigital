package ejercicioBasico;

import java.util.ArrayList;
import java.util.Arrays;

class BasicJavaMain {

	public static void main(String[] args) {
		BasicJava po= new BasicJava();
		//Exercise 1
		System.out.println(Arrays.toString(po.to255(255)));
		//Exercise 2
		ArrayList<Integer> arr = po.to255impar(255);
		System.out.println(Arrays.toString(arr.toArray()));
		//Exercise 3
		int suma=0;
		for(int i=1;i<=10;i++) {
			suma+=i;
			System.out.println("Nuevo numero: "+i+" Suma: "+suma);
		}
		//Exercise 4
		int[] s= {1,2,3,4};
		for(int i=0;i<s.length;i++) System.out.println(s[i]);
		int[] a= {-2,7,3,-4,4,1,2};
		int[] b= a.clone();
		//Exercise 5
		System.out.println("Máximo es: "+po.maxArray(a));
		//Exercise 6
		System.out.println("AVG es: "+po.avgArray(a));
		//Exercise 7 is already done on Exercise 2!!
		//Exercise 8
		System.out.println(po.maxArray(a, 3));
		//Exercise 9
		System.out.println(Arrays.toString(po.pow2Array(a)));
		//Exercise 10;
		System.out.println(Arrays.toString(po.negArray(b)));
		//Exercise 11
		ArrayList<Number> arr1 = po.maxminavg(a);
		System.out.println(Arrays.toString(arr1.toArray()));
		//Exercise 12
		System.out.println(Arrays.toString(po.changeArray(a)));
	}

}














