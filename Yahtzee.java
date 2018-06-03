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
	int[] aantalDobbelstenen = {1,2,3,4,5,6};
	int ronde;
	
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
						"Getal '2' is dobbelsteen laten rollen, etc. Getal 6 is om alle dobbelstemem opnieuw te doen";
		System.out.println(line);	
		for(int i = 0;  i < aantalDobbelstenen.length; i++) {
			Scanner user_input = new Scanner(System.in);
			int getal = user_input.nextInt();
			if (getal <= aantalDobbelstenen[i]) {
				if(getal ==  aantalDobbelstenen[i]) {
					if(getal == 1) {
						dobbelwerp();
						break;
					}else if(getal ==2) {
						dobbelwerp2();
						break;
					}else if(getal == 3) {
						dobbelwerp3();
						break;
					}else if (getal == 4) {
						dobbelwerp4();
						break;
					}else if (getal == 5) {
						dobbelwerp5();
						break;
					}else if(getal == 6){
						dobbelsteengooien();
						break;
					}
				}
		
			}else{
				System.out.println("Please choose another number");
				opnieuwgooien();
		}
		}
}
}



