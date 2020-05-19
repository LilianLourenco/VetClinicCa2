package controller;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;

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
		System.out.println("Press 7: List all the animals assigned to a member of medical staff ");
		System.out.println(
				"Press 8: List the order in which pets will be looked after by a particular member of the medical");
		System.out.println("Press 9: For a given member of the medical staff, pass to the next pet ");
		System.out.println("Press 0 to leave the menu");
		option = sc.nextInt();

		switch (option) {
		case 1:
			for (Staff staff : myStaff.staffList) {
				System.out.println("Id"+ " "+staff.getidStaff()+" " +staff.getName());

			}

			break;
		case 2:
			System.out.println("  IN CONSTRUCTION  List Staff by Categories");
			Collection<Staff> filterStaff = myStaff.listStaff("Manager");
			for(int i = 0; i< filterStaff.size(); i++) {
				 System.out.println(this.staffList.getClass().getName().contains("manager"));
				filterStaff.getClass().getName();
			}


	case 3:
			//System.out.println("  IN CONSTRUCTION  search the staff by name: IN CONSTRUCTION");
			
			String staffName = sc.next();
			Staff names = myStaff.getStaffByName(staffName);
			if (names != null) {
				System.out.println(names.getName() + " " +  " ID: " + names.getidStaff()
						+ " Salary: " + names.getSalry());
			} else {
				System.out.println("Staff not found");
			}
			
			
			
			break;
		case 4:
			System.out.println(" IN CONSTRUCTION  for List all animals IN CONSTRUCTION");
			break;

		case 5:
			System.out.println(" IN CONSTRUCTION List animals by species");
			break;

		case 6:
			System.out.println(" IN CONSTRUCTION  Search for a specific animal by name");
			break;

		case 7:
			System.out.println("IN CONSTRUCTION   List all the animals assigned to a member of medical staff");
			break;

		case 8:
			System.out.println(
					" IN CONSTRUCTION  List the order in which pets will be looked after by a particular member of the medical");
			break;

		case 9:
			System.out.println(" IN CONSTRUCTION  For a given member of the medical staff, pass to the next pet.");
			break;
		}

	}

}