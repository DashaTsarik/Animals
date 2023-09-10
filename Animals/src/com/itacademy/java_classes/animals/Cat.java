package com.itacademy.java_classes.animals;

public class Cat extends Animal{
	
	public Cat(String sound) {
		super(sound);
	}

	@Override
	public void makeSound() {
		System.out.println("Meooooow Meoooooow");
	}
	
	


}
