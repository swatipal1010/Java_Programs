package arrays;

public class CreatingObject2 {

	public static void main(String[] args) {
	Book book1 = new Book();
	Book book2 = book1;
	book1.pages = 500;
	book1.title = "Learning Mathematics";
	book1.author = "Djisktra";
	
	book1 = null;
	System.out.println("No. of pages in book2: "+book1.pages);
	System.out.println("Title of the book2: "+book1.title);
	System.out.println("Author of the book: "+book1.author);
	}

}

	class Book{
		int pages;
		String title;
		String author;
		
	}