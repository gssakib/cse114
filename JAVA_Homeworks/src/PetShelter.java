import java.util.Scanner;
public class PetShelter {

	public static void main(String[] args) {

/*
		Name: Gazi Sakib
		SBU ID - 109849940
		Course No. - CSE 114
		Assignment Name - Feeding the Animals (Problem 2)(Homework 2) 

*/
		System.out.print("Enter number of cats: ");
		Scanner input = new Scanner(System.in);
		int noCats = input.nextInt();
		System.out.print("Enter number of dogs: ");
		int noDogs = input.nextInt();
		System.out.print("Enter weekly budget(in integers): ");
		int budget = input.nextInt();
		int amountDogs = 2 * (budget / ((2 * noDogs) + noCats ));
		
		System.out.println("Amount to spend per dog: $" + amountDogs);
		

	}

}
