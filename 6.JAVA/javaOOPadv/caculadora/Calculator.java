package caculadora;

class Calculator implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private double n1;
	private double n2;
	private double resultado;
	private String operador="";
	private static boolean var=true;
	
	public Calculator(){}
	public Calculator(double n2, double resultado, String operador){
		//this.setN1(n1);
		this.setN2(n2);
		this.setResultado(resultado);
		this.setOperador(operador);
	}
	/*
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}*/
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
	
	public void performOperation(double n) {
		if(var) {this.setResultado(n); var=false;}
		else {
			this.setN2(n);
			if(this.getOperador()!="") doCalcular(this.getOperador());
		}
	}
	private void doCalcular(String s) {
		// TODO Auto-generated method stub
		if(this.getOperador().equals("+")) this.setResultado(this.getResultado()+this.getN2());
		else if(this.getOperador().equals("-")) this.setResultado(this.getResultado()-this.getN2());
		else if(this.getOperador().equals("*")) this.setResultado(this.getResultado()*this.getN2());
		else if(this.getOperador().equals("/")) this.setResultado(this.getResultado()/this.getN2());
		else System.out.println("Error");
	}
	public void performOperation(String o) {
		this.setOperador(o);
		if(this.getOperador().equals("=")) System.out.println("Resultado: "+this.getResultado());
	}

}









