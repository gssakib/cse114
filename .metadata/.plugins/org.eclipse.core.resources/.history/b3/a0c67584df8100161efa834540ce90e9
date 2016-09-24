import java.util.Scanner;

public class PalindromicDate {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Enter month: ");
		String month = stdin.nextLine();
		int monthNo = 0;
		int day = 0;
		int year = 0 ;
		String reformatted = null;

		System.out.print("Enter day: ");
		day = stdin.nextInt();
		if(day <= 0 || day > 31 ){
			System.out.println("Bad Input");
			System.exit(-1);
		}
		
		
		
		System.out.print("Enter year: ");
		year = stdin.nextInt();
		if(year <= 0){
			System.out.println("Bad Input");
			System.exit(-1);
		}
		
		
		
		
		if((month.substring(0,2)).equals("ja") || (month.substring(0,2)).equals("Ja") || (month.substring(0,2)).equals("jA") || (month.substring(0,2)).equals("JA")){
			monthNo = 1;
			
		}else if((month.substring(0,1)).equals("f")|| (month.substring(0,1)).equals("F")){
			monthNo = 2;
			if(day > 29){
				System.out.println("Bad Input");
				System.exit(-1);
			}
			
			
			if((day == 28 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) || (day == 29 && !((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)))) {
				System.out.println("Bad Input");
				System.exit(-1);
			}
		}else if((month.substring(0,3)).equals("mar")|| (month.substring(0,3)).equals("Mar") || (month.substring(0,3)).equals("mAr") || (month.substring(0,3)).equals("maR") || (month.substring(0,3)).equals("MAr") || (month.substring(0,3)).equals("MaR") || (month.substring(0,3)).equals("mAR") || (month.substring(0,3)).equals("MAR")){
			monthNo = 3;
		}else if((month.substring(0,2)).equals("ap") || (month.substring(0,2)).equals("Ap") || (month.substring(0,2)).equals("aP") || (month.substring(0,2)).equals("AP")){
			monthNo = 4;
			if(day == 31){
				System.out.println("Bad Input");
				System.exit(-1);
			}
		}else if((month.substring(0,3)).equals("may") || (month.substring(0,3)).equals("May") || (month.substring(0,3)).equals("mAy") || (month.substring(0,3)).equals("maY") || (month.substring(0,3)).equals("MAy") || (month.substring(0,3)).equals("MaY") || (month.substring(0,3)).equals("mAY") || (month.substring(0,3)).equals("MAY") ){
			monthNo = 5;
		}else if((month.substring(0,3)).equals("jun") || (month.substring(0,3)).equals("Jun") || (month.substring(0,3)).equals("jUn") || (month.substring(0,3)).equals("juN") || (month.substring(0,3)).equals("JUn") || (month.substring(0,3)).equals("jUN") || (month.substring(0,3)).equals("JUN") || (month.substring(0,3)).equals("JuN")){
			monthNo = 6;
			if(day == 31){
				System.out.println("Bad Input");
				System.exit(-1);
			}
		}else if((month.substring(0,3)).equals("jul") || (month.substring(0,3)).equals("Jul") || (month.substring(0,3)).equals("jUl") || (month.substring(0,3)).equals("juL") || (month.substring(0,3)).equals("JUl") || (month.substring(0,3)).equals("jUL") || (month.substring(0,3)).equals("JUL") || (month.substring(0,3)).equals("JuL")){
			monthNo = 7;
		}else if((month.substring(0,2)).equals("au")){
			monthNo = 8;
		}else if((month.substring(0,1)).equals("s") || (month.substring(0,1)).equals("S")){
			monthNo = 9;
			if(day == 31){
				System.out.println("Bad Input");
				System.exit(-1);
			}
		}else if((month.substring(0,1)).equals("o") || (month.substring(0,1)).equals("O")){
			monthNo = 10;
		}else if((month.substring(0,1)).equals("n") || (month.substring(0,1)).equals("N")){
			monthNo = 11;
			if(day == 31){
				System.out.println("Bad Input");
				System.exit(-1);
			}
		}else if ((month.substring(0,1)).equals("d") || (month.substring(0,1)).equals("D")) {
			monthNo = 12;
		}else{
			System.out.println("Bad Input");
		}
		
		
		if(day < 10 && monthNo < 10 ){
			reformatted = "0" + Integer.toString(monthNo) + "/" + "0" + Integer.toString(day) + "/"  + (Integer.toString(year)).substring(2,4); 
		}else if (day >= 10 && monthNo < 10 ){
			reformatted = "0" + Integer.toString(monthNo) + "/"  + Integer.toString(day) + "/"   + (Integer.toString(year)).substring(2,4);
		}else if (day >= 10 && monthNo >= 10 ){
			reformatted =  Integer.toString(monthNo) + "/"  + Integer.toString(day) + "/"  + (Integer.toString(year)).substring(2,4);
		}else if (day < 10 && monthNo >=10 ){
			reformatted =  Integer.toString(monthNo) + "/" + "0" + Integer.toString(day) + "/"  + (Integer.toString(year)).substring(2,4);
		}else{
			System.out.println("Bad Input");
		}
		
		
		
		if(reformatted.substring(0,1).equals(reformatted.substring(7,8)) && reformatted.substring(1,2).equals(reformatted.substring(6,7)) && reformatted.substring(3,4).equals(reformatted.substring(4,5))){
			System.out.println("Palindrome?: yes");
		}else{
			System.out.println("Palindrome?: no");
		}
		 
		System.out.println(reformatted);
		

	}

}
