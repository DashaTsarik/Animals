package com.itacademy.java_classes.animals;

public class Main {

	public static void main(String[] args) {
		
		Animal cat = new Cat("Meow");
		cat.makeSound();
		
		Animal dog = new Dog("Wof");
		dog.makeSound();
		
		Animal cow = new Cow ("Mu");
		cow.makeSound();

	}

}
