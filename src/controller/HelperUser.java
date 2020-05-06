package controller;

import java.util.Scanner;

public class HelperUser extends Helper {

	public static void main(String[] args) {

		new Helper();
	}

	public HelperUser() {
		MenuOption();
	}

	Helper helper = new Helper();

	public void MenuOption() {
		Scanner sc = new Scanner(System.in);

		int option;
		int input;
		System.out.println("*****************************************");
		System.out.println("********WELCOME TO THE VETCLINIC*********");
		System.out.println("*****************************************");
		System.out.println("Type your option");
		
		input = sc.nextInt();
		System.out.println("Press 1: for List all staffs");
		System.out.println("Press 2: for List Staffs by category");
		System.out.println("Press 3: for search the staff by name");
		System.out.println("Press 4: for List all animals");
		System.out.println("Press 5: for List animals by species");
		System.out.println("Press 6: for Search for a specific animal by name ");
		System.out.println("Press 7: List all the animals assigned to a member of medical staff ");
		System.out.println(
				"Press 8:  List the order in which pets will be looked after by a particular member of the medical\r\n"
						+ "staff");
		System.out.println("Press 9: For a given member of the medical staff, pass to the next pet. \r\n" + "");
		System.out.println("Press 0 to leave the menu");
		
	}

}