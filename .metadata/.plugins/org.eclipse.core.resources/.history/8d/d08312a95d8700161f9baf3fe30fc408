import java.util.Scanner;

public class RunLengthEncoding {

	public static void main(String[] args) {
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
					//magic happens
				}else{
					System.out.println("Bad Input.");
					System.exit(-1);
				}
				
			}
			
		}else{
			System.out.println("Bad Input.");
			System.exit(-1);
		}
		
		

	}

}
