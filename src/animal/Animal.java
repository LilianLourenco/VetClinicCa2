package animal;

public abstract class Animal {
	protected String name;
	protected int age;
	protected String medicalCondition;
	
	public Animal() {
		super();
	}

	public Animal(String name, int age, String medicalCondition) {
		super();
		this.name = name;
		this.age = age;
		this.medicalCondition = medicalCondition;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMedicalCondition() {
		return medicalCondition;
	}

	public void setMedicalCondition(String medicalCondition) {
		this.medicalCondition = medicalCondition;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}
	
	
	
}	
