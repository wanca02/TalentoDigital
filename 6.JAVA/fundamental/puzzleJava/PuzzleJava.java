package puzzleJava;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class PuzzleJava {
	public ArrayList<Integer> suma_Array(int[] a) {
		int suma= Arrays.stream(a).sum();
		ArrayList<Integer> n=new ArrayList<Integer>();
		ArrayList<Integer> b=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) if(a[i]>10) n.add(a[i]);
		b.add(suma);
		b.addAll(n);
		return b;
	}
}
