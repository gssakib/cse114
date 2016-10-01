import java.util.Scanner;
import java.util.ArrayList;

public class RunLengthEncoding {

	public static void main(String[] args) {
		char initialLetter;
		char tempLetter;
		ArrayList sameLtr = new ArrayList();
		ArrayList multipleLtr = new ArrayList();
		ArrayList fStr = new ArrayList(); 
		int countLtr = -1;
		int count = 0;
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Enter input string: ");
		String mssg  = stdin.nextLine();
		
		System.out.print("Enter flag character: ");
		String flag  = stdin.nextLine();
		if(flag.length() == 1 && (flag.charAt(0)== '#' ||  flag.charAt(0)== '$' || flag.charAt(0)== '&' || flag.charAt(0)== '*')){
			if (mssg.length() <= 99){
				for (int i = 0; i < mssg.length(); i++){
					if(mssg.charAt(i) >= 'A' && mssg.charAt(i) <= 'Z'){
						count++;
					}
				}
				
				if(count == mssg.length()){
					initialLetter = mssg.charAt(0);
					tempLetter = initialLetter;
					for(int j =0; j < mssg.length(); j++){
						if(mssg.charAt(j) == tempLetter){
							countLtr++;
						}
						if(countLtr > 3 && mssg.charAt(j) != tempLetter){
							sameLtr.add(tempLetter);
							multipleLtr.add(countLtr);
							countLtr = 0;
						}
						if(mssg.charAt(j) != tempLetter){
							tempLetter = mssg.charAt(j);
							countLtr = 0;
						}
						
					}
				}else{
					System.out.println("Bad Input.");
					System.exit(-1);
				}
				
			}
			
		}else{
			System.out.println("Bad Input.");
			System.exit(-1);
		}
		
		
		
		//System.out.println(sameLtr.toString());
		//System.out.println(multipleLtr.toString());
		
		int arraySpace = mssg.length();
		
		for (int k =0; k < multipleLtr.size(); k++){
			arraySpace =   arraySpace -(int) multipleLtr.get(k);
		}
		//System.out.println(arraySpace);
		
		int indexSameLtr = 0;
		for (int i = 0; i < mssg.length(); i++){
			System.out.println(indexSameLtr);
			if (mssg.charAt(i) == (char)sameLtr.get(indexSameLtr)){
				fStr.add('*');
				fStr.add(sameLtr.get(indexSameLtr));
				fStr.add(((int)multipleLtr.get(indexSameLtr)+1));
				i = i + 0 + (int) multipleLtr.get(indexSameLtr); 
				indexSameLtr++;
				if(indexSameLtr == sameLtr.size()){
					indexSameLtr --;
				}
			}else{
				fStr.add(mssg.charAt(i));
			}
		}
		
		for(int i = 0; i< fStr.size(); i++){
			System.out.print(fStr.get(i));
		}

	}

}
