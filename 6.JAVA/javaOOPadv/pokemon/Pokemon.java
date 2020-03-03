package pokemon;

import java.util.ArrayList;

public class Pokemon {
	private String name;
	private int health;
	private String type;
	private static int count=0;
	private static ArrayList<Pokemon> n = new ArrayList<Pokemon>();
	
	public Pokemon() {}
	public Pokemon(String name, int health, String type) {
		this.setName(name);
		this.setHealth(health);
		this.setType(type);
		setCount(getCount() + 1);
	}
	public void attackPokemon(Pokemon pokemon) {
		pokemon.setHealth(pokemon.getHealth() - 10);
		System.out.println(this.name+" atacó a "+pokemon.name);
	}
	
	public void addPokeList() {
		n.add(this);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Pokemon.count = count;
	}
	public static ArrayList<Pokemon> getListPoke() {
		return n;
	}

}
