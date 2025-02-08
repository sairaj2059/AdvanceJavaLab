import java.util.ArrayList;

public class main {
	public static void main(String[] args){
		Library lib = new Library();
		Student stud = new Student();
		ArrayList<Book> booksList = new ArrayList<>();
		
		booksList.add(
		new Book(01, "Parallel Computing", "Someone", true));
		
		booksList.add(new Book(02, "Discrete Mathematics", "Very famous person", true));
		
		
		lib.addBooks(booksList.get(0));
		lib.addBooks(booksList.get(1));
		
		Book burrowedBook = stud.studentBorrowBook(booksList.get(0));
		
		
		
		
	}
}
