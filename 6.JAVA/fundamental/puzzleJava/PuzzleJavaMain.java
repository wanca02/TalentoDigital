package puzzleJava;

import java.util.ArrayList;
import java.util.Arrays;

class PuzzleJavaMain {

	public static void main(String[] args) {
		PuzzleJava po=new PuzzleJava(); 
		int[] a= {3,5,1,2,7,9,8,13,25,32};
		int[] a1=a.clone();
		ArrayList<Integer> n=po.suma_Array(a1);
		System.out.println(Arrays.toString(n.toArray()));
	}

}
