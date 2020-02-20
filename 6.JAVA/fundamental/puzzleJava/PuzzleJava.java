package puzzleJava;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

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
	public ArrayList<String> arrayString(ArrayList<String> a) {
		ArrayList<String> b=(ArrayList<String>) a.clone();
		Collections.shuffle(a);
		System.out.println(Arrays.toString(a.toArray()));
		ArrayList<String> c= new ArrayList<String>();
		for(int i=0;i<a.size();i++)
			//.toArray()[i].toString().length()
			if(b.get(i).length() >5) c.add(b.get(i));
		return c;
	}
	public ArrayList<Character> alphabetR(){
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		ArrayList<Character> c= new ArrayList<Character>();
		for(int i=0;i<alphabet.length;i++) c.add(alphabet[i]);
		return c;
	}
	public void arrayLetters() {
		ArrayList<Character> c = alphabetR();
		Collections.shuffle(c);
		System.out.println("Último: "+c.get(c.toArray().length-1));
		System.out.println("Primero: "+c.get(0));
		if(c.get(0) =='a' || c.get(0) =='e' || c.get(0) =='i' || c.get(0) =='o' || c.get(0) =='u') 
			System.out.println("Vocal");
	}
	public int[] arrayNumberR() {
		int[] n10=new int[10];
		Random r = new Random();
        for(int i=0;i<n10.length;i++) n10[i]=r.nextInt(46)+55;
		return n10;
	}
	public int[] arrayNumberSort() {
		int[] n10=arrayNumberR();
		Arrays.sort(n10);
		return n10;
	}
	public String arrayCadenaR() {
		ArrayList<Character> c = alphabetR();
		Collections.shuffle(c);
		String msg=c.get(0)+""+c.get(1)+""+c.get(2)+""+c.get(3)+""+c.get(4);
		return msg;
	}
	public String[] arrayCadenaString() {
		String[] c= new String[10];
		for(int i=0;i<c.length;i++) c[i]=arrayCadenaR();
		return c;
	}
}










