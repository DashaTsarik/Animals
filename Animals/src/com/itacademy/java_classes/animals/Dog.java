package com.itacademy.java_classes.animals;

public class Dog extends Animal {

	public Dog(String sound) {
		super(sound);
	}

	@Override
	public void makeSound() {
		System.out.println("Wof Wof");
		
	}

}
