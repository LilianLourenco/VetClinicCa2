package controller;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import animal.Animal;
import staff.Staff;

public class Helper extends StaffFactory {

	public static void main(String[] args) {
		new Helper();
	}

	public Helper() {
		Menu();
	}

	public void Menu() {
		StaffFactory myStaff = new StaffFactory();
		AnimalFactory myAnimal = new AnimalFactory();

		Scanner sc = new Scanner(System.in);
		myStaff.addManager();
		myStaff.addNurse();
		myStaff.addReceptionist();
		myStaff.addItNerd();
		myStaff.addVeterinarian();
		myStaff.addTrainne();
		myAnimal.addDog();
		myAnimal.addCat();
		myAnimal.addRabbit();
		myAnimal.addBirds();

		int option;
		System.out.println("*****************************************");
		System.out.println("*                                       *");
		System.out.println("*       WELCOME TO THE VET CLINIC       *");
		System.out.println("*                                       *");
		System.out.println("*****************************************");
		System.out.println("Type your option");

		System.out.println();
		System.out.println("Press 1: for List all staffs");
		System.out.println("Press 2: for List Staffs by category");
		System.out.println("Press 3: for search the staff by name");
		System.out.println("Press 4: for List all animals");
		System.out.println("Press 5: for List animals by species");
		System.out.println("Press 6: for Search for a specific animal by name ");
		System.out.println("Press 7: List all Admin staff performing a certain task");
		System.out.println("Press 8: List all the animals assigned to a member of medical staff ");
		System.out.println(
				"Press 9: List the order in which pets will be looked after by a particular member of the medical");
		System.out.println("Press 10: For a given member of the medical staff, pass to the next pet ");
		System.out.println("Press 0 to leave the menu");
		option = sc.nextInt();

		switch (option) {
		case 1:
			for (Staff staff : myStaff.staffList) {
				System.out.println("Id" + " " + staff.getidStaff() + " " + staff.getName() +" " +staff.getSurname());

			}

			break;
		case 2:
			System.out.println("  IN CONSTRUCTION  List Staff by Categories");
			String category = "";
			System.out.println();
			System.out.println("Press 1: for List all Manager");
			option = sc.nextInt();
			switch(option) {
			case 1:
				category = "Manager";
				break;
			}
			Collection<Staff> filterStaff = myStaff.listStaff(category);
			for (Staff staff : filterStaff) {
				System.out.println("Id" + " " + staff.getidStaff() + " " + staff.getName() +" " +staff.getSurname());
			}
//			for (int i = 0; i < filterStaff.size(); i++) {
//				System.out.println(this.staffList.getClass().getName().contains("manager"));
////				System.out.println(myStaff.idStaff +""+ myStaff.getClass().getName());
//				filterStaff.getClass().getName();
//				System.out.println();
//			}
			break;

		case 3:
			
			System.out.println("Type the Staff's first name: ");
			String staffName = sc.next();
			Staff nameStaff = myStaff.getStaffByName(staffName);
			if (nameStaff != null) {
				System.out.println(nameStaff.getName() + " "+nameStaff.getSurname() + " ID: " + nameStaff.getidStaff() );
			} else {
				System.out.println("Staff not found in the Database!");
			}

			break;
		case 4:
			for (Animal animal : myAnimal.animalList) {
				System.out.println("Id" + " " + animal.getAnimalId() + " " + animal.getName());

			}

			break;

		case 5:
			//System.out.println(" IN CONSTRUCTION  Search for a specific animal by species");
			Collection<Animal> filterAnimal = myAnimal.ListAnimal();
			for (int i = 0; i < filterAnimal.size(); i++) {
				//System.out.println(this.animalList.getClass().getName().contains("Dog"));
				filterAnimal.getClass().getName();
				System.out.println();
			}
			break;

		case 6:
			
			System.out.println("Type the Animal name:");
			String animalName = sc.next();			
			Animal name = myAnimal.getAnimalByName(animalName);
			if (name != null) {
				System.out.println(name.getName() + " " + " ID: " + name.getAnimalId()+" "+"Animal age:"+" "+name.getAge()+" "+"Medical Conditional:"+" "+ name.getMedicalCondition());
			} else {
				System.out.println("Animal not found");
			}
			break;
		case 7:
			System.out.println("List all Admin staff performing a certain task");
			Collection<Staff> filterStaffByTask = myStaff.listByTask("Test");
			for (Staff staff : filterStaffByTask) {
				System.out.println("Id" + " " + staff.getidStaff() + " " + staff.getName() +" " +staff.getSurname());
			}
			
			break;
		case 8:
			System.out.println("IN CONSTRUCTION   List all the animals assigned to a member of medical staff");
			break;

		case 9:
			System.out.println(
					" IN CONSTRUCTION  List the order in which pets will be looked after by a particular member of the medical");
			break;

		case 10:
			System.out.println(" IN CONSTRUCTION  For a given member of the medical staff, pass to the next pet.");
			break;
		}

	}

}