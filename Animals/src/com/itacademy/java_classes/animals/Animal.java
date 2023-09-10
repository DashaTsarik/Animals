package com.itacademy.java_classes.animals;

import java.util.Objects;

public abstract class Animal {
	
	private String sound;
	
	public Animal(String sound) {
		this.sound = sound;
	}
	
	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public abstract void makeSound();

	@Override
	public int hashCode() {
		return Objects.hash(sound);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(sound, other.sound);
	}

	@Override
	public String toString() {
		return "Animal [sound=" + sound + "]";
	}
	
	
}
