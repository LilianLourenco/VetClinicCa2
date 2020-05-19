package controller;

import java.util.ArrayList;
import java.util.Collection;

import animal.Animal;
import animal.AnimalGenerator;
import animal.AnimalNameGenerator;
import animal.Birds;
import animal.Cat;
import animal.Dog;
import animal.Rabbit;
import staff.Staff;

public class AnimalFactory {

	ArrayList<Animal> animalList = new ArrayList<Animal>();
	AnimalGenerator mc = new AnimalGenerator();
	AnimalNameGenerator ng = new AnimalNameGenerator();
	public int animalId = 0;
	// HERE START TO ADD THE ANIMALS



	public void addCat() {

		for (int i = 1; i <= 300; i++) {
			String name = ng.getRandomName();
			int age = mc.ageGenerator();
			String medicalCondition = mc.getRandomMedCondition();
			Cat cat = new Cat(name, animalId, age, medicalCondition);
			animalList.add(cat);
			animalId++;
		}
	}
	public void addDog() {

		for (int i = 1; i <= 351; i++) {
			String name = ng.getRandomName();
			int age = mc.ageGenerator();
			String medicalCondition = mc.getRandomMedCondition();
			Dog dog = new Dog(name, animalId, age, medicalCondition);
			animalList.add(dog);
			animalId++;
		}
	}

	public void addBirds() {

		for (int i = 1; i <= 150; i++) {
			String name = ng.getRandomName();
			int age = mc.ageGenerator();
			String medicCondition = mc.getRandomMedCondition();
			Birds bird = new Birds(name, animalId, age, medicCondition);
			animalList.add(bird);
			animalId++;
		}
	}

	public void addRabbit() {

		for (int i = 1; i <= 200; i++) {
			String name = ng.getRandomName();
			int age = mc.ageGenerator();
			String medicalCondition = mc.getRandomMedCondition();
			Rabbit rabbit = new Rabbit(name, animalId, age, medicalCondition);
			animalList.add(rabbit);
			animalId++;
		}
	}

	// I am creating an array of all animals adding
	public Collection<Animal> ListAnimal() {
		ArrayList<Animal> myAnimal = new ArrayList<Animal>();
		for (int i = 0; i < this.animalList.size(); i++) {
			myAnimal.add(animalList.get(i));

		}
		return myAnimal;

	}
	

	public Animal getAnimalByName(String animalName) {
		// get all the members
		ArrayList<Animal> allAnimais = this.animalList;
		// loop through all the members
		for (int i = 1; i < allAnimais.size(); i++) {
			// get all the member
			Animal names = (Animal) allAnimais.get(i);
			if (names.getName().equals(animalName)) {
				return (names);
			}
		}
		return null;
	}


}
