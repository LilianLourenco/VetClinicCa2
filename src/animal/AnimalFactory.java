package animal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import staff.Staff;



public class AnimalFactory {

	public ArrayList<Animal> animalList = new ArrayList<Animal>();
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
	public Collection<Animal> ListAnimal(String className) {
		ArrayList<Animal> filterAnimal = new ArrayList<Animal>();
		for (int i = 0; i < this.animalList.size(); i++) {
			//if the 
			if (this.animalList.get(i).getClass().getName().contains(className))
				filterAnimal.add(animalList.get(i));

		}
		return filterAnimal;

	}

	public Animal getAnimalByName(String animalName) {
		// get all the animals
		ArrayList<Animal> allAnimais = this.animalList;
		// loop through all the animals
		for (int i = 1; i < allAnimais.size(); i++) {
			// get all abunals by indice
			Animal names = (Animal) allAnimais.get(i);
			//if the name is equals the typped name
			if (names.getName().equals(animalName)) {
				return (names);
			}
		}
		return null;
	}
	/** This method I will list the animal by type
	 *  I created a collection  of animal
	 * Did a For/looping for go throught my animal array
	 * and I Did a If case to check if the names match
	 * finally I add all in a filterAnimals
	 */
	public Collection<Animal> listAnimal(String className) {
		List<Animal> filterAnimals = new ArrayList<Animal>();

		for (int i = 0; i < animalList.size(); i++) {

			if (this.animalList.get(i).getClass().getName().contains(className)) {
				filterAnimals.add(this.animalList.get(i));
			}
		}
		return filterAnimals;
	}
	

}