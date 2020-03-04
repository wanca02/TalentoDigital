package caculadora;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		
		c.setN1(10.5);
		c.setOperador("-");
		c.setN2(5.2);
		c.performOperation();
		System.out.println(c.getResultado());
	}

}
