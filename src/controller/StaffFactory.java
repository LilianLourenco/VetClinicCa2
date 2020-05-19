package controller;

import staff.StaffNameGenerator;
import staff.Trainee;
import staff.Veterinarian;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import animal.*;
import staff.*;

public class StaffFactory {

	ArrayList<Medical> medicList = new ArrayList<Medical>();
	ArrayList<Admin> adminList = new ArrayList<Admin>();
	ArrayList<Staff> staffList = new ArrayList<Staff>();
	//ArrayList<Nurse> nurseList = new ArrayList<Nurse>();
	public int idStaff = 0;
	

	
//Here start listing all the veterinarian
	public void addVeterinarian() {
		StaffNameGenerator staffName = new StaffNameGenerator();
		for (int i = 1; i <= 6; i++) {
			String name = staffName.getRandomFirstName();
			String surname = staffName.getRandomSurname();
			double salary = 0;
			String category = "";
			Veterinarian vet = new Veterinarian(name, surname,idStaff, salary, category);
			staffList.add(vet);
			idStaff++;
		}
	}

	// Here start listing all the nurse
	public void addNurse() {
		StaffNameGenerator staffName = new StaffNameGenerator();
		
		for (int i = 1; i <= 21; i++) {
			String name = staffName.getRandomFirstName();
			String surname = staffName.getRandomSurname();
			double salary = 0;
			String category = "";
			Nurse nurse = new Nurse(name,surname, idStaff, salary, category);
			staffList.add(nurse);
			idStaff++;
		}
	}

	public void addTrainne() {
		StaffNameGenerator staffName = new StaffNameGenerator();
		for (int i = 1; i <= 8; i++) {
			String name = staffName.getRandomFirstName();
			String surname = staffName.getRandomSurname();
			double salary = 0;
			String category = "";
			Trainee trainee = new Trainee(name, surname,idStaff, salary, category);
			medicList.add(trainee);
			idStaff++;
		}
	}

	// HERE START THE ADMIM STAFFS
	// Here start listing all the veterinarian
	public void addManager() {
		StaffNameGenerator staffName = new StaffNameGenerator();
		for (int i = 0; i <= 4; i++) {
			String name = staffName.getRandomFirstName();
			String surname = staffName.getRandomSurname();
			double salary = 0;
			String category = "";
			Manager manager = new Manager(name,surname, idStaff, salary, category);
			staffList.add(manager);
			idStaff++;
		}

	}

	public void addItNerd() {
		StaffNameGenerator staffName = new StaffNameGenerator();
		for (int i = 1; i <= 3; i++) {
			String name = staffName.getRandomFirstName();
			String surname = staffName.getRandomSurname();
			double salary = 0;
			String category = "";
			ItNerd itNerd = new ItNerd(name, surname,idStaff, salary, category);
			staffList.add(itNerd);
			idStaff++;
		}

	}

	public void addReceptionist() {
		StaffNameGenerator staffName = new StaffNameGenerator();
		for (int i = 1; i <= 6; i++) {
			String name = staffName.getRandomFirstName();
			String surname = staffName.getRandomSurname();
			double salary = 0;
			String category = "";
			Receptionist receptionist = new Receptionist(name, surname, idStaff, salary, category);
			adminList.add(receptionist);
			idStaff++;
		}

	}
	
	
	public Staff getStaffByName(String name) {
		// get all the members
		ArrayList allMembers = this.staffList;
		// loop through all the members
		for (int i = 1; i < allMembers.size(); i++) {
			// get all the member
			Staff names = (Staff) allMembers.get(i);
			if (names.getName().equals(name)) {
				return (names);
			}
		}
		return null;
	}

	// This method is adding all information that I have in adminList and medicList
	// adding in Staff
//	public Collection<Staff> ListStaff() {
//		ArrayList<Staff> mystaff = new ArrayList<Staff>();
//		
//		for (int i = 0; i < this.staffList.size(); i++) {
//			mystaff.add(this.medicList.get(i));
//		}
//
//		for (int i = 0; i < this.staffList.size(); i++) {
//			mystaff.add(this.adminList.get(i));
//		}
//
//		return mystaff;
//	}


	// I am collecting all staffs and agruping them by category
	public Collection<Staff> listStaff(String className) {
		List<Staff> filterStaff = new ArrayList<Staff>();
		
		for(int i=0; i < staffList.size(); i++) {
			System.out.print(this.staffList.get(i).getClass().getName());
			if(this.staffList.get(i).getClass().getName().contains(className)) {
				filterStaff.add(this.staffList.get(i));
			}
		}
//		
////		for (int i = 0; i < staffList.size(); i++) {
//			if (this.staffList.get(i).getCategory().contains(className)) {
//				filterStaff.add(this.staffList.get(i));
//			}
//		}
		
		return filterStaff;
	}
}
