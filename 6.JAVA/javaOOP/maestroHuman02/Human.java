package maestroHuman;

public class Human {
	private int strength; 
	private int stealth;
	private int intelligence;
	private int health;
	private String rol;
	private int cc;
	
	
	public Human(){}
	public Human(int strength,int stealth, int intelligence, int health, String rol) {
		this.strength=strength;
		this.stealth=stealth;
		this.intelligence=intelligence;
		this.health=health;
		this.setRol(rol);
	}
	
	
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	
	public int getStealth() {
		return stealth;
	}
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	
	
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	
	
	public Human attack(Human h) {
		h.health-=this.strength;
		System.out.println(this.rol+" atacó a "+h.rol+"......");
		this.displayHealth(); h.displayHealth();
		return this;
	}
	public void displayHealth() {
		
		if(this.getHealth()<=0) {
			this.health=0;
			System.out.println(this.rol+" se murió.....");
		}else System.out.println(this.rol+" Vida: "+health);
	}
	
	public void heal(Human h) {
		h.setHealth(h.getHealth()+this.getIntelligence());
		System.out.println(this.rol+" sanó a "+h.rol+"....");
		this.displayHealth(); h.displayHealth();
	}
	public void fireBall(Human h) {
		// TODO Auto-generated method stub
		h.setHealth(h.getHealth()-this.getIntelligence()*3);
		System.out.println(this.rol+" usó FireBall en "+h.rol+"....");
		this.displayHealth(); h.displayHealth();
	}
	public void steal(Human h) {
		// TODO Auto-generated method stub
		h.setHealth(h.getHealth()-this.getStealth());
		this.setHealth(this.getHealth()+this.getStealth());
		System.out.println(this.rol+" robó vida a "+h.rol+"....");
		this.displayHealth(); h.displayHealth();
	}
	public void runAway() {
		// TODO Auto-generated method stub
		this.setHealth(this.getHealth()-10);
		System.out.println(this.rol+" Huyó.....");
		this.displayHealth();
	}
	public void deathBlow(Human h) {
		// TODO Auto-generated method stub
		h.setHealth(h.getHealth()*0);
		this.setHealth(this.getHealth()/2);
		System.out.println(this.rol+" usó DeathBlow en "+h.rol+".....");
		this.displayHealth(); h.displayHealth();
	}
	public void meditate() {
		// TODO Auto-generated method stub
		this.setHealth(this.getHealth()+this.getHealth()/2);
		System.out.println(this.rol+" medita...... ");
		this.displayHealth();
	}
	public void howMany() {
		// TODO Auto-generated method stub
		System.out.println("Hay "+ this.getCc() + " samurai");
	}
	
	
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public void usedSkill(String string, Human s) {
		// TODO Auto-generated method stub
		
	}
	

	


	
	
}










