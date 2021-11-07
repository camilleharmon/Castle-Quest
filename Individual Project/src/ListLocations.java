import java.util.ArrayList;

public class ListLocations
	{
		static ArrayList <Location> locations = new ArrayList <Location>();
		
		public static void fillLocations() {
			locations.add(new Location("Entrance", "Narrator: You are at the entrance of your house. There is an exit door behind you. A vase sits on a small table."));
			locations.add(new Location("Hall", "Narrator: There is a door at the end of the hall labeled ‘Storage’."));
			locations.add(new Location("Bedroom", "Narrator: This is your bedroom. There is a bed and a closet."));
			locations.add(new Location("Storage", "Narrator: The room is filled with 2-D junk. It would be a wonder if there’s anything useful in here."));
			locations.add(new Location("Lawn", "Narrator: You have a lovely lawn. The grass is trimmed and the weeds have been removed. In the corner sits an apple tree. Chickens roam the lawn."));
			locations.add(new Location("Well", "Narrator: A lonely well sits here, it is weathered and worn but it remains sturdy. You glance down the well to see if there is some water at the bottom. It’s dark, but there might be a few buckets worth below."));
			locations.add(new Location("Blacksmith's Shop", "Narrator: A cozy blacksmith’s shop sits in the hills. You can see Barry, the Blacksmith, mending a tool."));
			locations.add(new Location("Barry", "Barry: Welcome to my shop. What can I do for you?"));
			locations.add(new Location("Cave Entrance", "Narrator: A cave lies before you. It looks like a makeshift pile of rocks precariously balanced together. Grass and moss peak through the cracks. The forest around it helps it blend into the hill."));			
			locations.add(new Location("Cave", "Narrator: You must act quick, the Terrors have started to notice your presence."));
			
			
		}
		
	}
