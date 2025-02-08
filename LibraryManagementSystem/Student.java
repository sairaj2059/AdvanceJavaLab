import java.util.ArrayList;

public class Student{
	private int studentId;
	private String name;
	private ArrayList<Book> burrowedBooks;
	
	public Book studentBorrowBook(Book book){
		book.burrowBook();
		return book;
	}

	public void returnBook(Book book){
		book.returnBook();
	}

	public void displayBurrowedBooks(){
		for(Book book: burrowedBooks){
			book.displayBookInfo();
		}
	}


}
