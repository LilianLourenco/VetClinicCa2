package staff;

public class Receptionist extends Admin{

	public Receptionist(String name, String surname, int idStaff, double salary, String category, String task) {
		//it is an administrate staff because this is receiving the parameter task in the constructor
		super(name, surname, idStaff, salary, category, task);// constructor
		
	}


}
