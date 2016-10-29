public class Sign implements GameThing, Readable, Edible
{
	public String getName()
	{
		return "A wooden sign transformed into chocolate";
	}
	public String getDescription()
	{
		return "This is a small wooden chocolate sign. There seems to be some partially faded writing in it.";
	}
	
	//Added for Part 1
	public void read(){
		System.out.println("You can see the following message: \"Javier was here!\"");
	}
	//Added for Part 1
	
	// Added for part 8
	public void eat() {
		AdventureEpsilon.theRoom.removeThing(AdventureEpsilon.theSign);
		System.out.println("You eat the chocolate. Tastes like wood."); 
	}
	// Added for part 8
}
