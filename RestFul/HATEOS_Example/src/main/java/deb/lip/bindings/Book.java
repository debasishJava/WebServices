package deb.lip.bindings;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.RepresentationModel;


public class Book extends RepresentationModel<Book> {

	private String isbn;
	private String bookName;
	private Double bookPrice;
	private String author;
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", bookName=" + bookName + ", bookPrice=" + bookPrice + ", author=" + author
				+ "]";
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(Iterable<Link> initialLinks) {
		super(initialLinks);
		// TODO Auto-generated constructor stub
	}
	public Book(Link initialLink) {
		super(initialLink);
		// TODO Auto-generated constructor stub
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Book(String isbn, String bookName, Double bookPrice, String author) {
		super();
		this.isbn = isbn;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.author = author;
	}
	
	
}
