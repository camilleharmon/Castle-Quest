import java.util.ArrayList;

public class ListLocations
	{
		static ArrayList <Location> locations = new ArrayList <Location>();
		
		public static void fillList() {
			locations.add(new Location("Entrance", "Narrator: You are at the entrance of your house. There is an exit door behind you. A vase sits on a small table.", "Right(1) or Left(2)", "Search Vase(3)", "Exit House(4)"));
			locations.add(new Location("Hall", "Narrator: There is a door at the end of the hall labeled ‘Storage’.", "Left(1) or Storage(2)", "Unlock Storage(3)", ""));
			locations.add(new Location("Bedroom", "Narrator: This is your bedroom. There is a bed and a closet.", "Right(1) or Bed(2) or Closet(3)", "Search Closet(4)", "Search Bed(5)"));
			locations.add(new Location("Storage", "Narrator: The room is filled with 2-D junk. It would be a wonder if there’s anything useful in here.", "Search Storage(1) or Left(2)", "", ""));
			locations.add(new Location("Lawn", "Narrator: You have a lovely lawn. The grass is trimmed and the weeds have been removed. In the corner sits an apple tree. Chickens roam the lawn.", "Return to House(1) or Right(2)", "Collect Apple(3)", "Feed Chickens(4)"));
			locations.add(new Location("Well", "Narrator: A lonely well sits here, it is weathered and worn but it remains sturdy. You glance down the well to see if there is some water at the bottom. It’s dark, but there might be a few buckets worth below.", "Right(1) or Left(2)", "Fill Bucket(3)", ""));
			locations.add(new Location("Blacksmith's Shop", "Narrator: A cozy blacksmith’s shop sits in the hills. You can see Barry, the Blacksmith, mending a tool.", "Right(1) or Left(2) or Talk to Barry(3)", "", ""));
			locations.add(new Location("Barry", "Barry: Welcome to my shop. What can I do for you?", "What do you sell?(1) or Who are you?(2), or Can you tell me a joke?(3)", "Can you sharpen this sword?(4)", "I have water!(5)"));
			
			
			
		}
		
	}
