import java.util.ArrayList;
import java.util.Scanner;

public class Scrimish {

	public static void main(String[] args) {
		//Cards[][] computer = setUpAI();
		Cards[][] person = setUp();
		/*
		for(int i = 0; i< computer.length; i++){
				System.out.println("");
			for(int j =0; j< computer[i].length;j++){
				System.out.print(computer[i][j].getName() + " ");
			}
		}
		*/
		for(int i = 0; i< person.length; i++){
			System.out.println("");
		for(int j =0; j< person[i].length;j++){
			System.out.print(person[i][j].getName() + " ");
		}
	}
		
		
		
		//System.out.println(c1.getVal());

	}

	
	public static Cards[][] setUp(){
		
		Cards[][] player = new Cards[5][5];
		int[] count = new int[9];
		Scanner stdin = new Scanner(System.in);
		
		
		for(int i = 0; i < player.length; i++){
			System.out.println((i+1)+" " + "pile");
			for(int j = 0; j< player[i].length; j++){
				System.out.print("Select Card: ");
				String choice = stdin.nextLine();
				
				
				if(choice.equals("1")&& count[1] < 5){
					player[i][j] = new Dagger();
					count[1]++;
				}else if(choice.equals("2")&& count[2] < 5){
					player[i][j] = new Sword();
					count[2]++;
				}else if(choice.equals("3") && count[3] < 3){
					player[i][j] = new MorningStar();
					count[3]++;
				}else if(choice.equals("4")&& count[4] < 3){
					player[i][j] = new WarAxe();
					count[4]++;
				}else if(choice.equals("5")&& count[5] < 2){
					player[i][j] = new Halberd();
					count[5]++;
				}else if(choice.equals("6")&& count[6] < 2){
					player[i][j] = new LongSword();
					count[6]++;
				}else if(choice.equals("7")&& count[7] < 2){
					player[i][j] = new Archer();
					count[7]++;
				}else if(choice.equals("-1")&& count[8] < 2){
					player[i][j] = new Sheild();
					count[8]++;
				}else if(choice.equals("-2") && count[0] < 1 && j == 4){
					player[i][j] = new Crown();
					count[0]++;
				}else{
					System.out.println("Enter Valid Card on Next Choice");
					j--;
					continue;
				}
			}	
		}
		
		for(int i =0; i < count.length;i++){
			System.out.println(count[i]);
		}
		
		
		
		return player;
	}
	
	
	public static Cards[][] setUpAI(){
		Cards[][] AI = new Cards[5][5];
		int[] count = new int[9];
		for(int i = 0; i < AI.length; i++){
			for(int j = 0; j< AI[i].length; j++){
				String choice = Integer.toString((-2 + (int)(Math.random() * 10))); 
				
				
				
				if(choice.equals("1") && count[1] < 5){
					AI[i][j] = new Dagger();
					count[1]++;
				}else if(choice.equals("2") && count[2] < 5){
					AI[i][j] = new Sword();
					count[2]++;
				}else if(choice.equals("3") && count[3] < 3){
					AI[i][j] = new MorningStar();
					count[3]++;
				}else if(choice.equals("4")&& count[4] < 3){
					AI[i][j] = new WarAxe();
					count[4]++;
				}else if(choice.equals("5") && count[5] < 2){
					AI[i][j] = new Halberd();
					count[5]++;
				}else if(choice.equals("6") && count[6] < 2){
					AI[i][j] = new LongSword();
					count[6]++;
				}else if(choice.equals("7")&& count[7] < 2){
					AI[i][j] = new Archer();
					count[7]++;
				}else if(choice.equals("-1") && count[8] < 2){
					AI[i][j] = new Sheild();
					count[8]++;
				}else if(choice.equals("-2") && count[0] < 1 && j == 4 ){
					AI[i][j] = new Crown();
					count[0]++;
				}else{
					j--;
				}
			}	
		}
		for(int i =0; i < count.length;i++){
			System.out.println(count[i]);
		}
		return AI;
	}
	
	
	
	public void gamePlay(){
		
		//implement the gameplay
	}
}



abstract class Cards{
	private String name = "";
	private int attackVal;
	private int defVal;
	
	public Cards(String name, int attackVal, int defVal){
		this.name = name;
		this.attackVal = attackVal;
		this.defVal = defVal;
	}
	
	
	public void setName(String name){
		name = this.name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setAttackVal(int attackVal){
		attackVal = this.attackVal;
	}
	
	public int getAttackVal(){
		return this.attackVal;
	}
	
	public void setDefVal(int defVal){
		defVal = this.defVal;
	}
	
	public int getDefVal(){
		return this.defVal;
	}
	
	
		
}



class Dagger extends Cards{
	public Dagger(){
		super("Dagger", 1,1);
		
	}
}

class Sword extends Cards{
	public Sword(){
		super("Sword", 2,2);
		
	}
}

class MorningStar extends Cards{
	public MorningStar(){
		super("Morning", 3,3);
		
	}
}

class WarAxe extends Cards{
	public WarAxe(){
		super("WarAxe", 4,4);
		
	}
}

class Halberd extends Cards{
	public Halberd(){
		super("Halberd", 5,5);
		
	}
}

class LongSword extends Cards{
	public LongSword(){
		super("LongSword", 6,6);
		
	}
}

class Archer extends Cards{
	public Archer(){
		super("Archer", 7,0);
		
	}
}

class Sheild extends Cards{
	public Sheild(){
		super("Sheild", -1,-1);
		
	}
}

class Crown extends Cards{
	public Crown(){
		super("Crown", -2,-2);
		
	}
}