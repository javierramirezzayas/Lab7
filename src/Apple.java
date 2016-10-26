// Added for part 6

public class Apple implements GameThing, Edible{

	public String getName() {
		return "A green apple";
	}

	public String getDescription() {
		return "It's a watermelon in disguise";
	}

	@Override
	public void eat() {
		AdventureEpsilon.theRoom.removeThing(AdventureEpsilon.theApple);
		System.out.println("Doesn't taste anything like an apple"); 
	}
	

}
