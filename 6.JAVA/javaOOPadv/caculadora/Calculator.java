package caculadora;

class Calculator implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double n1;
	private double n2;
	private double resultado;
	private String operador;
	
	public Calculator(){}
	public Calculator(double n1, double n2, double resultado, String operador){
		this.setN1(n1);
		this.setN2(n2);
		this.setResultado(resultado);
		this.setOperador(operador);
	}
	public double getN1() {
		return n1;
	}
	public void setN1(double n12) {
		this.n1 = n12;
	}
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	public double getResultado() {
		return resultado;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	public String getOperador() {
		return operador;
	}
	public void setOperador(String operador) {
		this.operador = operador;
	}
	
	public void performOperation() {
		if(this.getOperador().equals("+")) this.resultado= this.n1+this.n2;
		if(this.getOperador().equals("-")) this.resultado= this.n1-this.n2;
		if(this.getOperador().equals("*")) this.resultado= this.n1*this.n2;
		if(this.getOperador().equals("/")) this.resultado= this.n1/this.n2;
	}

}









