package maestroHuman;

public class Human {
	public int strength=3; 
	public int stealth=3;
	public int intelligence=3;
	public int health=100;
	//public String clase;
	
	/*public Human(String clase) {
		this.clase=clase;
	}*/
	public void attack() {
		health-=strength;
	}
	public void displayHealth() {
		System.out.println(health);
	}
	
}
