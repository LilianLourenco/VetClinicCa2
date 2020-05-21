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
		/**
		 *I am taking all my methods form the StaffFactore class
		 * and AnimalFactory class  
		 */
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
		/**
		 * Here started the Main menu 
		 */
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
		do {
			option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.println(" ***List all Staff***");
				for (Staff staff : myStaff.staffList) {
					System.out.println(
							"Id" + " " + staff.getidStaff() + " " + staff.getName() + " " + staff.getSurname());

				}

				break;
			case 2:
				//Sub menu for list Staff by category
				System.out.println(" ***List Staff by Categories***");
				String category = "";
				System.out.println();
				System.out.println("Press 1: for List all Manager");
				System.out.println("Press 2: for List all Nurse");
				System.out.println("Press 3: for List all Veterinarian");
				System.out.println("Press 4: for List all Trainee");
				System.out.println("Press 5: for List all It Nerd");
				System.out.println("Press 6: for List all Receptionist");
				option = sc.nextInt();
				switch (option) {
				case 1:
					System.out.println(" ***Manager***");
					category = "Manager";
					break;
				case 2:
					System.out.println(" ***Nurse***");
					category = "Nurse";
					break;
				case 3:
					System.out.println(" ***Veterinarian***");
					category = "Veterinarian";
					break;
				case 4:
					System.out.println(" ***Trainee***");
					category = "Trainee";
					break;
				case 5:
					System.out.println(" ***It Nerd***");
					category = "ItNerd";
					break;
				case 6:
					System.out.println(" ***Receptionist***");
					category = "Receptionist";
					break;

				}

				Collection<Staff> filterStaff = myStaff.listStaff(category);
				for (Staff staff : filterStaff) {
					System.out.println(
							"Id" + " " + staff.getidStaff() + " " + staff.getName() + " " + staff.getSurname());
				}

				break;

			case 3:

				System.out.println("Type the Staff's first name: ");
				String staffName = sc.next();
				Staff nameStaff = myStaff.getStaffByName(staffName);
				if (nameStaff != null) {
					System.out.println(
							nameStaff.getName() + " " + nameStaff.getSurname() + " ID: " + nameStaff.getidStaff()+" "+ "Staff salary"+ " "+nameStaff.getSalry());
				} else {
					System.out.println("Staff not found in the Database!");
				}

				break;
			case 4:
				System.out.println(" List all animals");
				for (Animal animal : myAnimal.animalList) {
					System.out.println("Id" + " " + animal.getAnimalId() + " " + animal.getName());

				}

				break;

			case 5:
				//Sub menu for list Animal by category
				String type = "";
				System.out.println();
				System.out.println("Press 1: for List all Dogs");
				System.out.println("Press 2: for List all Cats");
				System.out.println("Press 3: for List all Birds");
				System.out.println("Press 4: for List all Rabbits");
				option = sc.nextInt();
				switch (option) {
				case 1:
					System.out.println("***Dogs***");
					type = "Dog";
				case 2:
					System.out.println("***Catss***");
					type = "Cat";
					break;
				case 3:
					System.out.println("***Birds***");
					type = "Birds";
					break;
				case 4:
					System.out.println("***Rabbits***");
					type = "Rabbit";
					break;
				}
				Collection<Animal> filterAnimal = myAnimal.listAnimal(type);
				for (Animal animal : filterAnimal) {
					System.out.println("Id" + " " + animal.getAnimalId() + " " + animal.getName());

				}
				break;

			case 6:

				System.out.println("Type the Animal name:");
				//take the user input
				String animalName = sc.next();
				//creating an object on the class Animal
				Animal name = myAnimal.getAnimalByName(animalName);
				// validating if contem the name in the database
				if (name != null) {
					//printing animal data
					System.out.println(name.getName() + " " + " ID: " + name.getAnimalId() + " " + "Animal age:" + " "
							+ name.getAge() + " " + "Medical Conditional:" + " " + name.getMedicalCondition());
				} else {
					//if there are not the name will returnig this mensage
					System.out.println("Animal not found");
				}
				break;
			case 7:

				String tasks = "";
				////Sub menu for list Staff that is performing a task
				System.out.println("Press 1: Manage Employees ");
				System.out.println("Press 2:  Making Phone Calls");
				System.out.println("Press 3:  Database Management");
				System.out.println("Press 4:  On holiday");
				option = sc.nextInt();
				switch (option) {

				case 1:
					System.out.println("***Manager Duties***");
					tasks = "Manage Employees";
					break;

				case 2:
					
					tasks = "Making Phone Calls";
					break;
				case 3:
					tasks = "Database Management";
					break;

				}
				//Filter that will take only the staff that is performing certain task
				Collection<Staff> filterStaffByTask = myStaff.listByTask("Manage Employees");
				// go thought the staff array checking  the admin staff 
				for (Staff staff : filterStaffByTask) {
					System.out.println(
							"Id" + " " + staff.getidStaff() + " " + staff.getName() + " " + staff.getSurname());

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
			default:
				System.out.println("Not a valid Option");
				break;

			}
			/**
			 *I did a Do while forafter the user see the option he will be able
			 * for continue to see the menu an search for another option 
			 */
			
		 }while(option !=0);
		
	}

}