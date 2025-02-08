public class Book{
	private int bookId;
	private String title;
	private String author;
	private boolean isAvailable;
	
	public String getTitle(){
		return title;
	}	
	
	public boolean getIsAvailable(){
		return isAvailable;
	}
	
	public int getBookId(){
		return bookId;
	}
	
	public Book(int bookId,String title, String author, boolean isAvailable){
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.isAvailable = isAvailable;
	}
	
	public void displayBookInfo(){
		System.out.println("Title: " + title + "\nAuthor: " + author + "\nAvailability: ");
		if(isAvailable){
			System.out.println("Available\n");
		}
		else{
			System.out.println("Out of Stock");
		}
	}

	public void burrowBook(){
		System.out.println("Book Burrowed");
		isAvailable = false;
	}
	
	public void returnBook(){
		System.out.println("Book Returned");
		isAvailable = true;
	}	
	
}
