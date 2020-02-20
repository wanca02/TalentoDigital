package exceptsJava;

import java.util.ArrayList;

public class ExceptsJava {

	public static void main(String[] args) {
		ArrayList<Object> myList = new ArrayList<Object>();
		myList.add("13");
		myList.add("Hola Mundo");
		myList.add(48);
		myList.add("Adios Mundo");
		
		for(int i = 0; i < myList.size(); i++) {
		    try {
		    	Integer castedValue = (Integer) myList.get(i);
		    	System.out.println(myList.get(i));
		    }catch (Exception e) {
		    	System.out.println("no se pudo");
		    }
		}

	}

}
