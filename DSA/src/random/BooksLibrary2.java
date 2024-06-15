package random;
import java.util.Scanner;

class Library {
    int issuedBooksCount = 0;
    int returnedBooks = 0;
    String[] availableBooks;
    String[] issuedBooks;

    // Constructor
    Library() {
        availableBooks = new String[10];
        issuedBooks = new String[10];
        // Pre-fill some books for demonstration
        availableBooks[0] = "Book1";
        availableBooks[1] = "Book2";
        availableBooks[2] = "Book3";
        availableBooks[3] = "Book4";
        availableBooks[4] = "Book5";
        availableBooks[5] = "Book6";
        availableBooks[6] = "Book7";
        availableBooks[7] = "Book8";
        availableBooks[8] = "Book9";
        availableBooks[9] = "Book10";
    }

    
    // Method to add a book
    public void addBook() {
        System.out.println("Select a book from the available books to add to the cart:");
        showAvailableBooks();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the book you want to add to the cart: ");
        int bookNumber = sc.nextInt();
        
        if (bookNumber < 1 || bookNumber > availableBooks.length || availableBooks[bookNumber - 1] == null) {
            System.out.println("Invalid selection. Please select a book from the available list.");
            return;
        }

        for (int i = 0; i < issuedBooks.length; i++) {
            if (issuedBooks[i] == null) {						//If there is a space in the array to add a book
                issuedBooks[i] = availableBooks[bookNumber - 1];		//Add the selected book in the issuedBooks array
                availableBooks[bookNumber - 1] = null;					//Remove the book from the availableBooks array that has been added to issuedBooks array
                break;
            }
        }
        System.out.println("Book added to the cart.");
    }

    
    // Method to remove book from the cart
    public void removeBooks() {
        System.out.println("Select a book from the issued books to remove from the cart:");
        showIssuedBooks();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the book you want to remove from the cart: ");
        int bookNumber = sc.nextInt();
        
        if (bookNumber < 1 || bookNumber > issuedBooks.length || issuedBooks[bookNumber - 1] == null) {
            System.out.println("Invalid selection. Please select a book from the issued list.");
            return;
        }

        for (int i = 0; i < availableBooks.length; i++) {
            if (availableBooks[i] == null) {
                availableBooks[i] = issuedBooks[bookNumber - 1];
                issuedBooks[bookNumber - 1] = null;
                break;
            }
        }
        System.out.println("Book removed from the cart.");
    }

    
    // Method to issue the book
    void issueBook() {
        int count = 0;
        for (String book : issuedBooks) {
            if (book != null) {
                count++;
            }
        }
        issuedBooksCount = count;
        System.out.println("You have successfully issued " + issuedBooksCount + " books.");
    }
    

    // Method to return Book
    void returnBook() {
        if (issuedBooksCount > 0) {
            System.out.println("You currently have " + issuedBooksCount + " issued books with you.");
            showIssuedBooks();
            System.out.println("Enter the number of the book you want to return:");
            
            Scanner sc = new Scanner(System.in);
            int bookNumber = sc.nextInt();
            
            if (bookNumber < 1 || bookNumber > issuedBooks.length || issuedBooks[bookNumber - 1] == null) {
                System.out.println("Invalid selection. Please select a book from the issued list.");
                return;
            }
            
            for (int i = 0; i < availableBooks.length; i++) {
                if (availableBooks[i] == null) {
                    availableBooks[i] = issuedBooks[bookNumber - 1];
                    issuedBooks[bookNumber - 1] = null;
                    break;
                }
            }
            issuedBooksCount--;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("You have no books to return.");
        }
    }
    

    // Method to show available books
    public void showAvailableBooks() {
        System.out.println("Available books in the library:");
        for (int i = 0; i < availableBooks.length; i++) {
            if (availableBooks[i] != null) {
                System.out.println((i + 1) + ". " + availableBooks[i]);
            }
        }
    }
    

    // Method to show issued books
    public void showIssuedBooks() {
        System.out.println("Issued books:");
        for (int i = 0; i < issuedBooks.length; i++) {
            if (issuedBooks[i] != null) {
                System.out.println((i + 1) + ". " + issuedBooks[i]);
            }
        }
    }
}



public class BooksLibrary2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Our Library contains a total of 10 books");

        Library person1 = new Library();

        while (true) {
            System.out.println("Choose among the following to select the action: ");
            System.out.println("Press 1 to show the available books.");
            System.out.println("Press 2 to add a book to the cart.");
            System.out.println("Press 3 to issue a book.");
            System.out.println("Press 4 to return a book.");
            System.out.println("Press 5 to remove a book from the cart.");
            System.out.println("Press 6 to show issued books.");
            System.out.println("Press 7 to exit.");

            int selectedAction = sc.nextInt();
            sc.nextLine(); // Clear the newline character after nextInt()

            switch (selectedAction) {
                case 1:
                    person1.showAvailableBooks();
                    break;
                case 2:
                    person1.addBook();
                    break;
                case 3:
                    person1.issueBook();
                    break;
                case 4:
                    person1.returnBook();
                    break;
                case 5:
                    person1.removeBooks();
                    break;
                case 6:
                    person1.showIssuedBooks();
                    break;
                case 7:
                    System.out.println("Exiting the program.");
                    return; // Exit the program
                default:
                    System.out.println("Sorry but your action doesn't match any of the options given.");
            }
        }
    }
}
