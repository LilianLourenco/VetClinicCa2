package staff;

import java.util.Random;

public class StaffNameGenerator {

	Random r = new Random();
	protected String[] firstNames = { "Adao", "Draco", "Harry", "Hermione", "Jack", "Emily", "James", "Ava", "Daniel",
			"Emma", "Conor", "Sophie", "Seán", "Amelia", "Adam", "Ella", "Noah", "Michael", "Grace", "Charlie", "Mia",
			"Luke", "Jack", "Emily", "James", "Grace", "Daniel", "Hannah", "Brian", "Alberto", "Manuela", "Eduarda",
			"Nisleine", "Maria", "Guardalupe","Suely", "Eva", "Eliane", "Elizangela", "Leilla", "Walquiria", "Waldirene",
			"Wagner", "Terezinha", "Raoni", "Liana", "Guilherme", "Erick", "Willian", "Lanara", "Amilcar", "Edna",
			"Ilda", "Debora", "Lily", "Lilian", "Bruna", "Alysson", "Roberta", "Leticia", };

	protected String[] surnames = { "Lourenco", "Carvalho", "Peres", "Silva", "Santos", "Almeida", "Murphy", "O'Kelly",
			"O'Sullivan", "Walsh", "Smith", "O'Brien", "O'Byrne", "O'Ryan", "O'Connor", "O'Neill", "O'Reilly", "Doyle",
			"McCarthy", "O'Gallagher", "O'Doherty", "Kennedy", "Lynch", "Murray", "O'Quinn", "O'Moore", "Leite",
			"Camilo", "Pinto", "Potter", "Granger", "Carvalho", "Gonzalves", "Viera", "Marinha", "Fontes", "White",
			"Malfoy" };

	public StaffNameGenerator() {

	}

	public String getRandomFirstName() {
		// return a random name


		// pick a firstname and surname based on length of array
		String fname = firstNames[r.nextInt(firstNames.length)];
		

		return (fname ) ;

	}
	
	public String getRandomSurname() {
		String sname = surnames[r.nextInt(surnames.length)];
		return (sname);
	}

}
