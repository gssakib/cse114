import java.util.Scanner;
public class GreekMoney {

	public static void main(String[] args) {
		System.out.print("Enter number of oboloi: ");
		Scanner in = new Scanner(System.in);
		
		double oboloi = in.nextDouble();
		
		double talent = oboloi / (60 * 70 * 6.0);
		double rem = oboloi % (60 * 70 * 6);
		
		double minae = rem / (70 * 6.0);
		rem = rem % (70 * 6.0);
		
		double drachmae = rem / 6.0;
		rem = rem % 6.0;
		oboloi = rem;
		
		System.out.println("That number of oboloi is equal to:");
		System.out.println((int)talent + " talents");
		if ((int)minae == 1){
			System.out.println((int)minae + " mina");
		}else{
			System.out.println((int)minae + " minae");
		}
		if((int)drachmae == 1){
			System.out.println((int)drachmae + " drachma");
		}else{
			System.out.println((int)drachmae + " drachmae");
		}
		if((int)oboloi == 1){
			System.out.println((int)oboloi + " obolus");
		}else{
			System.out.println((int)oboloi + " oboloi");
		}
		
		
		
	}

}
