import java.util.ArrayList;

public class Library{
	private ArrayList<Book> books;
	
	public Library(){
		books = new ArrayList<>();
	}
	public void addBooks(Book book){
		books.add(book);
	}

	public void removeBook(int id){
		for(Book book : books){
			if(book.getBookId() == id){
				books.remove(book);
				System.out.println("Book Removed Successfully");
				return;
			}
		}
		System.out.println("Book not found");
	}
	
	public void listAvailableBooks(){
		for(Book book: books){
			book.displayBookInfo();
		}
	}

	public void findBook(String title){
		for(Book book: books){
			if(book.getTitle()== title){
				System.out.println("Book found!\nBook Details:\n");
				book.displayBookInfo();
			}		
		}
	}
		
}
