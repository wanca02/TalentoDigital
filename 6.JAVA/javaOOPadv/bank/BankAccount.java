package bank;

public class BankAccount {
	private String n_cuenta;
	private double s_c_corriente;
	private double s_c_ahorro;
	
	private static int no_cuentas;
	private static int c_dinero;
	
	private String n_r_cuenta() {
		String n="";
		for(int i=0;i<11;i++) n+=Integer.toString((int) Math.floor(Math.random()*9));
		return n; 
	}
	
	public BankAccount() {
		this.n_cuenta=n_r_cuenta();
		no_cuentas++;
	}

	public double getS_c_corriente() {
		return s_c_corriente;
	}

	public void setS_c_corriente(double s_c_corriente) {
		this.s_c_corriente = s_c_corriente;
	}

	public double getS_c_ahorro() {
		return s_c_ahorro;
	}

	public void setS_c_ahorro(double s_c_ahorro) {
		this.s_c_ahorro = s_c_ahorro;
	}
	
}






