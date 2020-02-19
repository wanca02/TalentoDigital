package ejercicioBasico;

import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {
	public int[] to255(int b) {
		int[] aInt = new int[b];
		for(int i=0;i<b;i++) aInt[i]=i+1;
		return aInt;
	}
	public ArrayList<Integer> to255impar(int b) {
		ArrayList<Integer> aInt = new ArrayList<Integer>(b/2);
		for(int i=0;i<b;i++) if((i+1)%2!=0) aInt.add(i+1);
		return aInt;
	}
	public int maxArray(int[] a) {
		int my=a[0];
		for(int i=1;i<a.length;i++) if(my<a[i]) my=a[i];
		return my;
	}
	public int minArray(int[] a) {
		int mi=a[0];
		for(int i=1;i<a.length;i++) if(mi>a[i]) mi=a[i];
		return mi;
	}
	public float avgArray(int[] a) {
		int[] array=a;
		return (float) Arrays.stream(array).average().orElse(Double.NaN);
	}
	public int maxArray(int[] a,int y) {
		int c=0;
		for(int i=0;i<a.length;i++) if(y<a[i]) c++;
		return c;
	}
	public int[] pow2Array(int[] a) {
		for(int i=0;i<a.length;i++) a[i]=(int) Math.pow(a[i], 2);
		return a;
	}
	public int[] negArray(int[] a) {
		for(int i=0;i<a.length;i++) if(a[i]<0) a[i]=0;
		return a;
	}
	public ArrayList<Number> maxminavg(int[] a) {
		ArrayList<Number> b= new ArrayList<Number>(3); 
		b.add(maxArray(a));
		b.add(minArray(a));
		b.add(avgArray(a));
		return b;
	}
	public int[] changeArray(int[] a) {
		for(int i=0;i<a.length-1;i++) a[i]=a[i+1]; a[a.length-1]=0; 
		return a;
	}
}







