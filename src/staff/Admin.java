package staff;

public class Admin extends Staff implements AdminInterface {
	public Admin(String name, String surname, int idStaff, double salary, String category, String task) {
		super(name, surname, idStaff, salary, category);
		this.task = task;// the type of task that the Admin will
	}

	// created the variable task here because it will be used only by the admin
	// staffs
	protected String task;

	@Override // method overriding the AdminInterface
	public String GetTask() {
		return task;
	}

	@Override // method overriding the AdminInterface
	public boolean IsAdmin() {// I am using this method to test if the staff is addmin in the class
								// StaffFactory
		return true;
	}
}
