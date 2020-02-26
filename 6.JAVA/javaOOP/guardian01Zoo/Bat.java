package guardian01Zoo;

public class Bat extends Mammal{
	public void energyInit() {
		energyLevel=300;
	}
	public void fly() {
		System.out.println("*Wooosh*");
		energyLevel-=50;
	}
	public void eatHumans() {
		System.out.println("bueno, no importa");
		energyLevel+=25;
	}
	public void attackTown() {
		System.out.println("AAAHHH!!!! *destrucción*");
		energyLevel-=100;
	}
}
