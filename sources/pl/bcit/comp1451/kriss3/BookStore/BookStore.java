package pl.bcit.comp1451.kriss3.BookStore;

import java.util.HashMap;
import java.util.Collections;
import java.util.Iterator;

import pl.bcit.comp1451.kriss3.Address;
import pl.bcit.comp1451.kriss3.Item;
import pl.bcit.comp1451.kriss3.Store;

public class BookStore extends Store
{
	private BookType speciality;
	
	public BookStore(Address streetAddress, String name, HashMap<String, Item> mapOfItems) 
	{
		super(streetAddress, name, mapOfItems);
		// TODO Auto-generated constructor stub
	}
	
	public BookStore(Address address, String name, BookType speciality)
	{
		super(address, name);
		this.speciality = speciality;
	}
	
	public BookStore(Address address, String name, String speciality)
	{
		super(address, name);
		this.speciality = BookType.get(speciality);
		addBooks();
	}
	
	//private methods
	private void addBooks()
	{
	      Date birthDate = new Date(1919, 1, 1);
	      Name name = new Name("Jerome", "David", "Salinger");
	      BookType genre = BookType.get("fiction");
	      Author author = new Author(birthDate, name, genre, "JD");
	      Date datePublished  = new Date(1951, 5, 14);
	      String title = "The Catcher in the Rye";
	      Book b = new Book(0.4, 2.0, 4.0, "1234", author, datePublished, title, genre);
	      addItem(b);
	}


}
