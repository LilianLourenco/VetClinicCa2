package controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
			String animalType = "";
			Cat cat = new Cat(name, animalId, age, medicalCondition, animalType);
			animalList.add(cat);
			animalId++;
		}
	}

	public void addDog() {

		for (int i = 1; i <= 351; i++) {
			String name = ng.getRandomName();
			int age = mc.ageGenerator();
			String medicalCondition = mc.getRandomMedCondition();
			String animalType = "";
			Dog dog = new Dog(name, animalId, age, medicalCondition, animalType);
			animalList.add(dog);
			animalId++;
		}
	}

	public void addBirds() {

		for (int i = 1; i <= 150; i++) {
			String name = ng.getRandomName();
			int age = mc.ageGenerator();
			String medicCondition = mc.getRandomMedCondition();
			String animalType = "";
			Birds bird = new Birds(name, animalId, age, medicCondition, animalType);
			animalList.add(bird);
			animalId++;
		}
	}

	public void addRabbit() {

		for (int i = 1; i <= 200; i++) {
			String name = ng.getRandomName();
			int age = mc.ageGenerator();
			String medicalCondition = mc.getRandomMedCondition();
			String animalType = "";
			Rabbit rabbit = new Rabbit(name, animalId, age, medicalCondition, animalType);
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

	public Collection<Animal> listAnimal(String species) {
		List<Animal> filterAnimals = new ArrayList<Animal>();

		for (int i = 0; i < animalList.size(); i++) {
			System.out.print(this.animalList.get(i).getClass().getName());
			if (this.animalList.get(i).getClass().getName().contains("Dog")) {
				filterAnimals.add(this.animalList.get(i));
			}
		}
		return filterAnimals;
	}
}