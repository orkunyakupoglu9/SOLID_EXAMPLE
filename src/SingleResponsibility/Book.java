package SingleResponsibility;

public class Book {
	
	
	private String name;
	
	private String author;
	
	private String text;
	
	public Book(String name, String author, String text) {
		super();
		this.name = name;
		this.author = author;
		this.text = text;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	//methods that directly with books properties
	
	public boolean isWordInBook(String word) {
		
		return text.contains(word);
		
		
	}
	
	
	 /* 
	  * 
	  * not add here because it is printing book doing another thing not related with book create new class
	  * 
	  * 
	  void printTextToConsole(){
	        // our code for formatting and printing the text
	    }
	
	 */
	
	
	

}
