import java.util.ArrayList;

public class ListBattle {

	static ArrayList <Battle> battleMoves = new ArrayList <Battle>();
	
	public static void fillMoves() {
		battleMoves.add(new Battle ("Quick Attack", "Quick Attack", 1, 1, "Tie", 0, 0));
		battleMoves.add(new Battle ("Heavy Attack", "Quick Attack", 2, 0, "Win", 0, 0));
		battleMoves.add(new Battle ("Block", "Quick Attack", 0, 1, "Loose", 0, 0));
		battleMoves.add(new Battle ("Health Boost", "Quick Attack", 0, 0, "Tie", 0, 0));
		
		battleMoves.add(new Battle ("Quick Attack", "Heavy Attack", 0, 2, "Loose", 0, 0));
		battleMoves.add(new Battle ("Heavy Attack", "Heavy Attack", 0, 0, "Tie", 0, 0));
		battleMoves.add(new Battle ("Block", "Heavy Attack", 0, 0, "Tie", 0, 0));
		battleMoves.add(new Battle ("Health Boost", "Heavy Attack", 0, 1, "Loose", 0, 0));
		
		battleMoves.add(new Battle ("Quick Attack", "Block", 1, 0, "Win", 0, 0));
		battleMoves.add(new Battle ("Heavy Attack", "Block", 0, 0, "Tie", 0, 0));
		battleMoves.add(new Battle ("Block", "Block", 0, 0, "Tie", 0, 0));
		battleMoves.add(new Battle ("Health Boost", "Block", 0, 0, "Win", 1, 0));
		
		battleMoves.add(new Battle ("Quick Attack", "Health Boost", 0, 0, "Tie", 0, 0));
		battleMoves.add(new Battle ("Heavy Attack", "Health Boost", 1, 0, "Win", 0, 0));
		battleMoves.add(new Battle ("Block", "Health Boost", 0, 0, "Loose", 0, 1));
		battleMoves.add(new Battle ("Health Boost", "Health Boost", 0, 0, "Tie", 1, 1));

	}

}
