import java.util.ArrayList;
import java.util.Scanner;

public class Scrimish {

	public static void main(String[] args) {
		Cards[][] computer = setUpAI();
		Cards[][] person = setUp();
		
		for(int i = 0; i< person.length; i++){
			System.out.println("");
			for(int j =0; j< person[i].length;j++){
				System.out.print(person[i][j].getName() + " ");
			}
		
		}
		
		System.out.println("");
		System.out.println("");
		
		for(int i = 0; i< computer.length; i++){
			System.out.println("");
			for(int j =0; j< computer[i].length;j++){
				System.out.print(computer[i][j].getName() + " ");
			}
		}
		
		System.out.println("");
		System.out.println("");
		gamePlay(person,computer, 1);
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
	
	
	
	public static void gamePlay(Cards[][] player1, Cards[][] player2, int starting){
		
		int indexPlayer1 = 0;;
		int indexPlayer2 = 0;
		
		for(int i = 0; i < player1.length; i++){
			if(player1[i][4].getName().equals("Crown")){
				indexPlayer1 = i;
			}
			if(player2[i][4].getName().equals("Crown")){
				indexPlayer2 = i;
			}
			
		}
		
		
		
		
		if(starting == 1){  
			//player1 starting 
			while(!(player1[indexPlayer1][4].getName().equals("Destroyed")) && !(player2[indexPlayer2][4].getName().equals("Destroyed")) ){
				//player 1 attacks while ai defends..
				System.out.println("Player 1 attacks while the AI defends");
				
				//choose card from top of one of my piles. 
				boolean status = true;
				boolean statusOfDiscard = false;
				boolean statusDestroyed = false;
				int player1I = 0;
				int player1J = 0;
				int player2I = 0;
				int player2J = 0;
				String choice = "";
				Scanner stdin = new Scanner(System.in);
				Scanner in = new Scanner(System.in);
				 
				do{
					System.out.print("Choose a card from your pile: ");
					int pilePlayer1 = stdin.nextInt();
					
					
					while(pilePlayer1 < 0 || pilePlayer1 > 4){
						System.out.println("Invalid Entry. There are only 5 piles.");
						System.out.print("Enter index for which pile you want to attack from: ");
						pilePlayer1 = stdin.nextInt();
					}
					
					
					
					for(int j = 0; j<player1[pilePlayer1].length; j++){
						if(player1[pilePlayer1][j].getName().equals("Destroyed") && j == 4){
							statusDestroyed = true;
							break;
						}else if(player1[pilePlayer1][j].getName().equals("Destroyed")){
							continue;
						}else{
							player1I = pilePlayer1;
							player1J = j;
							statusDestroyed = false;
							break;
							
						}
					}
					if(statusDestroyed == false){
						System.out.println("The chosen card is: " + player1[player1I][player1J].getName());
						System.out.print("d. Discard or a. Attack: ");
						choice = in.nextLine();
						
						if(choice.equals("d") && !(player1[player1I][player1J].getName().equals("Crown"))){
							//discard the chosen card.
							System.out.println("The discarded is: " + player1[player1I][player1J].getName());
							player1[player1I][player1J].setName("Destroyed");
							player1[player1I][player1J].setAttackVal(-100);
							player1[player1I][player1J].setDefVal(-100);
							status = false;
							statusOfDiscard = true;
						}else if(choice.equals("d") && (player1[player1I][player1J].getName().equals("Crown"))){
							System.out.println("Crown Card can't be discarded.");
						}else if(choice.equals("a")){
							//continue with attack.
							status = false;
						}else{
							System.out.println("Invalid Entry. Choose option from the given choice.");
						}
					}else{
						
						System.out.println("The chosen card and the whole pile is: " + player1[player1I][player1J].getName());
						System.out.println("Please choose another card from a different pile.");
					
					}
					
					
					
					
					
				}while(status);
				
				//if file has not been discarded 
				if(statusOfDiscard == false){
					System.out.println("The attacking card is: " + player1[player1I][player1J].getName());
					
					//choose card from top of one of opponents files. 
					
					
					do{
						System.out.print("Enter index for which pile you want to attack to: ");
						int pilePlayer2 = stdin.nextInt();
						while(pilePlayer2 < 0 || pilePlayer2 > 4){
							System.out.println("Invalid Entry. There are only 5 piles.");
							System.out.print("Enter index for which pile you want to attack to: ");
							pilePlayer2 = stdin.nextInt();
						}
						
						
						
						for(int j = 0; j<player2[pilePlayer2].length; j++){
							if(player2[pilePlayer2][j].getName().equals("Destroyed") && j == 4){
								break;
							}else if(player2[pilePlayer2][j].getName().equals("Destroyed")){
								continue;
							}else{
								player2I = pilePlayer2;
								player2J = j;
								status = false;
								break;
							}
						}
						
					}while(status);
					
					
					System.out.println("The defending card is: " +player2[player2I][player2J].getName());
					
					
					//cards are printed and values compared to. 
					//cards are treated according to constraints
					
					if(player1[player1I][player1J].getAttackVal() > player2[player2I][player2J].getDefVal() && !(player1[player1I][player1J].getName().equals("Sheild")) && !(player2[player2I][player2J].getName().equals("Sheild"))){
						//if your opponents crown is attacked then you win
						if(player2[player2I][player2J].getName().equals("Crown")){
							System.out.println("Player 1 Wins");
							System.exit(0);
						}
						
						
						
						player2[player2I][player2J].setName("Destroyed");
						player2[player2I][player2J].setAttackVal(-100);
						player2[player2I][player2J].setDefVal(-100);
						
						
					}else if(player1[player1I][player1J].getAttackVal() < player2[player2I][player2J].getDefVal() && !(player1[player1I][player1J].getName().equals("Sheild")) && !(player2[player2I][player2J].getName().equals("Sheild"))){
						//if you attack with you crown card your opponents non-crown cards then you lose
						
						if(player1[player1I][player1J].getName().equals("Crown")){
							System.out.println("Player 2 Wins");
							System.exit(0);
						}
						
						player1[player1I][player1J].setName("Destroyed");
						player1[player1I][player1J].setAttackVal(-100);
						player1[player1I][player1J].setDefVal(-100);
					}else if(player1[player1I][player1J].getAttackVal() == player2[player2I][player2J].getDefVal() && !(player1[player1I][player1J].getName().equals("Sheild")) && !(player2[player2I][player2J].getName().equals("Sheild"))){
						
						//if your opponents crown is attacked then you win
						if(player2[player2I][player2J].getName().equals("Crown")){
							System.out.println("Player 1 Wins");
							System.exit(0);
						}
						
						//if you attack with you crown card your opponents non-crown cards then you lose
						
						if(player1[player1I][player1J].getName().equals("Crown")){
							System.out.println("Player 2 Wins");
							System.exit(0);
						}
						
						//discarding both non-crown cards
						
						player2[player2I][player2J].setName("Destroyed");
						player2[player2I][player2J].setAttackVal(-100);
						player2[player2I][player2J].setDefVal(-100);
						
						player1[player1I][player1J].setName("Destroyed");
						player1[player1I][player1J].setAttackVal(-100);
						player1[player1I][player1J].setDefVal(-100);
						
						
					}else if((player1[player1I][player1J].getName().equals("Sheild"))){
						//if shield is used to attack, it is discarded.
						player1[player1I][player1J].setName("Destroyed");
						player1[player1I][player1J].setAttackVal(-100);
						player1[player1I][player1J].setDefVal(-100);
					}else if((player2[player2I][player2J].getName().equals("Sheild")) && ((player1[player1I][player1J].getName().equals("Archer")) || (player1[player1I][player1J].getName().equals("Crown")))){
						//if you are attacking with a crown
						
						if(player1[player1I][player1J].getName().equals("Crown")){
							System.out.println("Player 2 Wins");
							System.exit(0);
						}
						
						//if you are attacking with archer
						if(player1[player1I][player1J].getName().equals("Archer")){
							//both are put back into their original piles
							continue;
						}
						
						
						
					}else if((player2[player2I][player2J].getName().equals("Sheild"))){
						
						//both cards are discarded
						player2[player2I][player2J].setName("Destroyed");
						player2[player2I][player2J].setAttackVal(-100);
						player2[player2I][player2J].setDefVal(-100);
						
						player1[player1I][player1J].setName("Destroyed");
						player1[player1I][player1J].setAttackVal(-100);
						player1[player1I][player1J].setDefVal(-100);
						
						
					}
					
					
					System.out.println("The attacking card after attack is: " + player1[player1I][player1J].getName());
					System.out.println("The defending card after attack is: " +player2[player2I][player2J].getName());
				}
				
				
				
				System.out.println("Player 1 attack ended. Now the AI attacks, while player 1 defends");
				// ai attacks and player 1 defends.
				
				
				
				
				
				
				
				
				
				
				
				
			
			
			}
			
			
		}else if(starting == -1){
			//player2 starting 
			
			while(!(player1[indexPlayer1][4].getName().equals("Destroyed")) && !(player2[indexPlayer2][4].getName().equals("Destroyed")) ){
				
				
				
		}
			
			
			
			
			
		}else{
			
		}
		
		
		
		
		
		
		
		
		
		//implement the gameplay
		
		//if toggle is 1
			//while crown card is not attacked
				//attack logic of player1
					//player 1 starts by picking 
					//choose card from top of one of my piles. 
					//choose card from top of one of opponents files. 
					//cards are printed and values compared to. 
					//cards are treated according to constraints
		
				//attack logic of ai 
					//ai starts by picking 
					//choose card from top of one of my piles. 
					//choose card from top of one of opponents files.
					//cards are printed and values compared to.
					//cards are treated according to constraints
		
		
		
		
		
		//if toggle is -1
			//computer starts by picking
	
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
		this.name = name;
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