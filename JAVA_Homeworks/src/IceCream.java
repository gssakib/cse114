import java.util.Scanner;


public class IceCream {

	public static void main(String[] args) {
		
/*
		Name: Gazi Sakib
		SBU ID - 109849940
		Course No. - CSE 114
		Assignment Name - Brain Freeze (Problem 1)(Homework 2) 

*/
		System.out.print("Enter radius of ice cream and cone (in inches): ");
		Scanner input = new Scanner(System.in);
		double radius = input.nextDouble();
		
		System.out.print("Enter height of cone (in inches): ");
		double height = input.nextDouble();
		
		final double PI = 3.14;
		double coneVolume =  (PI * Math.pow(radius, 2) * height ) / 3;
		double hemisphereVolume = (2 * PI * Math.pow(radius,3)) / 3;
		
		System.out.println("Volume of ice cream (in cubic inches): " + (coneVolume + hemisphereVolume));

	}

}
