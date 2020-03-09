package com.pets.web.models;

public class Dog extends Animal{
	public Animal createPet(String name, String breed, int weight) {
		Animal animal= new Animal(name,breed,weight);
		return animal;
	}
}
