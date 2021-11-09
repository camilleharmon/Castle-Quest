import java.util.Scanner;
import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Runner
	{
		
		private static final long serialVersionUID = 1L;
		static JFrame frame = new JFrame();
		
		static Scanner userInput = new Scanner (System.in);
		static Scanner userStringInput = new Scanner (System.in);
		static Scanner userIntInput = new Scanner (System.in);
		
		static Character hero = new Character("Roger", false, 0, 1, 5);
		
		static int choice = 1;
		static String choice2 = "";
		
		static boolean hasStorageKey = false;
		static int lookingForKey = 0;
		static boolean doorOpen = false;
		static boolean canSearchStorage = false;
		static boolean firstTime = true;
		static boolean lookingForWater = false;
		static boolean hasWater = false;
		static boolean firstBarry = true;
		static boolean completeBarryQuest = false;
		static boolean firstBattle = true;
		static boolean firstFightConvo = true;
		static int monsterMove = 0;
		
		public static void main(String[] args)
			{
				ListLocations.fillLocations();
				ListBattle.fillMoves();
				ListMonsters.fillMonsters();
				
				ImageIcon icon = new ImageIcon(("heroSTART.PNG"));
				JFrame frame = new JFrame();
				JOptionPane.showMessageDialog(
						frame,
						"Narrator: This is your character. He needs a name.",
						"Castle Quest",
						JOptionPane.QUESTION_MESSAGE,
						icon);
				
				battleEntrance();
				
				//well();
				
				//welcomePlayer();
			   
			   //entrance();
			   
			}
		
		public static void welcomePlayer() {
			
			String name = JOptionPane.showInputDialog(
					"Narrator: What will you name him?");  
			JOptionPane.showMessageDialog(
					frame, 
					"Narrator: Hello, " + name + "! Let's explore your house.");
			hero.setName(name);
			hero.setSword(false);
			hero.setHitpoints(10);
			JOptionPane.showMessageDialog(
					frame, 
					"Narrator: In conversations, press any key to continue the story line.");
			
		}
		
		public static void entrance() {
			Object[] options = {"Left", "Right"};
			choice = JOptionPane.showOptionDialog(
					frame, 
					ListLocations.locations.get(0).getDescription(),
					ListLocations.locations.get(0).getName(),
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, 
					options, 
					options);
			
				switch(choice)
				{
				case 0:
						{
							if(lookingForKey == 1) {
								bedroom2();
							}else if(lookingForKey == 2) {
								bedroom3();
							}else {
								bedroom();
							}
							break;
						}
				case 1:
						{
							hall();
							break;
						}
				}	
		}

		public static void entrance2() {
			Object[] options = {"Left", "Right", "Search Vase"};
			choice = JOptionPane.showOptionDialog(
					frame, 
					ListLocations.locations.get(0).getDescription(),
					ListLocations.locations.get(0).getName(),
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, 
					options, 
					options);
				
			switch(choice)
			{
			case 0:
					{
						bedroom();
						break;
					}
			case 1:
					{
						hall();
						break;
					}
			case 2:
					{
						searchVase();
					}
			}	
		}	
			
		public static void entrance3() {
				Object[] options = {"Left", "Right", "Exit House"};
				choice = JOptionPane.showOptionDialog(
						frame, 
						ListLocations.locations.get(0).getDescription(),
						ListLocations.locations.get(0).getName(),
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null, 
						options, 
						options);
				
				switch(choice)
				{
				case 0:
						{
							bedroom();
							break;
						}
				case 1:
						{
							hall();
							break;
						}
				case 2:
						{
							lawn();
							break;
						}
				}	
				
			}
			
		public static void searchVase() {
			JOptionPane.showMessageDialog(
					frame,	
				hero.getName() + ": It's here!");
			JOptionPane.showMessageDialog(
					frame,
					"Narrator: Yay! Now unlock the storage room! It looks so ~mysterious~.");
			
			lookingForKey = 0;
			hasStorageKey = true;
			canSearchStorage = true;
			entrance();
			
		}
		
		public static void bedroom() {
			Object[] options = {"Right", "Bed", "Closet"};
			choice = JOptionPane.showOptionDialog(
					frame, 
					ListLocations.locations.get(2).getDescription(),
					ListLocations.locations.get(2).getName(),
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, 
					options, 
					options);
			
			switch(choice)
			{
			case 0:
					{
						if(lookingForKey == 3) {
							entrance2();
						}else if(doorOpen) {
							entrance3();
						}else {
							entrance();
						}
						break;
					}
			case 1:
					{
						bed();
						break;
					}
			case 2:
					{
						closet();
					}
			}
			
		}

		public static void bedroom2() {
			Object[] options = {"Right", "Bed", "Closet", "Search Closet"};
			choice = JOptionPane.showOptionDialog(
					frame, 
					ListLocations.locations.get(2).getDescription(),
					ListLocations.locations.get(2).getName(),
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, 
					options, 
					options);
			
			
			switch(choice)
			{
			case 0:
					{
						if(lookingForKey == 3) {
							entrance2();
						}else if(doorOpen) {
							entrance3();
						}else {
							entrance();
						}
						break;
					}
			case 1:
					{
						bed();
						break;
					}
			case 2:
					{
						closet();
					}
			case 3:
					{
						searchCloset();
					}
			}
			
		}
		
		public static void bedroom3() {
			Object[] options = {"Right", "Bed", "Closet", "Search Bed"};
			choice =JOptionPane.showOptionDialog(
					frame, 
					ListLocations.locations.get(2).getDescription(),
					ListLocations.locations.get(2).getName(),
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, 
					options, 
					options);
				
			switch(choice)
			{
			case 0:
					{
						if(lookingForKey == 3) {
							entrance2();
						}else if(doorOpen) {
							entrance3();
						}else {
							entrance();
						}
						break;
					}
			case 1:
					{
						bed();
						break;
					}
			case 2:
					{
						closet();
					}
			case 3:
					{
						searchBed();
					}
			}
			
		}
		
		public static void searchCloset() {
			JOptionPane.showMessageDialog(
					frame,					
					hero.getName() + ": The closet is empty. There isn't even any clothes.");
			JOptionPane.showMessageDialog(
					frame,
					"Narrator: Try under the bed.");
			
			lookingForKey = 2;
			bedroom3();
			
		}
		
		public static void searchBed() {
			JOptionPane.showMessageDialog(
					frame,
					hero.getName() + ": There's nothing here either! You don't know where it is, do you?");
			JOptionPane.showMessageDialog(
					frame,
					"Narrator: You locked it and lost the key. Let's check the vase in the entrance.");
			
			lookingForKey = 3;
			bedroom();
			
		}
		
		public static void bed() {
			JOptionPane.showMessageDialog(
					frame,
					"Narrator: If you are this tired, stop playing and go to bed.");
			
			if(lookingForKey == 1) {
				bedroom2();
			}else if(lookingForKey == 2) {
				bedroom3();
			}else {
				bedroom();
			}
		}
		
		public static void closet() {
			JOptionPane.showMessageDialog(
					frame,
					"Narrator: What did you expect? Clothes? You’re a stick figure.");
			
			if(lookingForKey == 1) {
				bedroom2();
			}else if(lookingForKey == 2) {
				bedroom3();
			}else {
				bedroom();
			}
			
		}
		
		public static void hall() {
			Object[] options = {"Left", "Storage"};
			choice = JOptionPane.showOptionDialog(
					frame, 
					ListLocations.locations.get(1).getDescription(),
					ListLocations.locations.get(1).getName(),
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, 
					options, 
					options);
			
				switch(choice)
				{
				case 0:
						{
							if(lookingForKey == 3) {
								entrance2();
							}else if(doorOpen) {
								entrance3();
							}else {
								entrance();
							}
							break;
						}
				case 1:
						{
							if (hasStorageKey) {
								storage();
							}else{
								findKey();
							}
							break;
						}
				}
			
		}
		
		public static void findKey() {
			JOptionPane.showMessageDialog(
					frame,
					"Narrator: It's locked.");
			JOptionPane.showMessageDialog(
					frame,
					hero.getName() + ": Why?");
			JOptionPane.showMessageDialog(
					frame,
					"Narrator: You locked it, you tell me.");
			JOptionPane.showMessageDialog(
					frame,
					hero.getName() + ": When did I lock it? I just got here!");
			JOptionPane.showMessageDialog(
					frame,
				"Narrator: Stop breaking the fourth wall. I'm the narrator here.");
			JOptionPane.showMessageDialog(
					frame,
				hero.getName() + ": Fine. Do you know where the key is?");
			JOptionPane.showMessageDialog(
					frame,
				"Narrator: I think it's in your closet in your room.");
			
			lookingForKey = 1;
			
			hall();
			
		}
		
		public static void storage() {
			Object[] options = {"Left", "Search Storage"};
			choice = JOptionPane.showOptionDialog(
					frame, 
					ListLocations.locations.get(3).getDescription(),
					ListLocations.locations.get(3).getName(),
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, 
					options, 
					options);
			
				switch(choice)
				{
				case 0:
						{
							hall();
							break;
						}
				case 1:
						{
							searchStorage();
							break;
						}
				}			
			
		}
		
		public static void searchStorage() {
			if (firstTime) {
				JOptionPane.showMessageDialog(
						frame,
						hero.getName() + ": This was a complete waste of time!");
				JOptionPane.showMessageDialog(
						frame,
						"Narrator: No, I’ll let you know if that’s the case. One man’s trash is another’s treasure! ");
				JOptionPane.showMessageDialog(
						frame,
						"Narrator: In this case, you’re both of them. Now get digging.");
				firstTime = false;
			}
			
			if(canSearchStorage) {
					if(hero.isSword() == false) {
						findSword();
					}
			}else {
				JOptionPane.showMessageDialog(
						frame,
						"Narrator: You searched hard, but found nothing of use at the time.");
				storage();
			}
			
		}
		
		public static void findSword() {
			JOptionPane.showMessageDialog(
					frame,
					hero.getName() + ": Hey, cool, I found a sword! It’s a bit dull though. Reminds me of your descriptions.");
			JOptionPane.showMessageDialog(
					frame,
					" + Dull Sword");
			JOptionPane.showMessageDialog(
					frame,
					"Narrator:  I would tell you to narrate yourself, but you would, and I can’t have that.");
			JOptionPane.showMessageDialog(
					frame,
					"Narrator: Let's take it to Barry the Blacksmith to get it sharpened.");
			JOptionPane.showMessageDialog(
					frame,
					"Narrator: You can now exit the house.");
			
			hero.setSword(true);
			doorOpen = true;
			canSearchStorage = false;
			
			storage();
			
		}

		public static void lawn() {
			Object[] options = {"Enter House", "Right"};
			choice = JOptionPane.showOptionDialog(
					frame, 
					ListLocations.locations.get(4).getDescription(),
					ListLocations.locations.get(4).getName(),
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, 
					options, 
					options);
			
				switch(choice)
				{
				case 0:
						{
							entrance3();
							break;
						}
				case 1:
						{
							if(lookingForWater) {
								well2();
							}else {
								well();
							}
							break;
						}
				}		
		}
		
		public static void lawn2() {
			Object[] options = {"Enter House", "Right", "Collect Apple"};
			choice = JOptionPane.showOptionDialog(
					frame, 
					ListLocations.locations.get(4).getDescription(),
					ListLocations.locations.get(4).getName(),
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, 
					options, 
					options);
			
				switch(choice)
				{
				case 0:
						{
							entrance3();
							break;
						}
				case 1:
						{
							if(lookingForWater) {
								well2();
							}else {
								well();
							}
							break;
						}
				case 2:
						{
							collectApple();
							break;
						}
				}		
		}
		
		public static void lawn3() {
			Object[] options = {"Enter House", "Right", "Feed Chickens"};
			choice = JOptionPane.showOptionDialog(
					frame, 
					ListLocations.locations.get(4).getDescription(),
					ListLocations.locations.get(4).getName(),
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, 
					options, 
					options);
			
				switch(choice)
				{
				case 0:
						{
							entrance3();
							break;
						}
				case 1:
						{
							if(lookingForWater) {
								well2();
							}else {
								well();
							};
							break;
						}
				case 2:
						{
							feedChickens();
							break;
						}
				}		
		}
		
		public static void well() {
			Object[] options = {"Left", "Right"};
			choice = JOptionPane.showOptionDialog(
					frame, 
					ListLocations.locations.get(5).getDescription(),
					ListLocations.locations.get(5).getName(),
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, 
					options, 
					options);
			
				switch(choice)
				{
				case 0:
						{
							lawn();
							break;
						}
				case 1:
						{
							blacksmithshop();
							break;
						}
				}		
		}
		
		public static void well2() {
			Object[] options = {"Left", "Right", "Fill Bucket"};
			choice = JOptionPane.showOptionDialog(
					frame, 
					ListLocations.locations.get(5).getDescription(),
					ListLocations.locations.get(5).getName(),
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, 
					options, 
					options);
			
				switch(choice)
				{
				case 0:
						{
							lawn();
							break;
						}
				case 1:
						{
							blacksmithshop();
							break;
						}
				case 2: 
						{
							fillBucket();
							break;
						}
				}		
		}
		
		public static void fillBucket() {
			JOptionPane.showMessageDialog(
					frame,
					"Narrator: You decide to give the well a go. You tie the bucket to the rope and toss it in.");
			JOptionPane.showMessageDialog(
					frame,
					"Narrator: After a few cranks the bucket comes up filled with water.");
			JOptionPane.showMessageDialog(
					frame,
					" + Bucket of Water");
			hasWater = true;	
			lookingForWater = false;
			well();
		}
		
		public static void blacksmithshop() {
			Object[] options = {"Left", "Right", "Talk to Barry"};
			choice = JOptionPane.showOptionDialog(
					frame, 
					ListLocations.locations.get(6).getDescription(),
					ListLocations.locations.get(6).getName(),
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, 
					options, 
					options);
			
				switch(choice)
				{
				case 0:
						{
							if(lookingForWater) {
								well2();
							}else {
								well();
							}
							break;
						}
				case 1:
						{
							caveEntrance();
							break;
						}
				case 2:
						{
							if(lookingForWater) {
								barry2();
							}else if (hasWater){
								barry3();
							}else if (firstBarry){
								barry2();
							}else {
								barry();
							}
						}
				}
		}
		
		public static void barry() {
			ImageIcon icon = new ImageIcon(("barry.PNG"));
			JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(
					frame,
					"How can I help?",
					"Barry",
					JOptionPane.QUESTION_MESSAGE,
					icon);
			Object[] options = {"Leave Barry", "What do you sell?", "Who are you?", "Can you tell me a joke?"};
			choice2 = (String)JOptionPane.showInputDialog(
					frame, 
					ListLocations.locations.get(6).getDescription(),
					ListLocations.locations.get(6).getName(),
					JOptionPane.QUESTION_MESSAGE,
					null, 
					options, 
					null);
			
				switch(choice2)
				{
				case "Leave Barry":
						{
							blacksmithshop();
							break;
						}
				case "What do you sell?":
						{
					JOptionPane.showMessageDialog(
							frame,
							"Barry: I sell weapons, tools, armour, anything to do with metal. I’ll also fix things that require metal working.");
							barry();		
							break;
						}
				case "Who are you?":
						{
					JOptionPane.showMessageDialog(
							frame,
							"Barry: I’m Barry the Blacksmith. We are neighbors- I brought you cookies when you first moved in. We haven’t talked since. Kinda rude.");
							barry();
							break;
						}
				case "Can you tell me a joke?":
						{
							int randomizer = (int)(Math.random() * 6)+1;
							
							if(randomizer == 1) {
								JOptionPane.showMessageDialog(
										frame,		
								"Barry: What did the ocean say to the beach? Nothing, it just waved.");
								barry();
							}else if(randomizer == 2) {
								JOptionPane.showMessageDialog(
										frame,		
								"Barry: What's the best thing about Switzerland? I don't know, but the flag is a big plus.");
								barry();
							}else if (randomizer == 3) {
								JOptionPane.showMessageDialog(
										frame,		
								"Barry: What do you call a poor Santa Claus? St. Nickel-less.");
								barry();
							}else if (randomizer == 4) {
								JOptionPane.showMessageDialog(
										frame,		
								"Barry: I don't trust those trees. They seem kind of shady.");
								barry();
							}else if (randomizer == 5) {
								JOptionPane.showMessageDialog(
										frame,		
								"Barry: Did you hear the rumor about butter? Well, I'm not going to spread it!");
								barry();
							}else if(randomizer == 6) {
								JOptionPane.showMessageDialog(
										frame,		
								"Barry: How does a taco say grace? Lettuce pray.");
								barry();
							}
							
						}
				}
		}
		
		public static void barry2() {
			ImageIcon icon = new ImageIcon(("barry.PNG"));
			JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(
					frame,
					"How can I help?",
					"Barry",
					JOptionPane.QUESTION_MESSAGE,
					icon);
			Object[] options = {"Leave Barry", "What do you sell?", "Who are you?", "Can you tell me a joke?", "Can you sharpen this sword?"};
			choice2 = (String)JOptionPane.showInputDialog(
					frame, 
					ListLocations.locations.get(6).getDescription(),
					ListLocations.locations.get(6).getName(),
					JOptionPane.QUESTION_MESSAGE,
					null, 
					options, 
					null);
			
				switch(choice2)
				{
				case "Leave Barry":
						{
							blacksmithshop();
							break;
						}
				case "What do you sell?":
						{
					JOptionPane.showMessageDialog(
							frame,
							"Barry: I sell weapons, tools, armour, anything to do with metal. I’ll also fix things that require metal working.");
							barry2();		
							break;
						}
				case "Who are you?":
						{
					JOptionPane.showMessageDialog(
							frame,
							"Barry: I’m Barry the Blacksmith. We are neighbors- I brought you cookies when you first moved in. We haven’t talked since. Kinda rude.");
							barry2();
							break;
						}
				case "Can you tell me a joke?":
						{
							int randomizer = (int)(Math.random() * 6)+1;
							
							if(randomizer == 1) {
								JOptionPane.showMessageDialog(
										frame,		
								"Barry: What did the ocean say to the beach? Nothing, it just waved.");
								barry2();
							}else if(randomizer == 2) {
								JOptionPane.showMessageDialog(
										frame,		
								"Barry: What's the best thing about Switzerland? I don't know, but the flag is a big plus.");
								barry2();
							}else if (randomizer == 3) {
								JOptionPane.showMessageDialog(
										frame,		
								"Barry: What do you call a poor Santa Claus? St. Nickel-less.");
								barry2();
							}else if (randomizer == 4) {
								JOptionPane.showMessageDialog(
										frame,		
								"Barry: I don't trust those trees. They seem kind of shady.");
								barry2();
							}else if (randomizer == 5) {
								JOptionPane.showMessageDialog(
										frame,		
								"Barry: Did you hear the rumor about butter? Well, I'm not going to spread it!");
								barry2();
							}else if(randomizer == 6) {
								JOptionPane.showMessageDialog(
										frame,		
								"Barry: How does a taco say grace? Lettuce pray.");
								barry2();
							}
							
						}
				case "Can you sharpen this sword?":
						{
							JOptionPane.showMessageDialog(
									frame,
									"Barry: I don't do anything for free here buddy. Well, except the jokes.");
							JOptionPane.showMessageDialog(
									frame,
									hero.getName() + ": How should I pay you? I'm broke.");
							JOptionPane.showMessageDialog(
									frame,
									"Barry: I need some more water to work my metal. If you bring me some water I’ll sharpen your sword. Here’s a bucket.");
							JOptionPane.showMessageDialog(
									frame,
									"+ Empty Bucket");
							
							lookingForWater = true;
							
							JOptionPane.showMessageDialog(
									frame,
									"Narrator: If you were paying attention to what I’ve been saying, finding water shouldn’t be hard. If not, splash water on the computer, maybe we’ll get some.");
							
							barry2();
						}
				}
		}
		
		public static void barry3() {
			ImageIcon icon = new ImageIcon(("barry.PNG"));
			JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(
					frame,
					"How can I help?",
					"Barry",
					JOptionPane.QUESTION_MESSAGE,
					icon);
			Object[] options = {"Leave Barry", "What do you sell?", "Who are you?", "Can you tell me a joke?", "I have water!"};
			choice2 = (String)JOptionPane.showInputDialog(
					frame, 
					ListLocations.locations.get(6).getDescription(),
					ListLocations.locations.get(6).getName(),
					JOptionPane.QUESTION_MESSAGE,
					null, 
					options, 
					null);
			
				switch(choice2)
				{
				case "Leave Barry":
						{
							blacksmithshop();
							break;
						}
				case "What do you sell?":
						{
					JOptionPane.showMessageDialog(
							frame,
							"Barry: I sell weapons, tools, armour, anything to do with metal. I’ll also fix things that require metal working.");
							barry3();		
							break;
						}
				case "Who are you?":
						{
					JOptionPane.showMessageDialog(
							frame,
							"Barry: I’m Barry the Blacksmith. We are neighbors- I brought you cookies when you first moved in. We haven’t talked since. Kinda rude.");
							barry3();
							break;
						}
				case "Can you tell me a joke?":
						{
							int randomizer = (int)(Math.random() * 6)+1;
							
							if(randomizer == 1) {
								JOptionPane.showMessageDialog(
										frame,		
								"Barry: What did the ocean say to the beach? Nothing, it just waved.");
								barry3();
							}else if(randomizer == 2) {
								JOptionPane.showMessageDialog(
										frame,		
								"Barry: What's the best thing about Switzerland? I don't know, but the flag is a big plus.");
								barry3();
							}else if (randomizer == 3) {
								JOptionPane.showMessageDialog(
										frame,		
								"Barry: What do you call a poor Santa Claus? St. Nickel-less.");
								barry3();
							}else if (randomizer == 4) {
								JOptionPane.showMessageDialog(
										frame,		
								"Barry: I don't trust those trees. They seem kind of shady.");
								barry3();
							}else if (randomizer == 5) {
								JOptionPane.showMessageDialog(
										frame,		
								"Barry: Did you hear the rumor about butter? Well, I'm not going to spread it!");
								barry3();
							}else if(randomizer == 6) {
								JOptionPane.showMessageDialog(
										frame,		
								"Barry: How does a taco say grace? Lettuce pray.");
								barry3();
							}
							
						}
				case "I have water!":
						{
							firstBarry = false;
							hasWater = false;
							
							JOptionPane.showMessageDialog(
									frame,	
									"Barry: Thanks! You're a big help.");
							JOptionPane.showMessageDialog(
									frame,	
									hero.getName() + ": No problem. And the sword?");
							JOptionPane.showMessageDialog(
									frame,	
									"Barry: Oh yeah, here you go.");
							JOptionPane.showMessageDialog(
									frame,	
									"+ Sharpened Sword");
							JOptionPane.showMessageDialog(
									frame,	
									"Barry: Use it well.");
							JOptionPane.showMessageDialog(
									frame,
									"Narrator: Great job! I’m sure it will be very useful in the near future.");
							JOptionPane.showMessageDialog(
									frame,
									hero.getName() + ": How do I use it?");
							JOptionPane.showMessageDialog(
									frame,
									"Narrator: Good question.");
							JOptionPane.showMessageDialog(
									frame,
									hero.getName() + ": Don't tell me you don't know about this either.");
							JOptionPane.showMessageDialog(
									frame,
									"Narrator: You'll see how it works. Head right to the cave so we can practice.");
							
							completeBarryQuest = true;
							barry();
						}
				}
		}
		
		public static void caveEntrance() {
			Object[] options = {"Left", "Enter Cave"};
			choice = JOptionPane.showOptionDialog(
					frame, 
					ListLocations.locations.get(8).getDescription(),
					ListLocations.locations.get(8).getName(),
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, 
					options, 
					options);
			
				switch(choice)
				{
				case 0:
						{
							blacksmithshop();
							break;
						}
				case 1:
						{
							check();
							break;
						}
				}
		}
		
		public static void check() {
			Object[] options = {"No!", "Of course!"};
			choice = JOptionPane.showOptionDialog(
					frame, 
					"Narrator: You lean forward and look into the black depths of the cave. Are you sure you want to enter? There can’t be anything good in there.",
					"Enter Cave?",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, 
					options, 
					options);
			
				switch(choice)
				{
				case 0:
						{
							caveEntrance();
							break;
						}
				case 1:
						{
							if(completeBarryQuest == false) {
								JOptionPane.showMessageDialog(
										frame,
										"Narrator: You must be crazy.");
								JOptionPane.showMessageDialog(
										frame,
										hero.getName() + ": What? I like exploring!");
								JOptionPane.showMessageDialog(
										frame,
										"Narrator: With that sword? I don't think so.");
								JOptionPane.showMessageDialog(
										frame,
										hero.getName() + ": Just let me go.");
								JOptionPane.showMessageDialog(
										frame,
										"Narrator: When you die, don't blame me!");
							}
							cave();
							break;
						}
				}
		}
		
		public static void cave() {
			JOptionPane.showMessageDialog(
					frame,
					"Narrator: You enter the huge cavernous cave. Hidden in the darkness, rock formations droop from the ceilings like icicles, emerge from the floor like mushrooms, and cover the sides like sheets of a waterfall.");
			JOptionPane.showMessageDialog(
					frame,
					"Narrator: A number strange blob-like creatures is huddled in the corner. One sees you, opening its mouth to reveal sharp teeth.");
			
			firstFightCONVO();
			
			Object[] options = {"Exit Cave", "Fight Them", "Go Deeper"};
			choice = JOptionPane.showOptionDialog(
					frame, 
					ListLocations.locations.get(9).getDescription(),
					ListLocations.locations.get(9).getName(),
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, 
					options, 
					options);
			
				switch(choice)
				{
				case 0:
						{
							caveEntrance();
							break;
						}
				case 1:
						{
							if(completeBarryQuest == false) {
								JOptionPane.showMessageDialog(
										frame,
										"Narrator: You stare it to the jaws of the monster, and suddenly don't feel so confident.");
								JOptionPane.showMessageDialog(
										frame,
										"Narrator: You turn and run out of the cave, and don't stop until you REACH BARRY.");
								blacksmithshop();
							}
							battleEntrance();
							break;
						}
				case 2:
						{
							if(firstBattle) {
								JOptionPane.showMessageDialog(
										frame,
										"Narrator: You're not ready yet.");
								cave();
							}
							deeperCave();
						}
				}				
			
			
		}
		
		static public void firstFightCONVO() {
			if(firstFightConvo) {
				if(firstBattle) {
					JOptionPane.showMessageDialog(
							frame,
							hero.getName() + ": Whoa what is that?!");
					JOptionPane.showMessageDialog(
							frame,
							"Narrator: It's a Terror!");
					JOptionPane.showMessageDialog(
							frame,
							hero.getName() + ": It doesn't look too terrible...");
					JOptionPane.showMessageDialog(
							frame,
							"Narrator: From here, yes, but these little rascals are pretty dangerous if you aren't prepared.");
					JOptionPane.showMessageDialog(
							frame,		
							hero.getName() + ": I'm going to poke one.");
					JOptionPane.showMessageDialog(
							frame,
							"Narrator: Quit it, you’re gonna anger one! I’m the narrator, I make the rules. If you keep bothering me I’m going to write you something to break your leg.");						
					firstFightConvo = false;
				}
			}
		}
		
		static public void battleEntrance() {
			ImageIcon icon = new ImageIcon(("monster2.jpg"));
			JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(
					frame,
					"You have no choice but to fight.",
					"The Monster Approaches",
					JOptionPane.QUESTION_MESSAGE,
					icon);
			
			
			if(firstBattle) {
				JOptionPane.showMessageDialog(
						frame,
						"Narrator: The fight begins. You are level " + hero.getLevel() + ", you start with " + hero.getHealth() + " hearts. The Terror is level " + ListMonsters.monsters.get(0).getLevel() + " , it starts with " + ListMonsters.monsters.get(0).getHealth() +" hearts.");
				directions();
				battle();		
			}
			
			battle();
			
		}
		
		static public void battle() {
			JOptionPane.showMessageDialog(
					frame,
					hero.getName() + ": " + hero.getHealth() + "          " + ListMonsters.monsters.get(0).getName() + ": " + ListMonsters.monsters.get(0).getHealth());
			
			Object[] options = {"Quick Attack", "Heavy Attack", "Block", "Health Boost"};
			choice = JOptionPane.showOptionDialog(
					frame, 
					"Narrator: What do you do?",
					"Battle",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, 
					options, 
					options);
			
			//monsterMove = 1;
			System.out.println(monsterMove);
			System.out.println(choice);
			monsterMove = (int)(Math.random() *4)+1;
			
				switch(choice)
				{
				case 0:
						{
							if(monsterMove == 1) {
								JOptionPane.showMessageDialog(
										frame,
										hero.getName() + ": " + ListBattle.battleMoves.get(0).getPlayerMove() + "          " + ListMonsters.monsters.get(0).getName() + ": " + ListBattle.battleMoves.get(0).getNpcMove());
								JOptionPane.showMessageDialog(
										frame,
										"You " + ListBattle.battleMoves.get(0).getResult());
								
								hero.setHealth(hero.getHealth() - ListBattle.battleMoves.get(0).getNpcDamage());
								ListMonsters.monsters.get(0).setHealth(ListMonsters.monsters.get(0).getHealth() - ListBattle.battleMoves.get(0).getPlayerDamage());
								
								checkDeath();
								
							}else if(monsterMove == 2) {
								JOptionPane.showMessageDialog(
										frame,
										hero.getName() + ": " + ListBattle.battleMoves.get(4).getPlayerMove() + "          " + ListMonsters.monsters.get(0).getName() + ": " + ListBattle.battleMoves.get(4).getNpcMove());
								JOptionPane.showMessageDialog(
										frame,
										"You " + ListBattle.battleMoves.get(4).getResult());
								
								hero.setHealth(hero.getHealth() - ListBattle.battleMoves.get(4).getNpcDamage());
								ListMonsters.monsters.get(0).setHealth(ListMonsters.monsters.get(0).getHealth() - ListBattle.battleMoves.get(4).getPlayerDamage());
								
								checkDeath();
								
							}else if(monsterMove == 3) {
								JOptionPane.showMessageDialog(
										frame,
										hero.getName() + ": " + ListBattle.battleMoves.get(8).getPlayerMove() + "          " + ListMonsters.monsters.get(0).getName() + ": " + ListBattle.battleMoves.get(8).getNpcMove());
								JOptionPane.showMessageDialog(
										frame,
										"You " + ListBattle.battleMoves.get(8).getResult());
								
								hero.setHealth(hero.getHealth() - ListBattle.battleMoves.get(8).getNpcDamage());
								ListMonsters.monsters.get(0).setHealth(ListMonsters.monsters.get(0).getHealth() - ListBattle.battleMoves.get(8).getPlayerDamage());
								
								checkDeath();
								
							}else if(monsterMove == 4) {
								JOptionPane.showMessageDialog(
										frame,
										hero.getName() + ": " + ListBattle.battleMoves.get(12).getPlayerMove() + "          " + ListMonsters.monsters.get(0).getName() + ": " + ListBattle.battleMoves.get(12).getNpcMove());
								JOptionPane.showMessageDialog(
										frame,
										"You " + ListBattle.battleMoves.get(12).getResult());
								
								hero.setHealth(hero.getHealth() - ListBattle.battleMoves.get(12).getNpcDamage());
								ListMonsters.monsters.get(0).setHealth(ListMonsters.monsters.get(0).getHealth() - ListBattle.battleMoves.get(12).getPlayerDamage());
								
								//no health change, tied
								
								checkDeath();
								
							}
							
							break;
						}
				case 1:
						{
							if(monsterMove == 1) {
								JOptionPane.showMessageDialog(
										frame,
										hero.getName() + ": " + ListBattle.battleMoves.get(1).getPlayerMove() + "          " + ListMonsters.monsters.get(0).getName() + ": " + ListBattle.battleMoves.get(1).getNpcMove());
								JOptionPane.showMessageDialog(
										frame,
										"You " + ListBattle.battleMoves.get(1).getResult());
								
								hero.setHealth(hero.getHealth() - ListBattle.battleMoves.get(1).getNpcDamage());
								ListMonsters.monsters.get(0).setHealth(ListMonsters.monsters.get(0).getHealth() - ListBattle.battleMoves.get(1).getPlayerDamage());
								
								checkDeath();
								
							}else if(monsterMove == 2) {
								JOptionPane.showMessageDialog(
										frame,
										hero.getName() + ": " + ListBattle.battleMoves.get(5).getPlayerMove() + "          " + ListMonsters.monsters.get(0).getName() + ": " + ListBattle.battleMoves.get(5).getNpcMove());
								JOptionPane.showMessageDialog(
										frame,
										"You " + ListBattle.battleMoves.get(5).getResult());
								
								hero.setHealth(hero.getHealth() - ListBattle.battleMoves.get(5).getNpcDamage());
								ListMonsters.monsters.get(0).setHealth(ListMonsters.monsters.get(0).getHealth() - ListBattle.battleMoves.get(5).getPlayerDamage());
								
								checkDeath();
								
							}else if(monsterMove == 3) {
								JOptionPane.showMessageDialog(
										frame,
										hero.getName() + ": " + ListBattle.battleMoves.get(9).getPlayerMove() + "          " + ListMonsters.monsters.get(0).getName() + ": " + ListBattle.battleMoves.get(9).getNpcMove());
								JOptionPane.showMessageDialog(
										frame,
										"You " + ListBattle.battleMoves.get(9).getResult());
								
								hero.setHealth(hero.getHealth() - ListBattle.battleMoves.get(9).getNpcDamage());
								ListMonsters.monsters.get(0).setHealth(ListMonsters.monsters.get(0).getHealth() - ListBattle.battleMoves.get(9).getPlayerDamage());
								
								checkDeath();
								
							}else if(monsterMove == 4) {
								JOptionPane.showMessageDialog(
										frame,
										hero.getName() + ": " + ListBattle.battleMoves.get(13).getPlayerMove() + "          " + ListMonsters.monsters.get(0).getName() + ": " + ListBattle.battleMoves.get(13).getNpcMove());
								JOptionPane.showMessageDialog(
										frame,
										"You " + ListBattle.battleMoves.get(13).getResult());
								
								hero.setHealth(hero.getHealth() - ListBattle.battleMoves.get(13).getNpcDamage());
								ListMonsters.monsters.get(0).setHealth(ListMonsters.monsters.get(0).getHealth() - ListBattle.battleMoves.get(13).getPlayerDamage());
								
								//no health change, damage taken from heavy attack
								
								checkDeath();
								
							}
							
							break;
						}
				case 2:
						{
							if(monsterMove == 1) {
								JOptionPane.showMessageDialog(
										frame,
										hero.getName() + ": " + ListBattle.battleMoves.get(2).getPlayerMove() + "          " + ListMonsters.monsters.get(0).getName() + ": " + ListBattle.battleMoves.get(2).getNpcMove());
								JOptionPane.showMessageDialog(
										frame,
										"You " + ListBattle.battleMoves.get(2).getResult());
								
								hero.setHealth(hero.getHealth() - ListBattle.battleMoves.get(2).getNpcDamage());
								ListMonsters.monsters.get(0).setHealth(ListMonsters.monsters.get(0).getHealth() - ListBattle.battleMoves.get(2).getPlayerDamage());
								
								checkDeath();
								
							}else if(monsterMove == 2) {
								JOptionPane.showMessageDialog(
										frame,
										hero.getName() + ": " + ListBattle.battleMoves.get(6).getPlayerMove() + "          " + ListMonsters.monsters.get(0).getName() + ": " + ListBattle.battleMoves.get(6).getNpcMove());
								JOptionPane.showMessageDialog(
										frame,
										"You " + ListBattle.battleMoves.get(6).getResult());
								
								hero.setHealth(hero.getHealth() - ListBattle.battleMoves.get(6).getNpcDamage());
								ListMonsters.monsters.get(0).setHealth(ListMonsters.monsters.get(0).getHealth() - ListBattle.battleMoves.get(6).getPlayerDamage());
								
								checkDeath();
								
							}else if(monsterMove == 3) {
								JOptionPane.showMessageDialog(
										frame,
										hero.getName() + ": " + ListBattle.battleMoves.get(10).getPlayerMove() + "          " + ListMonsters.monsters.get(0).getName() + ": " + ListBattle.battleMoves.get(10).getNpcMove());
								JOptionPane.showMessageDialog(
										frame,
										"You " + ListBattle.battleMoves.get(10).getResult());
								
								hero.setHealth(hero.getHealth() - ListBattle.battleMoves.get(10).getNpcDamage());
								ListMonsters.monsters.get(0).setHealth(ListMonsters.monsters.get(0).getHealth() - ListBattle.battleMoves.get(10).getPlayerDamage());
								
								checkDeath();
								
							}else if(monsterMove == 4) {
								JOptionPane.showMessageDialog(
										frame,
										hero.getName() + ": " + ListBattle.battleMoves.get(14).getPlayerMove() + "          " + ListMonsters.monsters.get(0).getName() + ": " + ListBattle.battleMoves.get(14).getNpcMove());
								JOptionPane.showMessageDialog(
										frame,
										"You " + ListBattle.battleMoves.get(14).getResult());
								
								hero.setHealth(hero.getHealth() - ListBattle.battleMoves.get(14).getNpcDamage());
								ListMonsters.monsters.get(0).setHealth(ListMonsters.monsters.get(0).getHealth() - ListBattle.battleMoves.get(14).getPlayerDamage());
								
								ListMonsters.monsters.get(0).setHealth(ListMonsters.monsters.get(0).getHealth() + 1);
								
								//health change other was block
								
								checkDeath();
								
							}
							
							break;
						}
				case 3:
						{
							if(monsterMove == 1) {
								JOptionPane.showMessageDialog(
										frame,
										hero.getName() + ": " + ListBattle.battleMoves.get(3).getPlayerMove() + "          " + ListMonsters.monsters.get(0).getName() + ": " + ListBattle.battleMoves.get(3).getNpcMove());
								JOptionPane.showMessageDialog(
										frame,
										"You " + ListBattle.battleMoves.get(3).getResult());
								
								hero.setHealth(hero.getHealth() - ListBattle.battleMoves.get(3).getNpcDamage());
								ListMonsters.monsters.get(0).setHealth(ListMonsters.monsters.get(0).getHealth() - ListBattle.battleMoves.get(3).getPlayerDamage());
								
								//no change, quick denied
								
								checkDeath();
								
							}else if(monsterMove == 2) {
								JOptionPane.showMessageDialog(
										frame,
										hero.getName() + ": " + ListBattle.battleMoves.get(7).getPlayerMove() + "          " + ListMonsters.monsters.get(0).getName() + ": " + ListBattle.battleMoves.get(7).getNpcMove());
								JOptionPane.showMessageDialog(
										frame,
										"You " + ListBattle.battleMoves.get(7).getResult());
								
								hero.setHealth(hero.getHealth() - ListBattle.battleMoves.get(7).getNpcDamage());
								ListMonsters.monsters.get(0).setHealth(ListMonsters.monsters.get(0).getHealth() - ListBattle.battleMoves.get(7).getPlayerDamage());
								
								//damage taken from Heavy
								
								checkDeath();
								
							}else if(monsterMove == 3) {
								JOptionPane.showMessageDialog(
										frame,
										hero.getName() + ": " + ListBattle.battleMoves.get(11).getPlayerMove() + "          " + ListMonsters.monsters.get(0).getName() + ": " + ListBattle.battleMoves.get(11).getNpcMove());
								JOptionPane.showMessageDialog(
										frame,
										"You " + ListBattle.battleMoves.get(11).getResult());
								
								hero.setHealth(hero.getHealth() - ListBattle.battleMoves.get(11).getNpcDamage());
								ListMonsters.monsters.get(0).setHealth(ListMonsters.monsters.get(0).getHealth() - ListBattle.battleMoves.get(11).getPlayerDamage());
								
								hero.setHealth((hero.getHealth() + 1));
								
								//health change other block
								
								checkDeath();
								
							}else if(monsterMove == 4) {
								JOptionPane.showMessageDialog(
										frame,
										hero.getName() + ": " + ListBattle.battleMoves.get(15).getPlayerMove() + "          " + ListMonsters.monsters.get(0).getName() + ": " + ListBattle.battleMoves.get(15).getNpcMove());
								JOptionPane.showMessageDialog(
										frame,
										"You " + ListBattle.battleMoves.get(15).getResult());
								
								hero.setHealth(hero.getHealth() - ListBattle.battleMoves.get(15).getNpcDamage());
								ListMonsters.monsters.get(0).setHealth(ListMonsters.monsters.get(0).getHealth() - ListBattle.battleMoves.get(15).getPlayerDamage());
								
								hero.setHealth((hero.getHealth() + 1));
								
								ListMonsters.monsters.get(0).setHealth(ListMonsters.monsters.get(0).getHealth() + 1);
								
								checkDeath();
								
							}
							
						}
				}
			
		}

		static public void checkDeath() {
			if(hero.getHealth() <= 0) {
				JOptionPane.showMessageDialog(
						frame,
						"Narrator: Your health is 0, you loose.");
				JOptionPane.showMessageDialog(
						frame,
						"Narrator: You stumble out of the cave, and wait to heal.");
				hero.setHealth((hero.getHealth() + 5));
				
				ListMonsters.monsters.get(0).setHealth(ListMonsters.monsters.get(0).getHealth() + 5);
				
				caveEntrance();
			}else if (ListMonsters.monsters.get(0).getHealth() <= 0) {
				JOptionPane.showMessageDialog(
						frame,
						"Narrator: The Terror's health is 0, you win!");
				JOptionPane.showMessageDialog(
						frame,
						"Narrator: You step out of the cave, feeling accomplished.");
				hero.setHealth((hero.getHealth() + 5));
				
				ListMonsters.monsters.get(0).setHealth(ListMonsters.monsters.get(0).getHealth() + 5);
				
				caveEntrance();
			}else {
				battle();
			}
		}
		
		static public void directions() {
			JOptionPane.showMessageDialog(
					frame,
					"Narrator: Fighting works like ‘Rock, Paper, Scissors’.");
			JOptionPane.showMessageDialog(
					frame,
					"Quick Attack: -1 Heart Damage, no damage when countered with a Heavy Attack");
			JOptionPane.showMessageDialog(
					frame,
					"Heavy Attack: -2 Heart Damage, no damage when countered with another Heavy Attack or a Block");
			JOptionPane.showMessageDialog(
					frame,
					"Block: 0 Damage Taken, damage when countered with Quick Attack");
			JOptionPane.showMessageDialog(
					frame,
					"Health Boost: +1 Hearts Given, no health boost when countered with Quick or Heavy Attack");
					
		}
		
		static public void deeperCave() {
			
		}
		
	}
