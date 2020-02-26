package guardian01Zoo;

public class Gorila extends Mammal {
	public void throwSomething() {
		System.out.println("He lanzado algo...");
		energyLevel-=5;
	}
	
	public void eatBananas() {
		System.out.println("mmmm banaaanna.....");
		energyLevel+=10;
	}
	
	public void climb() {
		System.out.println("Llegué arriba....");
		energyLevel-=10;
	}
}
