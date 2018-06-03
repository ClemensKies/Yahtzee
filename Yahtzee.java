import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Yahtzee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Yahtzee");
		Player speler1 = new Player();
		Player speler2 = new Player();
		speler1.naaminvoeren();
		speler2.naaminvoeren();
		System.out.println(speler1.naam + " roll the dice");
		speler1.dobbelsteengooien();
		speler1.opnieuwgooien();
		System.out.println();
		System.out.println(speler2.naam + " roll the dice");
		speler2.dobbelsteengooien();
		speler2.opnieuwgooien();
		

	}

}

class Player{
	String naam;
	int uitkomst_steen1;
	int uitkomst_steen2;
	int uitkomst_steen3;
	int uitkomst_steen4;
	int uitkomst_steen5;
	
	public void naaminvoeren(){
		System.out.println("Please enter your name: ");
		Scanner input = new Scanner(System.in);
		 naam = input.next();
		 System.out.println("Welcome " + naam);
		}

	public void dobbelsteengooien() {
		Random random = new Random();
		uitkomst_steen1 = random.nextInt(6) +1;
		uitkomst_steen2 = random.nextInt(6) +1;
		uitkomst_steen3 = random.nextInt(6) +1;
		uitkomst_steen4 = random.nextInt(6) +1;
		uitkomst_steen5 = random.nextInt(6) +1;
		System.out.println("Dobbelsteen 1 = " +uitkomst_steen1);
		System.out.println("Dobbelsteen 2 = " +uitkomst_steen2);
		System.out.println("Dobbelsteen 3 = " +uitkomst_steen3);
		System.out.println("Dobbelsteen 4 = " +uitkomst_steen4);
		System.out.println("Dobbelsteen 5 = " +uitkomst_steen5);
	}
	
	public void dobbelwerp() {
		Random random = new Random();
		uitkomst_steen1 = random.nextInt(6) +1;
		System.out.println("Dobbelsteen 1 reroll = " +uitkomst_steen1);
		System.out.println("Dobbelsteen 2 = " +uitkomst_steen2);
		System.out.println("Dobbelsteen 3 = " +uitkomst_steen3);
		System.out.println("Dobbelsteen 4 = " +uitkomst_steen4);
		System.out.println("Dobbelsteen 5 = " +uitkomst_steen5);
	}
		
	public void dobbelwerp2() {
		Random random = new Random();
		uitkomst_steen2 = random.nextInt(6) +1;
		System.out.println("Dobbelsteen 1 = " +uitkomst_steen1);
		System.out.println("Dobbelsteen 2 reroll = " +uitkomst_steen2);
		System.out.println("Dobbelsteen 3 = " +uitkomst_steen3);
		System.out.println("Dobbelsteen 4 = " +uitkomst_steen4);
		System.out.println("Dobbelsteen 5 = " +uitkomst_steen5);
	}
	
	public void dobbelwerp3 () {
		Random random = new Random();
		uitkomst_steen3 = random.nextInt(6) +1;
		System.out.println("Dobbelsteen 1 = " +uitkomst_steen1);
		System.out.println("Dobbelsteen 2 = " +uitkomst_steen2);
		System.out.println("Dobbelsteen 3 reroll = " +uitkomst_steen3);
		System.out.println("Dobbelsteen 4 = " +uitkomst_steen4);
		System.out.println("Dobbelsteen 5 = " +uitkomst_steen5);
	}
	
	public void dobbelwerp4() {
	Random random = new Random();
	uitkomst_steen4 = random.nextInt(6) +1;
	System.out.println("Dobbelsteen 1 = " +uitkomst_steen1);
	System.out.println("Dobbelsteen 2 = " +uitkomst_steen2);
	System.out.println("Dobbelsteen 3 = " +uitkomst_steen3);
	System.out.println("Dobbelsteen 4 reroll = " +uitkomst_steen4);
	System.out.println("Dobbelsteen 5 = " +uitkomst_steen5);
	}
	
	public void dobbelwerp5() {
		Random random = new Random();
		uitkomst_steen5 = random.nextInt(6) +1;
		System.out.println("Dobbelsteen 1 = " +uitkomst_steen1);
		System.out.println("Dobbelsteen 2 = " +uitkomst_steen2);
		System.out.println("Dobbelsteen 3 = " +uitkomst_steen3);
		System.out.println("Dobbelsteen 4 = " +uitkomst_steen4);
		System.out.println("Dobbelsteen 5 reroll = " +uitkomst_steen5);
	}
	
	public void opnieuwgooien() {
		System.out.println();
		String line = 	"Wil je alle dobbelstenen behouden, of wil je (enkele opnieuw gooien\n" +
						"Je kan kiezen uit de volgende getallen. getal '1' gooit dobbelsteen 1 opnieuw\n" +
						"Getal '2' gooit dobbelsteen 2 opnieuw, etc. Getal 6 is om alle dobbelstemem opnieuw te doen\n" +
						"Wanneer je de worp wilt behouden typ je getal 7 in";
		System.out.println(line);
		int ronde = 0;
		while ( ronde < 2) {
				Scanner user_input = new Scanner(System.in);
				int getal = user_input.nextInt();
						if(getal == 1) {
							ronde++;
							dobbelwerp();
							
						}else if(getal ==2) {
							ronde++;
							dobbelwerp2();
			
						}else if(getal == 3) {
							ronde++;
							dobbelwerp3();
							
						}else if (getal == 4) {
							ronde++;
							dobbelwerp4();
							
						}else if (getal == 5) {
							ronde++;
							dobbelwerp5();
						}else if(getal == 6){
							ronde++;
							dobbelsteengooien();
						}else {
							System.out.print("Next player");
							break;
						}
					if(ronde ==2) {
						System.out.println("Next player");
						break;
					}
					
					}
			
				}	
		
}
