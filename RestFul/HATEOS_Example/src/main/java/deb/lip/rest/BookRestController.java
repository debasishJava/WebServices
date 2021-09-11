package deb.lip.rest;

import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import deb.lip.bindings.Book;

@RestController
public class BookRestController {

	@GetMapping(
			value="/book/{isbn}",
			produces = "application/json"
			)
	public Book getBook(@PathVariable("isbn") String isbn) {
		//creating book object
		Book book=new Book(isbn,"java",1500.0,"debalipsa");
		
		//creating hypermedia-HATEOS and adding to book response
		Link link=WebMvcLinkBuilder.linkTo(
				                       WebMvcLinkBuilder
				                       .methodOn(BookRestController.class)
				                       .getAllBooks()
				                       )
				                   .withRel("All-Books");
		
		//added the 
		book.add(link);
		
		return book;
	}
	
	@GetMapping(
			value = "/books",
			produces = "application/json"
			)
	public List<Book> getAllBooks(){
		List<Book> listBooks=List.of(
				                 new Book("A1001","dotNet",1545.0,"nelson"),
				                 new Book("A1002","GO",1745.0,"debu"),
				                 new Book("A1003","RabbitMQ",800.0,"lulu"),
				                 new Book("A1004","TDD",900.0,"babu")
				             );
		
		return listBooks;
	}
}
