package com.rosters.models;

import java.util.ArrayList;

public class Team {
	private String name;
	ArrayList<Player> jugadores = new ArrayList<Player>();
	
	public Team() {
		
	}
	
	public Team(String nombre) {
		setName(nombre);
	}
	
	public void setName(String nombre) {
		this.name = nombre;
	}
	
	public void setPlayer(String nombre, String raza, int edad) {
		Player nuevoJugador= new Player(nombre, raza, edad);
		jugadores.add(nuevoJugador);
	}
	
	public ArrayList<Player> getPlayers() {
		return jugadores;
	}
	
	public String getName() {
		return name;
	}

}