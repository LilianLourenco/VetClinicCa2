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

public class AnimalFactory {

	ArrayList<Animal> animalList = new ArrayList<Animal>();
	// HERE START TO ADD THE ANIMALS
	public int animalId = 0;
	public void addDog() {
		AnimalNameGenerator ng = new AnimalNameGenerator();
		AnimalGenerator mc = new AnimalGenerator();
		for (int i = 0; i <= 350; i++) {
			String name = ng.getRandomName();
			int age = mc.ageGenerator();
			String medicalCondition = mc.getRandomMedCondition();
			Dog dog = new Dog(name, age, medicalCondition);
			animalList.add(dog);
			animalId++;
		}
	}

	public void addCat() {
		AnimalNameGenerator ng = new AnimalNameGenerator();
		AnimalGenerator mc = new AnimalGenerator();
		for (int i = 0; i <= 300; i++) {
			String name = ng.getRandomName();
			int age = mc.ageGenerator();
			String medicalCondition = mc.getRandomMedCondition();
			Cat cat = new Cat(name, age, medicalCondition);
			animalList.add(cat);
			animalId++;
		}
	}

	public void addBirds() {
		AnimalNameGenerator ng = new AnimalNameGenerator();
		AnimalGenerator mc = new AnimalGenerator();
		for (int i = 0; i <= 150; i++) {
			String name = ng.getRandomName();
			int age = mc.ageGenerator();
			String medicCondition = mc.getRandomMedCondition();
			Birds bird = new Birds(name, age, medicCondition);
			animalList.add(bird);
			animalId++;
		}
	}

	public void addRabbit() {
		AnimalNameGenerator ng = new AnimalNameGenerator();
		AnimalGenerator mc = new AnimalGenerator();
		for (int i = 0; i <= 200; i++) {
			String name = ng.getRandomName();
			int age = mc.ageGenerator();
			String medicalCondition = mc.getRandomMedCondition();
			Rabbit rabbit = new Rabbit(name, age, medicalCondition);
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

}
