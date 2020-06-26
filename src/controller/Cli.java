package controller;

/**
 * 
 * @author: Lilian Lourenco 2019323

	Github: https://github.com/LilianLourenco/VetClinicCa2
 */

/*
 * Command Line Interface here I am calling the helper class and 
 * exibing all information about the program
 * 
 */
public class Cli {
//command line interface
	// this class will receive the method to execute the program
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Cli();
	}

	public Cli() {
		Print();
	}

	public void Print() {
		Helper helper = new Helper();
		helper.Menu();// calling the Menu method
	}
}
/*

References:
College.java from Software Development Fundamentals
 Random Name Generator from Software Development Fundamentals
Office from Software Development Fundamentals
Feed Factory Project Algorithms & Constructs
Restaurant Project Algorithms & Constructs
Get the current class https://stackoverflow.com/questions/6271417/java-get-the-current-class-name



*/