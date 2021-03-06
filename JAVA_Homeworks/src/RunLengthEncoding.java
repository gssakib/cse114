import java.util.Scanner;
import java.util.ArrayList;

public class RunLengthEncoding {
	/*
	 * Name: Gazi Sakib 
	 * SBU ID - 109849940 
	 * Course No. - CSE 114 
	 * Assignment Name- : Part III: Run-length Encoding(Problem 3)(Homework 4)
	 */

	public static void main(String[] args) {
		char symFlag = 'a';
		char initialLetter;
		char tempLetter;
		ArrayList sameLtr = new ArrayList();
		ArrayList multipleLtr = new ArrayList();
		ArrayList fStr = new ArrayList();
		int countLtr = -1;
		int count = 0;
		Scanner stdin = new Scanner(System.in);

		System.out.print("Enter input string: ");
		String mssg = stdin.nextLine();

		if (mssg.length() <= 99) {
			for (int i = 0; i < mssg.length(); i++) {
				if (mssg.charAt(i) >= 'A' && mssg.charAt(i) <= 'Z') {
					count++;
				} else {
					System.out.println("Bad Input.");
					System.exit(-1);
				}
			}

			System.out.print("Enter flag character: ");
			String flag = stdin.nextLine();
			if (count == mssg.length()) {
				if (flag.length() == 1
						&& (flag.charAt(0) == '#' || flag.charAt(0) == '$'
								|| flag.charAt(0) == '&' || flag.charAt(0) == '*')) {
					symFlag = flag.charAt(0);
				} else {
					System.out.println("Bad Input.");
					System.exit(-1);
				}

				initialLetter = mssg.charAt(0);
				tempLetter = initialLetter;
				for (int j = 0; j < mssg.length(); j++) {
					if (mssg.charAt(j) == tempLetter) {
						countLtr++;
					}
					if(mssg.charAt(j) != tempLetter || j == (mssg.length()- 1)){
						if (countLtr > 3) {
							sameLtr.add(tempLetter);
							multipleLtr.add(countLtr);
							countLtr = 0;
						
						}
					}
					if (mssg.charAt(j) != tempLetter) {
						tempLetter = mssg.charAt(j);
						countLtr = 0;
					}

				}
			} else {
				System.out.println("Bad Input.");
				System.exit(-1);
			}

		}

		 //System.out.println(sameLtr.toString());
		// System.out.println(multipleLtr.toString());

		int arraySpace = mssg.length();

		for (int k = 0; k < multipleLtr.size(); k++) {
			arraySpace = arraySpace - (int) multipleLtr.get(k);
		}
		// System.out.println(arraySpace);

		int indexSameLtr = 0;
		for (int i = 0; i < mssg.length(); i++) {
			// System.out.println(indexSameLtr);
			if (mssg.charAt(i) == (char) sameLtr.get(indexSameLtr)) {
				fStr.add(symFlag);
				fStr.add(sameLtr.get(indexSameLtr));
				fStr.add(((int) multipleLtr.get(indexSameLtr) + 1));
				i = i + 0 + (int) multipleLtr.get(indexSameLtr);
				indexSameLtr++;
				if (indexSameLtr == sameLtr.size()) {
					indexSameLtr--;
				}
			} else {
				fStr.add(mssg.charAt(i));
			}
		}

		System.out.print("Encoded: ");
		for (int i = 0; i < fStr.size(); i++) {
			System.out.print(fStr.get(i));
		}

	}

}
