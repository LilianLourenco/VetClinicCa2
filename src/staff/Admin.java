package staff;

import java.util.Random;

public class Admin extends Staff implements AdminInterface{
	public Admin(String name, String surname, int idStaff, double salary, String category, String task) {
				super(name, surname, idStaff, salary, category);
				this.task = task;// the type of task that the Admin will 
		    }
	Random rd = new Random();
	
	protected String task;

	@Override
	public String GetTask() {
		return task;
	}

	
	@Override
	public boolean IsAdmin() {
		return true;
	}
}
