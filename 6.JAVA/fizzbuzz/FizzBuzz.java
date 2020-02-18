package prueba1;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Número: ");
		int n=scn.nextInt();
		System.out.print(fizzBuzz(n));

	}
	public static String fizzBuzz(int number) {
		String msg = "";
        if(number%3==0 && number%5==0) msg="FizzBuzz";
        else if(number%5==0) msg="Buzz";
        else if(number%3==0) msg="Fizz";
        else msg= Integer.toString(number);
		return msg;
    }
}
