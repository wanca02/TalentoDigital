package bank;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b = new BankAccount();
		
		b.depositoCuenta(1000, "ahorro");
		b.depositoCuenta(1000, "corriente");
		
		b.giroCuenta(500, "ahorro");
		
		b.giroCuenta(1000, "ahorro");
		b.estado_cuentas();
	}

}
