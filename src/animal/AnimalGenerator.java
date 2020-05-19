package animal;

import java.util.Random;

public class AnimalGenerator {

	Random rd = new Random();

	protected String[] mCondition = { "Cancer", "Diabetes", "Heartworm", "Kennel Cough", "Rabies", "Parvovirus",
			"Ringworm", "Allergies", "Arthritis", "Bronchitis", "Influenza Virus", "Diarrhea", "Enteritis",
			"Depression", "Deafness", "Demodectic Mange", "Dental Disease", "Fecal impaction", "Flea Allergy",
			"Folliculitis", "Foreign Body (Intestinal)", "Glaucoma", "Incontinence (Urinary)", "Obesity",
			"Osteoarthritis", "Candida", "Polyomavirus", "Psittacosis", "Leukemia Virus", "Ringworm",
			"High-Rise Syndrome", "Upper Respiratory Infections", "Bladder Infection", "Constipation", "Ear Mites",
			"Epiphora", "Eye Infections", "Eyelid Conditions", "Eyes Retinal Diseases", "Kidney Disease",
			"Kidney Failure", "Mange", "Mast Cell Tumors", "Pancreatitis", "Pregnancy", "Worms", };

	public String getRandomMedCondition() {
		// return a random name

		// pick a firstname and surname based on length of array

		String medCondition = mCondition[rd.nextInt(mCondition.length)];
		return (medCondition);

	}

	public int ageGenerator() {
		int age = rd.nextInt(16);
		// System.out.println(age);
		return age;

	}

}
