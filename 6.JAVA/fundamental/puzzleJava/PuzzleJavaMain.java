package puzzleJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PuzzleJavaMain {

	public static void main(String[] args) {
		PuzzleJava po=new PuzzleJava(); 
		int[] a= {3,5,1,2,7,9,8,13,25,32};
		int[] a1=a.clone();
		//Exercise 1
		ArrayList<Integer> n=po.suma_Array(a1);
		System.out.println(Arrays.toString(n.toArray()));
		//Exercise 2
		String[] b1={"hola","Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
		ArrayList<String> b= new ArrayList<String>();
		for(int i=0;i<b1.length;i++) b.add(b1[i]);
		ArrayList<String> b2= po.arrayString(b);
		System.out.println(b2);
		//Exercise 3
		//List<char[]> c = Arrays.asList(alphabet);
		po.arrayLetters();
		//Exercise 4
		System.out.println(Arrays.toString(po.arrayNumberR()));
		//Exercise 5
		int[] res=po.arrayNumberSort();
		System.out.println(Arrays.toString(res));
		System.out.println(res[0]+" "+res[res.length-1]);
		//Exercise 6
		System.out.println(po.arrayCadenaR());
		//Exercise 7
		System.out.println(Arrays.toString(po.arrayCadenaString()));
	}
}








