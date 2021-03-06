/*
		Name: Gazi Sakib
		SBU ID - 109849940
		Course No. - CSE 114
		Assignment Name - : Java Source-Code Reformatter (Problem 3)(Homework 7) 

 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReformatCode {

	public static void main(String[] args) throws FileNotFoundException {
		if (args.length != 2) {
			System.out
					.println("Invalid number of arguments. Please enter 2 arguments");
			System.exit(-1);
		}

		File in = new File(args[0]);
		File out = new File(args[1]);

		String result = "";

		Scanner infile = new Scanner(in);
		PrintWriter outfile = new PrintWriter(out);

		while (infile.hasNext()) {
			result += (infile.nextLine() + "\n");

		}
		result = result.replaceAll("\\s*\\{", "\\{");
		System.out.println(result);
		outfile.println(result);

		infile.close();
		outfile.close();

	}
}