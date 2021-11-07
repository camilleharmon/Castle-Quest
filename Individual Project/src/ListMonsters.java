import java.util.ArrayList;

public class ListMonsters {

	static ArrayList <Monster> monsters = new ArrayList <Monster>();
	
		public static void fillMonsters() {
			monsters.add(new Monster ("Terror", false, 0, 1, 5));
			monsters.add(new Monster ("Terror Brute", true, 2, 2, 10));
		}
	
}
