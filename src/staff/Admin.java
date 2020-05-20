package staff;

public class Admin extends Staff implements AdminInterface{
	public Admin(String name, String surname, int idStaff, double salary, String category, String task) {
				super(name, surname, idStaff, salary, category);
				this.task = task;
		    }
	
	protected String task;

	@Override
	public String GetTask() {
		return task;
	}

	@Override
	public String CheckSystem() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String SellProduts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String bookAnimalAppointment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String OrderSupplies() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean IsAdmin() {
		return true;
	}
}
