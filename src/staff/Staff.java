package staff;

public abstract class Staff {
	protected String name;
	protected String surname;
	protected int idStaff;
	protected double salary;
	protected String category;

	public Staff() {
		super();
	}
	
	public Staff(String name, String surname, int idStaff, double salary, String category) {
		super();
		this.name = name;
		this.surname = surname;
		this.idStaff = idStaff;
		this.salary = salary;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getidStaff() {
		return idStaff;
	}

	public void setId(int idStaff) {
		this.idStaff = idStaff;
	}

	public double getSalry() {
		return salary;
	}

	public void setSalry(double salary) {
		this.salary = salary;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Staff [name=" + name + ", surname=" + surname + "]";
	}

	public boolean IsAdmin() {
		return false;
	}
}
