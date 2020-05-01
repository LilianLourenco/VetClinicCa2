package animal;

import java.util.Random;

public class AnimalNameGenerator {

	protected String[] name = { "Kiara", "Preta", "Morango", "Bozo", "Lula", "Bob", "Bella", "Coco", "Max", "Buddy",
			"Daisy", "Lola", "Angel", "Luna", "Lucy", "Harley", "Charlie", "Pepper", "Shadow", "Gracie", "Jack", "Milo",
			"Rocky", "Sadie", "Stella", "Nala", "Oliver", "Penny", "Ruby", "Chloe", "Cleo", "Duke", "Ginger", "Molly",
			"Sophie", "Baby", "Bear", "Bailey", "Maggie", "Marley", "Peanut", "Dexter" };

	public AnimalNameGenerator() {

	}

	public String getRandomName() {
		// return a random name

		Random r = new Random();

		// pick a firstname and surname based on length of array

		String animalName = name[r.nextInt(name.length)];

		return (animalName);

	}

}
