package com.itacademy.java_classes.animals;

public class Cow extends Animal{

	public Cow(String sound) {
		super(sound);
	}

	@Override
	public void makeSound() {
		System.out.println("Muuuuuuuuuu Muuuuuuu");		
	}

}
