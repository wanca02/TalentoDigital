package guardian01Zoo;

public class BatTest {
	public static void main(String[] args) {
		Bat b = new Bat();
		b.energyInit();
		b.displayEnergy();
		for(int i=0;i<3;i++) b.attackTown();
		b.displayEnergy();
		for(int i=0;i<2;i++) b.eatHumans();
		b.displayEnergy();
		for(int i=0;i<2;i++) b.fly();
		b.displayEnergy();
	}
}
