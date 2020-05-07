package controller;

import java.util.Scanner;

import staff.Staff;

public class HelperUser extends Helper {

	public static void main(String[] args) {
		new HelperUser();
	}
	
	public HelperUser() {
		Menu();
	}
		
		Helper myHelper = new Helper();

		public void Menu() {
			
		Scanner sc = new Scanner(System.in);

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
		System.out.println("Press 8: List the order in which pets will be looked after by a particular member of the medical");
		System.out.println("Press 9: For a given member of the medical staff, pass to the next pet ");
		System.out.println("Press 0 to leave the menu");
		option = sc.nextInt();
		
		switch (option) {
		case 1:
			for(Staff staff : myHelper.staffList) {
				System.out.println(staff.getName());
				
				//System.out.println(" This is the List of all staff: "+staff.getName()+staff.getSurname());	
			}
			
			break;
		case 2: 
			System.out.println("  IN CONSTRUCTION  List Staff by Categories");
			break;
		case 3:
			System.out.println("  IN CONSTRUCTION  search the staff by name: IN CONSTRUCTION");
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
			System.out.println(" IN CONSTRUCTION  List the order in which pets will be looked after by a particular member of the medical");
			break;
			
		case 9:
			System.out.println(" IN CONSTRUCTION  For a given member of the medical staff, pass to the next pet.");
			break;
		}

			
		
	}

}