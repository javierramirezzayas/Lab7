//Main 

import java.util.Scanner;

public class AdventureEpsilon
{
	public static GameRoom theRoom = new GameRoom();
	public static Box theBox = new Box();
	public static Sign theSign = new Sign();
	public static Book theBook = new Book(); // Added for Part 1
	public static Apple theApple = new Apple(); // Added for Part 5
	public static void main(String[] args)
	{
		//Populate the room
		theRoom.addThing(theBox);
		theRoom.addThing(theSign);
		theRoom.addThing(theBook); // Added for Part 1
		theRoom.addThing(theApple); // Added for Part 5

		//Create additional useful objects
		Scanner keyboard = new Scanner(System.in); 

		//Display a greeting
		System.out.println("Welcome to Adventure Epsilon!");
		System.out.println();

		//Main loop
		boolean hasQuitGame = false;
		while (!hasQuitGame)
		{
			System.out.println();
			System.out.println();
			System.out.println();
			theRoom.listContents();
			System.out.println();
			System.out.println("What do you wish to do?");
			System.out.println("1. Examine something");
			System.out.println("2. Look into the box");
			System.out.println("3. Put something into the box");
			System.out.println("4. Pull out something out of the box");
			// Added for Part 1
			System.out.println("5. Read something");
			// Added for Part 1
			// Added for Part 3
			System.out.println("6. Open something");
			System.out.println("7. Close something");
			// Added for Part 3
			// Added for Part 7
			System.out.println("8. Eat something");
			// Added for Part 7
			System.out.println("99. Quit this game");
			System.out.print("Your choice? >>>");
			int mainMenuChoice = keyboard.nextInt();
			System.out.println();
			int thingChoice;
			switch (mainMenuChoice)
			{
			case 1:
				System.out.println("Which thing do you want to examine?");
				theRoom.listContents();
				System.out.print("Your choice? (Enter an unlisted number to go back to the main menu) >>>");
				thingChoice = keyboard.nextInt();
				System.out.println();
				if (thingChoice >= 1 && thingChoice <= theRoom.getThingCount())
				{
					GameThing thing = theRoom.getThingByIndex(thingChoice);
					System.out.println(thing.getDescription());
					System.out.println();
				}
				break;

			case 2:
				theBox.lookInto();
				System.out.println();
				break;

			case 3:
				System.out.println("Which thing do you want to put into the box?");
				theRoom.listContents();
				System.out.print("Your choice? (Enter an unlisted number to go back to the main menu) >>>");
				thingChoice = keyboard.nextInt();
				System.out.println();
				if (thingChoice >= 1 && thingChoice <= theRoom.getThingCount())
				{
					GameThing thing = theRoom.getThingByIndex(thingChoice);
					theBox.putIn(thing);
					System.out.println();
				}
				break;

			case 4:
				if (theBox.getThingCount() == 0)
				{
					System.out.println("The box is empty. Nothing can be pulled out of it.");
					System.out.println();
				}
				else
				{
					System.out.println("Which thing do you want to pull out of the box?");
					theBox.lookInto();
					System.out.print("Your choice? (Enter an unlisted number to go back to the main menu) >>>");
					thingChoice = keyboard.nextInt();
					System.out.println();
					if (thingChoice >= 1 && thingChoice <= theBox.getThingCount())
					{
						GameThing thing = theBox.getThingByIndex(thingChoice);
						theBox.pullOut(thing);
						System.out.println();
					}
				}
				break;

				//Added for Part 1
			case 5:
				System.out.println("Which thing do you want to read?");
				theRoom.listContents();
				System.out.print("Your choice? (Enter an unlisted number to go back to the main menu) >>>");
				thingChoice = keyboard.nextInt();
				System.out.println();
				if (thingChoice >= 1 && thingChoice <= theRoom.getThingCount())
				{
					GameThing thing = theRoom.getThingByIndex(thingChoice);
					if (thing instanceof Readable) //Checks to see if the chosen object (a game thing) implements the Readable interface.
					{
						Readable readableThing = (Readable)thing; // Read the thing as a Readable.
						readableThing.read();
					}
					else
					{
						System.out.println("That's not something you can read!");
					}
					System.out.println();
				}
				break;
				//Added for Part 1

				// Added for Part 3
			case 6:
				System.out.println("Which thing do you want to open?");
				theRoom.listContents();
				System.out.print("Your choice? (Enter an unlisted number to go back to the main menu) >>>");
				thingChoice = keyboard.nextInt();
				System.out.println();
				if (thingChoice >= 1 && thingChoice <= theRoom.getThingCount())
				{
					GameThing thing = theRoom.getThingByIndex(thingChoice);
					if (thing instanceof Openable) //Checks to see if the chosen object (a game thing) implements the Openable interface.
					{
						Openable openableThing = (Openable)thing; // Read the thing as a Openable.
						openableThing.open();
					}
					else
					{
						System.out.println("That's not something you can open!");
					}
					System.out.println();
				}
				break;

			case 7:
				System.out.println("Which thing do you want to read?");
				theRoom.listContents();
				System.out.print("Your choice? (Enter an unlisted number to go back to the main menu) >>>");
				thingChoice = keyboard.nextInt();
				System.out.println();
				if (thingChoice >= 1 && thingChoice <= theRoom.getThingCount())
				{
					GameThing thing = theRoom.getThingByIndex(thingChoice);
					if (thing instanceof Openable) //Checks to see if the chosen object (a game thing) implements the Openable interface.
					{
						Openable openableThing = (Openable)thing; // Read the thing as a Openable.
						openableThing.close();
					}
					else
					{
						System.out.println("That's not something you can open!");
					}
					System.out.println();
				}
				break;
				// Added for part 3
				
			// Added for part 7
			case 8:
				System.out.println("Which thing do you want to eat?");
				theRoom.listContents();
				System.out.print("Your choice? (Enter an unlisted number to go back to the main menu) >>>");
				thingChoice = keyboard.nextInt();
				System.out.println();
				if (thingChoice >= 1 && thingChoice <= theRoom.getThingCount())
				{
					GameThing thing = theRoom.getThingByIndex(thingChoice);
					if (thing instanceof Edible) //Checks to see if the chosen object (a game thing) implements the Edible interface.
					{
						Edible edibleThing = (Edible)thing; // Read the thing as a Edible.
						edibleThing.eat();
					}
					else
					{
						System.out.println("That's not something you can eat!");
					}
					System.out.println();
				}
				break;
				// Added for part 7

			case 99:
				hasQuitGame = true;
				System.out.println("Thank you for playing!");
				break;

			default:
				System.out.println("Please use one of the choices from the menu!");
				System.out.println();
				break;
			}// END switch
		}

		//The following line of code is used so that
		//this program runs on computers with Java 7
		//without a warning message from Eclipse.
		//Java 6 can use it, but does not need it.
		keyboard.close();


	}
}
