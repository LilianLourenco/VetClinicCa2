package controller;

import staff.StaffNameGenerator;
import staff.Trainee;
import staff.Veterinarian;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import animal.*;
import staff.*;

public class Helper {

	ArrayList<Medical> medicList = new ArrayList<Medical>();
	ArrayList<Admin> adminList = new ArrayList<Admin>();
	ArrayList<Animal> animalList = new ArrayList<Animal>();
	ArrayList<Staff> staffList = new ArrayList<Staff>();

	public int idStaff = 0;
	public int animalId = 0;

//Here start listing all the veterinarian
	public void addVeterinarian() {
		StaffNameGenerator staffName = new StaffNameGenerator();
		for (int i = 0; i <= 5; i++) {
			String name = staffName.getRandomName();
			double salary = 0;
			String category = "";
			Veterinarian vet = new Veterinarian(name, name,salary, category);
			medicList.add(vet);
			idStaff++;
		}
	}

	// Here start listing all the nurse
	public void addNurse() {
		StaffNameGenerator staffName = new StaffNameGenerator();
		for (int i = 0; i <= 18; i++) {
			String name = staffName.getRandomName();
			double salary = 0;
			String category = "";
			Nurse nurse = new Nurse(name, name,salary, category);
			medicList.add(nurse);
			idStaff++;
		}
	}

	public void addTrainne() {
		StaffNameGenerator staffName = new StaffNameGenerator();
		for (int i = 0; i <= 7; i++) {
			String name = staffName.getRandomName();
			double salary = 0;
			String category = "";
			Trainee trainee = new Trainee(name, name,salary, category);
			medicList.add(trainee);
			idStaff++;
		}
	}

	// HERE START THE ADMIM STAFFS
	// Here start listing all the veterinarian
	public void addManager() {
		StaffNameGenerator staffName = new StaffNameGenerator();
		for (int i = 0; i <= 3; i++) {
			String name = staffName.getRandomName();
			double salary = 0;
			String category = "";
			Manager manager = new Manager(name,name, salary, category);
			adminList.add(manager);
			idStaff++;
		}

	}

	public void addItNerd() {
		StaffNameGenerator staffName = new StaffNameGenerator();
		for (int i = 0; i <= 2; i++) {
			String name = staffName.getRandomName();
			double salary = 0;
			String category = "";
			ItNerd itNerd = new ItNerd(name, name,salary, category);
			adminList.add(itNerd);
			idStaff++;
		}

	}

	public void addReceptionist() {
		StaffNameGenerator staffName = new StaffNameGenerator();
		for (int i = 0; i <= 5; i++) {
			String name = staffName.getRandomName();
			double salary = 0;
			String category = "";
			Receptionist receptionist = new Receptionist(name, salary, category);
			adminList.add(receptionist);
			idStaff++;
		}

	}

	// HERE START TO ADD THE ANIMALS
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

	// This method is adding all information that I have in adminList and medicList
	// adding in Staff
	public Collection<Staff> ListStaff() {
		ArrayList<Staff> mystaff = new ArrayList<Staff>();

		for (int i = 0; i < this.staffList.size(); i++) {
			mystaff.add(this.medicList.get(i));
		}

		for (int i = 0; i < this.staffList.size(); i++) {
			mystaff.add(this.adminList.get(i));
		}

		return mystaff;
	}

	// I am creating an array of all animals adding
	public Collection<Animal> ListAnimal() {
		ArrayList<Animal> myAnimal = new ArrayList<Animal>();
		for (int i = 0; i < this.animalList.size(); i++) {
			myAnimal.add(animalList.get(i));

		}
		return myAnimal;

	}

	// I am collecting all staffs and agruping them by category
	public Collection<Staff> listStaff(String Medic) {
		List<Staff> filterStaff = new ArrayList<Staff>();
		for (int i = 0; i < staffList.size(); i++) {
			if (this.staffList.get(i).getCategory().contains(Medic)) {
				filterStaff.add(this.staffList.get(i));
			}

		}

		return filterStaff;
	}
}
