package random;
import java.util.Scanner;

class MyLibrary{	
	//int neededBooks;
	int addedBooks=0;
	int issuedBooks=0;
	int returnedBooks=0;
	String availableBooks[];
	
	
	//Constructor
	MyLibrary(){
		String availableBooks[] = new String[10];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of books you want to issue: ");
		int booksNeeded = sc.nextInt();
		String issuedBooks[] = new String[booksNeeded];
		
	}
	
	
	//Method to add a book
	public String addBook() {
		System.out.println("Enter the name of the book you want to add in the cart: ");
		Scanner sc = new Scanner(System.in);
		String bookName = sc.nextLine();
		addedBooks++;
		System.out.println("Number of books in the cart are: "+addedBooks);
		return bookName;
	}
	
	
	//Method to remove book from the cart
	public void removeBooks() {
		if(addedBooks>0) {
			addedBooks--;
		}
		System.out.println("Books remaining in the cart: "+addedBooks);
	}
	
	
	//Method to issue the book
	void issueBook() {
		this.issuedBooks = this.addedBooks;
		System.out.println("You have successfully issued "+issuedBooks+" books.");
	}
	
	
	//Method to return Book
	void returnBook() {
		if(issuedBooks>0) {
			System.out.println("You currently have "+issuedBooks+" issued books with you.");
			System.out.println("How many books you want to return?");
			Scanner sc = new Scanner(System.in);
			returnedBooks = sc.nextInt();
			if(returnedBooks<=issuedBooks) {
				issuedBooks -= returnedBooks;
				System.out.println("Books you own after returning: "+issuedBooks);
			}else {
				System.out.println("You have issued"+issuedBooks+" books but trying to return "+returnedBooks+" books.\n This is not possible.");
				returnedBooks=0;
			}
			
		}
		
	}
	
	
	//Method to show available books
	public void showAvailableBooks() {
		
	}
}



public class BooksLibrary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Our Library contains total 10 books");
		
		MyLibrary person1 = new MyLibrary();
		
		System.out.println("Choose among the following to select the action: ");
		System.out.println("Press 1 to show the available books.");
		System.out.println("Press 2 to add a book to the cart.");
		System.out.println("Press 3 to issue a book.");
		System.out.println("Press 4 to return a book.");
		
		int selectedAction = sc.nextInt();
		
		switch(selectedAction) {
		case 1:
			person1.showAvailableBooks();
			break;
		case 2:
			String bookAdded = person1.addBook();
			System.out.println("Book added in the cart is: "+bookAdded);
			String addAgain;
			do {
				System.out.println("Do you want to another book in the cart? Write yes or no.");
				addAgain = sc.nextLine();
				if(addAgain=="yes") {
					String bookAdded2 = person1.addBook();
					System.out.println("Book added in the cart is: "+bookAdded2);
				}else
					break;
			}while(addAgain=="yes");
			break;
		case 3:
			person1.issueBook();
			break;
		case 4:
			person1.returnBook();
			break;
		default:
			System.out.println("Sorry but your action don't matches with the options given to you.");
		}
		

	}

}
