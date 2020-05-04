package controller;

import staff.StaffNameGenerator;
import staff.Trainee;
import staff.Veterinarian;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import animal.Animal;
import animal.AnimalNameGenerator;
import animal.Birds;
import animal.Cat;
import animal.Dog;
import animal.MedicalConditionGenerator;
import animal.Rabbit;
import staff.Admin;
import staff.ItNerd;
import staff.Manager;
import staff.Medical;
import staff.Nurse;
import staff.Receptionist;
import staff.Staff;

public class Helper {

	ArrayList<Medical> medicalList = new ArrayList<Medical>();
	ArrayList<Admin> adminList = new ArrayList<Admin>();
	ArrayList<Animal> animalList = new ArrayList<Animal>();
	ArrayList<Staff> staffList = new ArrayList<Staff>();

	public int idStaff = 0;

//Here start listing all the veterinarian
	public void addVeterinarian() {
		StaffNameGenerator staffName = new StaffNameGenerator();
		for (int i = 0; i <= 5; i++) {
			String name = staffName.getRandomName();
			double salary = 0;
			String category = "";
			Veterinarian vet = new Veterinarian(name, salary, category);
			medicalList.add(vet);
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
			Nurse nurse = new Nurse(name, salary, category);
			medicalList.add(nurse);
			idStaff++;
		}
	}

	public void addTrainne() {
		StaffNameGenerator staffName = new StaffNameGenerator();
		for (int i = 0; i <= 7; i++) {
			String name = staffName.getRandomName();
			double salary = 0;
			String category = "";
			Trainee trainee = new Trainee(name, salary, category);
			medicalList.add(trainee);
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
			Manager manager = new Manager(name, salary, category);
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
			ItNerd itNerd = new ItNerd(name, salary, category);
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
		MedicalConditionGenerator mc = new MedicalConditionGenerator();
		for (int i = 0; i <= 350; i++) {
			String name = ng.getRandomName();
			int age = 0;
			String medicalCondition = mc.getRandomMedCondition();
			Dog dog = new Dog(name, age, medicalCondition);
			animalList.add(dog);
		}
	}

	public void addCat() {
		AnimalNameGenerator ng = new AnimalNameGenerator();
		MedicalConditionGenerator mc = new MedicalConditionGenerator();
		for (int i = 0; i <= 300; i++) {
			String name = ng.getRandomName();
			int age = 0;
			String medicalCondition = mc.getRandomMedCondition();
			Cat cat = new Cat(name, age, medicalCondition);
			animalList.add(cat);
		}
	}

	public void addBirds() {
		AnimalNameGenerator ng = new AnimalNameGenerator();
		MedicalConditionGenerator mc = new MedicalConditionGenerator();
		for (int i = 0; i <= 150; i++) {
			String name = ng.getRandomName();
			int age = 0;
			String medicalCondition = mc.getRandomMedCondition();
			Birds bird = new Birds(name, age, medicalCondition);
			animalList.add(bird);
		}
	}

	public void addRabbit() {
		AnimalNameGenerator ng = new AnimalNameGenerator();
		MedicalConditionGenerator mc = new MedicalConditionGenerator();
		for (int i = 0; i <= 200; i++) {
			String name = ng.getRandomName();
			int age = 0;
			String medicalCondition = mc.getRandomMedCondition();
			Rabbit rabbit = new Rabbit(name, age, medicalCondition);
			animalList.add(rabbit);
		}
	}

	public Collection<Staff> ListStaff() {
		ArrayList<Staff> mystaff = new ArrayList<Staff>();

		for (int i = 0; i < this.staffList.size(); i++) {
			mystaff.add(this.medicalList.get(i));
		}

		for (int i = 0; i < this.staffList.size(); i++) {
			mystaff.add(this.adminList.get(i));
		}

		return mystaff;
	}

	public Collection<Animal> ListAnimal() {
		ArrayList<Animal> myAnimal = new ArrayList<Animal>();
		for (int i = 0; i < this.animalList.size(); i++) {
			myAnimal.add(animalList.get(i));

		}
		return myAnimal;

	}
	public Collection<Staff> listStaff(String category) {
		List<Staff> filterStaff = new ArrayList<Staff>();
		for(int i=0; i< staffList.size(); i++) {
			
		}
			
		return filterStaff;
	}
}
