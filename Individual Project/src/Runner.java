import java.util.Scanner;

public class Runner
	{

		static Scanner userInput = new Scanner (System.in);
		static Scanner userStringInput = new Scanner (System.in);
		static Scanner userIntInput = new Scanner (System.in);
		
		static Character hero = new Character("Roger");
		
		static boolean canExplore = false;
		
		static int choice = 1;
		
		static boolean hasStorageKey = false;
		static int lookingForKey = 0;
		
		public static void main(String[] args)
			{
				ListLocations.fillList();
				
				System.out.println("  O");
				System.out.println("--|--");
				System.out.println(" / \\");
				
				welcomePlayer();
			   
			   canExplore = true;
			   
			   entrance();
			   
			}
		
		public static void welcomePlayer() {
			System.out.println("Narrator: This is your character. He needs a name. (Ex. Roger)");
			String name = userInput.nextLine();
			hero.setName(name);
		   System.out.println("Narrator: Hello " + name + "! Let's explore your house.");
		   System.out.println("Narrator: In conversations, press any key to continue the story line.");
		   String pause = userStringInput.nextLine();
		}
		
		public static void entrance() {
			System.out.println(ListLocations.locations.get(0).getName());
			System.out.println(ListLocations.locations.get(0).getDescription());
			System.out.println(ListLocations.locations.get(0).getInitialChoice());
			if(lookingForKey == 3) {
				System.out.println(ListLocations.locations.get(0).getOptionalChoiceO());
				choice = userIntInput.nextInt();
				if (choice == 1) {
					hall();
				}else if (choice == 2) {
					bedroom();
				}else if (choice == 3) {
					searchVase();
				}else {
					entrance();
				}
			}
			choice = userIntInput.nextInt();
			
			if (choice == 1) {
				hall();
			}else if (choice == 2) {
				bedroom();
			}else {
				entrance();
			}
			
		}
		
		public static void searchVase() {
			System.out.println(hero.getName() + ": It's here!");
			String pause = userStringInput.nextLine();
			System.out.println("Narrator: Yay! Now unlock the storage room! It looks so ~mysterious~.");
			
			lookingForKey = 0;
			hasStorageKey = true;
			entrance();
			
		}
		
		public static void bedroom() {
			System.out.println(ListLocations.locations.get(2).getName());
			System.out.println(ListLocations.locations.get(2).getDescription());
			System.out.println(ListLocations.locations.get(2).getInitialChoice());
			if(lookingForKey == 1) {
				System.out.println(ListLocations.locations.get(2).getOptionalChoiceO());
				choice = userIntInput.nextInt();
				if (choice == 1) {
					entrance();
				}else if (choice == 2) {
					bed();
				}else if (choice == 3){
					closet();
				}else if (choice == 4) {
					searchCloset();
				}else {
					bedroom();
				}
			}else if(lookingForKey == 2) {
				System.out.println(ListLocations.locations.get(2).getOptionalChoiceT());
				choice = userIntInput.nextInt();
				if (choice == 1) {
					entrance();
				}else if (choice == 2) {
					bed();
				}else if (choice == 3){
					closet();
				}else if (choice == 5) {
					searchBed();
				}else {
					bedroom();
				}
			}
			
			choice = userIntInput.nextInt();
			
			if (choice == 1) {
				entrance();
			}else if (choice == 2) {
				bed();
			}else if (choice == 3){
				closet();
			}else {
				bedroom();
			}
			
		}
		
		public static void searchCloset() {
			System.out.println(hero.getName() + ": The closet is empty. There isn't even any clothes.");
			String pause = userStringInput.nextLine();
			System.out.println("Narrator: Try under the bed.");
			
			lookingForKey = 2;
			bedroom();
			
		}
		
		public static void searchBed() {
			System.out.println(hero.getName() + ": There's nothing here either! You don't know where it is, do you?");
			String pause = userStringInput.nextLine();
			System.out.println("Narrator: You locked it and lost the key. Let's check the vase in the entrance.");
			
			lookingForKey = 3;
			bedroom();
			
		}
		
		public static void bed() {
			System.out.println("Narrator: If you are this tired, stop playing and go to bed.");
			System.out.println(ListLocations.locations.get(2).getInitialChoice());
			choice = userIntInput.nextInt();
			
			if (choice == 1) {
				entrance();
			}else if (choice == 2) {
				bed();
			}else if (choice == 3){
				closet();
			}else {
				bedroom();
			}
			
		}
		
		public static void closet() {
			System.out.println("Narrator: What did you expect? Clothes? You’re a stick figure.");
			System.out.println(ListLocations.locations.get(2).getInitialChoice());
			choice = userIntInput.nextInt();
			
			if (choice == 1) {
				entrance();
			}else if (choice == 2) {
				bed();
			}else if (choice == 3) {
				closet();
			}else {
				bedroom();
			}
			
		}
		
		public static void hall() {
			System.out.println(ListLocations.locations.get(1).getName());
			System.out.println(ListLocations.locations.get(1).getDescription());
			System.out.println(ListLocations.locations.get(1).getInitialChoice());
			choice = userIntInput.nextInt();
			
			if (choice == 1) {
				entrance();
			}else if (choice == 2 && hasStorageKey == true) {
				storage();
			}else if (choice == 2){
				findKey();
			}else {
				hall();
			}
			
		}
		
		public static void findKey() {
			System.out.println("Narrator: It's locked.");
			String pause = userStringInput.nextLine();
			System.out.println(hero.getName() + ": Why?");
			pause = userStringInput.nextLine();
			System.out.println("Narrator: You locked it, you tell me.");
			pause = userStringInput.nextLine();
			System.out.println(hero.getName() + ": When did I lock it? I just got here!");
			pause = userStringInput.nextLine();
			System.out.println("Narrator: Stop breaking the fourth wall. I'm the narrator here.");
			pause = userStringInput.nextLine();
			System.out.println(hero.getName() + ": Fine. Do you know where the key is?");
			pause = userStringInput.nextLine();
			System.out.println("Narrator: I think it's in your closet in your room.");
			
			lookingForKey = 1;
			
			System.out.println(ListLocations.locations.get(1).getInitialChoice());
			choice = userIntInput.nextInt();
			
			if (choice == 1) {
				entrance();
			}else if (choice == 2 && hasStorageKey == true) {
				storage();
			}else if (choice == 2){
				findKey();
			}else {
				hall();
			}
			
		}
		
		public static void storage() {
				System.out.println(ListLocations.locations.get(3).getName());
				System.out.println(ListLocations.locations.get(3).getDescription());
				System.out.println(ListLocations.locations.get(3).getInitialChoice());
				choice = userIntInput.nextInt();
			
				if (choice == 1) {
					searchStorage();
				}else if (choice == 2){
					hall();
				}else {
					storage();
				}
			
			
			
		}
		
		public static void searchStorage() {
			System.out.println("");
			System.out.println(hero.getName() + ": This was a complete waste of time!");
			String pause = userStringInput.nextLine();
			System.out.println("Narrator: No, I’ll let you know if that’s the case. One man’s trash is another’s treasure! ");
			System.out.println("In this case, you’re both of them. Now get digging.");
			pause = userStringInput.nextLine();
			System.out.println("");
			System.out.println("------------------");
			System.out.println("To be continued...");
			System.out.println("------------------");
			System.out.println("");
			storage();
		}
		
		
		
	}
