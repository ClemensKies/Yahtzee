import java.util.HashMap;

public class Kaart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scorekaart kaart1 = new Scorekaart();
		Scorekaart kaart2 = new Scorekaart();
	}

}

class Scorekaart{
	
	Scorekaart() {
	HashMap<String, Integer> notitie = new HashMap<String, Integer>();
	
	notitie.put("1",0);
	notitie.put("2",0);
	notitie.put("3",0);
	notitie.put("4",0);
	notitie.put("5",0);
	notitie.put("6",0);
	notitie.put("Three of a kind",0);
	notitie.put("Four of a kinf",0);
	notitie.put("Fullhouse",0);
	notitie.put("kleine straat",0);
	notitie.put("grote straat",0);
	notitie.put("Yahtzee",0);
	notitie.put("Chance",0);
	
	}
	
	
}