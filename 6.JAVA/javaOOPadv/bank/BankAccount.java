package bank;

public class BankAccount {
	private String numero_cuenta;
	private double saldo_cuenta_corriente;
	private double saldo_cuenta_ahorro;
	
	private static int nCuentas;
	private static int cDinero;
	
	private String n_r_cuenta() {
		String n="";
		for(int i=0;i<11;i++) n+=Integer.toString((int) Math.floor(Math.random()*9));
		return n; 
	}
	
	public BankAccount() {
		this.numero_cuenta=n_r_cuenta();
		nCuentas++;
	}

	public double getSaldo_cuenta_corriente() {
		return saldo_cuenta_corriente;
	}

	public void setSaldo_cuenta_corriente(double saldo_cuenta_corriente) {
		this.saldo_cuenta_corriente = saldo_cuenta_corriente;
	}

	public double getSaldo_cuenta_ahorro() {
		return saldo_cuenta_ahorro;
	}

	public void setSaldo_cuenta_ahorro(double saldo_cuenta_ahorro) {
		this.saldo_cuenta_ahorro = saldo_cuenta_ahorro;
	}

	public void depositoCuenta(int s,String c) {
		if(c == "ahorro")this.setSaldo_cuenta_ahorro(this.getSaldo_cuenta_ahorro()+s);
		else this.setSaldo_cuenta_corriente(this.getSaldo_cuenta_corriente()+s);
		cDinero+=s;
	}
	public void giroCuenta(int s,String c) {
		if(c=="ahorro") {
			if(s>this.getSaldo_cuenta_ahorro()) System.out.println("Sin fondos...");
			else {
				this.setSaldo_cuenta_ahorro(this.getSaldo_cuenta_ahorro()-s);
				cDinero-=s;
			}
		}else if(c=="corriente"){
			if(s>this.getSaldo_cuenta_corriente()) System.out.println("Sin fondos...");
			else {
				this.setSaldo_cuenta_corriente(this.getSaldo_cuenta_corriente()-s);
				cDinero-=s;
			}
		}else System.out.println("No tiene fondos...");
			
	}
	public void estado_cuentas() {
		System.out.println("Cuenta ahorro: "+this.getSaldo_cuenta_ahorro());
		System.out.println("Cuenta corriente: "+this.getSaldo_cuenta_corriente());
		System.out.println("Dinero acumulado: "+cDinero);
	}
}






