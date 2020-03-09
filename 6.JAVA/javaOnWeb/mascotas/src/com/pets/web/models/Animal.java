package com.pets.web.models;

public class Animal {
	String name;
	String breed;
	int weight;
	public Animal() {}
	public Animal(String name, String breed, int weight){
		this.name=name;
		this.breed=breed;
		this.weight=weight;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getBreed() {
		return this.name;
	}
	public void setBreed(String breed) {
		this.breed=breed;
	}
	public int getWeight() {
		return this.weight;
	}
	public void setWeight(int weight) {
		this.weight=weight;
	}
}








