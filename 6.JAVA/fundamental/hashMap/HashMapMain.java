package hashMap;

import java.util.Scanner;

class HashMapMain {
	public static void main(String[] args) {
		HashMapImport hash= new HashMapImport();
		hash.createTrankList();
		Scanner scn = new Scanner(System.in);
        String song=scn.nextLine();
        System.out.println("El artista es: "+hash.getSong(song));
    }

}
