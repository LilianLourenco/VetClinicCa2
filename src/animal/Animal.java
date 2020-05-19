package animal;

public abstract class Animal {
	protected String name;
	protected  int animalId;
	protected int age;
	protected String medicalCondition;
	protected String animalType;
	
	
	
	public Animal(String name, int animalId, int age, String medicalCondition, String animalType) {
		super();
		this.name = name;
		this.animalId = animalId;
		this.age = age;
		this.medicalCondition = medicalCondition;
		this.animalType = animalType;
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getAnimalId() {
		return animalId;
	}

	public void setAnimalId(int animalId) {
		this.animalId = animalId;
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
	


	public String getAnimalType() {
		return animalType;
	}

	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}

	
	
	 
	
	
	
}	
