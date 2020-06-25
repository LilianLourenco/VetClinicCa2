package staff;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import animal.*;
import staff.*;

public class StaffFactory implements AdminInterface {

//	ArrayList<Medical> medicList = new ArrayList<Medical>();
	ArrayList<Admin> adminList = new ArrayList<Admin>();
	public ArrayList<Staff> staffList = new ArrayList<Staff>();

	//creating an global id for Staff
	public int idStaff = 0; 
	
/**
 * Here is adding all the Medical staff
 */
	//creating a method for add a staff
	public void addVeterinarian() {
		//These names were generated randomicaly
		StaffNameGenerator staffName = new StaffNameGenerator();
		//goes thought my staff array and add a veterinarian
		//in my database in this case have only 6 veteeinarian
		for (int i = 1; i <= 6; i++) {
			//These names were generated randomicaly. 
			//This variables will associate with the variables of my staff class
			String name = staffName.getRandomFirstName();
			String surname = staffName.getRandomSurname();
			// adding a salary to the staff all my vets will receive the same amount
			double salary = 3000;
			String category = "";
			// intantiating Veterinarian class
			Veterinarian vet = new Veterinarian(name, surname, idStaff, salary, category);
			// addin g my vet inside staff list
			staffList.add(vet);
			//my global id staff will receive more one value for the next staff
			idStaff++;
		}
	}

	// Here start listing all the nurse
	public void addNurse() {
		StaffNameGenerator staffName = new StaffNameGenerator();
			
		for (int i = 1; i <= 15; i++) {
			String name = staffName.getRandomFirstName();
			String surname = staffName.getRandomSurname();
			double salary = 2500;
			String category = "";
			Nurse nurse = new Nurse(name, surname, idStaff, salary, category);
			staffList.add(nurse);
			idStaff++;
		}
	}

	public void addTrainne() {
		StaffNameGenerator staffName = new StaffNameGenerator();
		for (int i = 1; i <= 8; i++) {
			String name = staffName.getRandomFirstName();
			String surname = staffName.getRandomSurname();
			double salary = 1400;
			String category = "";
			Trainee trainee = new Trainee(name, surname, idStaff, salary, category);
			staffList.add(trainee);
			idStaff++;
		}
	}

	/**
	 * Here is adding all the Admin staff
	 */
	public void addManager() {
		StaffNameGenerator staffName = new StaffNameGenerator();
		for (int i = 1; i <= 4; i++) {
			String name = staffName.getRandomFirstName();
			String surname = staffName.getRandomSurname();
			double salary = 3000;
			String category = "";
			Manager manager = new Manager(name, surname, idStaff, salary, category, "Manage Employees");
			staffList.add(manager);
			idStaff++;
		}

	}

	public void addItNerd() {
		StaffNameGenerator staffName = new StaffNameGenerator();
		for (int i = 1; i <= 4; i++) {
			String name = staffName.getRandomFirstName();
			String surname = staffName.getRandomSurname();
			double salary = 2000;
			String category = "";
			ItNerd itNerd = new ItNerd(name, surname, idStaff, salary, category,"Database Management");
			staffList.add(itNerd);
			idStaff++;
		}

	}

	public void addReceptionist() {
		StaffNameGenerator staffName = new StaffNameGenerator();
		for (int i = 1; i <= 4; i++) {
			String name = staffName.getRandomFirstName();
			String surname = staffName.getRandomSurname();
			double salary = 1500;
			String category = "";
			Receptionist receptionist = new Receptionist(name, surname, idStaff, salary, category, " Making Phone Calls");
			staffList.add(receptionist);
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
			//If the name that the final user typed exist 
			//in my datase it will return the staff information
			if (names.getName().equals(name)) {
				return (names);
			}
		}
		return null;
	}
	/**
	 * THE OBJETIVE OF THIS METHOD IS LIST ALL STAFF BY CATEGORY
	 */
	
	
	// I am collecting all staffs and agruping them by category
	/**
	 * Reference Feed Factory Project
	 */
	public Collection<Staff> listStaff(String className) {
		List<Staff> filterStaff = new ArrayList<Staff>();

		for (int i = 0; i < staffList.size(); i++) {
	
			/**
			 *
			 * THE OBJETIVE OF THIS METHOD IS LIST ALL STAFF BY CATEGORY
			 */
			 
			if (this.staffList.get(i).getClass().getName().contains(className)) {
				filterStaff.add(this.staffList.get(i));
			}
		}

		return filterStaff;
	}
 /**
  * 
  * THE OBJECTIVE OF THIS METHOD IS LIST THE
  * ADMIN THAT IS PERFONMING DETERMINING TASK
  * 
  */
	public Collection<Staff> listByTask(String task) {
		//array of staff
		List<Staff> staffs = new ArrayList<Staff>();
		for (Staff staff : staffList) {
			//if the staff is admin it can perform a task
			if (staff.IsAdmin() && ((Admin) staff).GetTask() == task) {
				// adding a task inside of admin staff
				staffs.add(staff);
			}
		}
		return staffs;
	}
	//method came from AdminInterface necessary to list admin by task
	@Override
	public String GetTask() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean IsAdmin() {
		// TODO Auto-generated method stub
		return false;
	}

}
