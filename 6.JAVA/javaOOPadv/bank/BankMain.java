package bank;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b = new BankAccount();
		
		BankAccount b1 = new BankAccount();
		
		b.depositoCuenta(1000, "ahorro");
		b.depositoCuenta(1000, "corriente");
		
		b.estado_cuentas();
		b.giroCuenta(500, "ahorro");
		b.estado_cuentas();
		b.giroCuenta(1000, "ahorro");
		b.estado_cuentas();
		b1.estado_cuentas();
		
	}

}
