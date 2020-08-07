package com.rosters.models;

public class Player {
	private String name;
	private String race;
	private Integer age;
	
	public Player() {
		
	}
	
	public Player(String nombre, String apellido, int edad) {
		setName(nombre);
		setRace(apellido);
		setAge(edad);
	}
	
	public void setName(String nombre) {
		this.name = nombre;
	}
	
	public void setRace(String raza) {
		this.race = raza;
	}
	
	public void setAge(int edad) {
		this.age = edad;
	}
	
	public String getName() {
		return name;
	}
	
	public String getRace() {
		return race;
	}
	
	public Integer getAge() {
		return age;
	}

}