// Added for Part 1 

public class Book implements GameThing, Readable, Openable {
	
	boolean isOpen = false;  // false = the book is closed; true = book is open

	public String getName() {
		return "A dusty old book.";
	}

	public String getDescription() {
		if(!isOpen){
			System.out.println("The book seems to be closed.");
		}
		else{
			System.out.println("The book seems to be opened");
		}
		return "This book appears to be old and dusty. It's also quite heavy.";
	}
	
	// Added for part 1
	public void read(){
		if(!isOpen){
			System.out.println("The book is closed. It has a blurred title and a name that says Giancoli");
		}
		else{
			System.out.println("The book has words and doodles you can't even understand.");
		}
	}
	// Added for part 1
	
	
	// Added for part 2
	public void open(){
		if(isOpen){
			System.out.println("The book is already opened.");
		}
		else{
			System.out.println("As you open the book magical things start to happen and the room starts filling with light");
			this.isOpen = true;
		}
	}
	
	public void close(){
		if(!isOpen){
			System.out.println("The book is already closed. But you try closing it more.");
		}
		else{
			System.out.println("As you close the book everything starts getting dark");
		}
	}
	// Added for part 2

}
