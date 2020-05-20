package staff;

public class Receptionist extends Admin{

	public Receptionist(String name, String surname, int idStaff, double salary, String category, String task) {
		super(name, surname, idStaff, salary, category, task);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String SellProduts() {
		return "Can sell products";
	}

}
