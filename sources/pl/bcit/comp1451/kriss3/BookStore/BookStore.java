package pl.bcit.comp1451.kriss3.BookStore;

import java.util.HashMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import pl.bcit.comp1451.kriss3.Address;
import pl.bcit.comp1451.kriss3.Date;
import pl.bcit.comp1451.kriss3.Item;
import pl.bcit.comp1451.kriss3.Store;
import pl.bcit.comp1451.kriss3.Name;

public class BookStore extends Store
{
	private BookType speciality;
	
	public BookStore(Address address, String name, BookType speciality)
	{
		super(address, name);
		this.speciality = speciality;
		addBooks();
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
	      
	      datePublished  = new Date(1948, 1, 31);
	      title = "A Perfect Day for Bananafish";
	      genre = BookType.get("fiction");
	      b = new Book(1, 11, 12, "2345", author, datePublished, title, genre);
	      addItem(b); 
	     
	      datePublished  = new Date(1945, 12, 12);
	      title = "A Boy in France";
	      genre = BookType.get("fiction");
	      b = new Book(2, 33, 35, "3456", author, datePublished, title, genre);
	      addItem(b);    
	      
	      birthDate = new Date(1963, 9, 3);
	      name = new Name("Malcolm", "Gladwell");
	      genre = BookType.get("nonfiction");
	      author = new Author(birthDate, name, genre) ;
	      datePublished  = new Date(2008, 11, 18);
	      title = "Outliers";
	      b = new Book(2.1, 2, 6, "4567", author, datePublished, title, genre);
	      addItem(b);
	     
	      datePublished  = new Date(2000, 3, 1);
	      title = "The Tipping Point";
	      genre = BookType.get("nonfiction");
	      b = new Book(0.5, 3, 5, "5678", author, datePublished, title, genre);
	      addItem(b); 
	      
	      birthDate = new Date(1919, 11, 26);
	      name = new Name("Frederik", "Pohl");
	      genre = BookType.get("sciencefiction");
	      author = new Author(birthDate, name, genre, "Paul Dennis Lavond") ;
	      datePublished  = new Date(1977, 7, 4);
	      title = "Gateway";
	      b = new Book(0.01, 4, 4, "6789", author, datePublished, title, genre);
	      addItem(b);      

	      datePublished  = new Date(1937, 10, 6);
	      title = "Elegy to a Dead Planet: Luna";
	      genre = BookType.get("sciencefiction");
	      b = new Book(0.1, 5, 11, "abcd", author, datePublished, title, genre);
	      addItem(b)  ;  
	      
	      birthDate = new Date(1918, 5, 11);
	      name = new Name("Richard", "Phillips", "Feynman");
	      genre = BookType.get("reference");
	      author = new Author(birthDate, name, genre) ;
	      datePublished  = new Date(1942, 5, 20);
	      title = "Principle of Least Action in Quantum Mechanics";
	      b = new Book(0.8, 15, 30, "efgh", author, datePublished, title, genre);
	      addItem(b);       

	      datePublished  = new Date(1964, 6, 30);
	      title = "The Messenger Lectures";
	      genre = BookType.get("reference");
	      b = new Book(0.6, 44, 45.5, "ijkl", author, datePublished, title, genre);
	      addItem(b);             

	      datePublished  = new Date(1985, 11, 1);
	      title = "Surely You're Joking Mr. Feynman";
	      genre = BookType.get("nonfiction");
	      b = new Book(1.0, 3, 13, "mnop", author, datePublished, title, genre);
	      addItem(b);             
	}

	public void displayAllBooksByEveryAuthor()
	{
		//example: Gladwell wrote The Tipping Point in 2000
		Collection<Book> books 	= getCollectionOfItems(); // From the Store class
		
		for(Book b : books)
		{
			System.out.println(b.getAuthor().getName().getLastName() + " wrote " + b.getTitle() + " in "  + b.getDatePublished());
		}
	}
	
	public void displayAllBooksByAuthor(String lastName)
	{
		Collection<Book> books 	= getCollectionOfItems(); // From the Store class
		
		if(lastName == null)
		{
			System.out.println("Fix the last name !!");
		}
	    
		for(Book b : books)
		{
			if(b.getAuthor().getName().getLastName().equals(lastName))
			{
				System.out.println(b.getAuthor().getName().getLastName() + " wrote " + b.getTitle());
			}
		}
	}
	
	public void displayAllBooksWrittenBefore(int year)
	{
		Collection<Book> books 	= getCollectionOfItems(); // From the Store class
		
		if(year < 0)
		{
			System.out.println("Fix the year !!");
		}
	    
		for(Book b : books)
		{
			if(b.getDatePublished().getYear() < year)
			{
				System.out.println(b.getAuthor().getName().getLastName() + " wrote " + b.getTitle() + " in " + b.getYearPublished() + ", which is before " + year);
			}
		}
	}
	
	public void displayTitlesOfBooksWrittenBy(String pseudonym)
	{
		if(pseudonym == null)
		{
			System.out.println("Fix the pseudonym !!");
		}
		//Sallinger wrote The Catcher in the Rye as JD
		Collection<Book> books 	= getCollectionOfItems(); // From the Store class
		for(Book b : books)
		{
			if(b.getAuthor().getPseudonym().equals(pseudonym))
			{
				System.out.println(b.getAuthor().getName().getLastName() + " wrote " + b.getTitle() + " in " + b.getYearPublished() + ", as " + b.getAuthor().getPseudonym());
			}
		}
	}
	
	public void displayAllBooksForGenre(String genre)
	{
		if(genre == null)
			System.out.println("Fix genre !!!");
		
		Collection<Book> books = getCollectionOfItems(); // From the Store class
		for(Book b : books)
		{
			if(b.getGenreString().equals(genre))
			{
				System.out.println(b.getTitle() + " is a " + b.getGenreString() + " written by " + b.getAuthor());
			}
		}
	}
	
	public void displayTotalWeightKgOfAllBooks()
	{
		Collection<Book> books 	= getCollectionOfItems(); // From the Store class
		
		double totalWeight = 0.0;
		for(Book b : books)
		{
			totalWeight += b.getWeightKg();
		}
		
		System.out.println("Total Kg of Books: " + totalWeight);
	}
	
	public void displayAllBooksWrittenByAuthorsBornOn(String dayOfTheWeek)
	{
		if(dayOfTheWeek == null)
			System.out.println("Fix the day !!!");
		
		Collection<Book> books 	= getCollectionOfItems(); // From the Store class
		int bookCount=0;
		for(Book b : books)
		{
			//get the method that returns String of the Day from the Date
			if(b.getAuthor().getBirthDate().getDayOfTheWeek().equals(dayOfTheWeek))
			{
				System.out.println(b.getTitle() + " was writtern by " + b.getAuthorFullName() + ", who was born on " + b.getAuthor().getBirthDate().getDayOfTheWeek());
			}
			else
				bookCount++;
		}
		if(bookCount==0)
			System.out.println("No authors were born on " + dayOfTheWeek);
		
	}

	public void displayAllBooksPublishedOn(String dayOfTheWeek)
	{
		Collection<Book> books 	=  getCollectionOfItems(); // From the Store class
		int bookCount = 0;
		for(Book b : books)
		{
			if(b.getDatePublished().getDayOfTheWeek().equals(dayOfTheWeek))
			{
				System.out.println(b.getTitle() + " was written by " + b.getAuthorFullName() + ", which was published on " + b.getDatePublished().getDayOfTheWeek());
			} else
				bookCount++;
		}
		if(bookCount >= 0)
			System.out.println("No Bookes were published on " + dayOfTheWeek);
	}


	public void displayAllBooksWrittenByAuthorsWithAPseudonym()
	{
		Collection<Book> books 	= getCollectionOfItems(); // From the Store class
		
		for(Book b : books)
		{
			if(!b.getAuthor().getPseudonym().equals(""))
			{
				System.out.println(b.getAuthorFullName() + " wrote " + b.getTitle() + " as " + b.getAuthor().getPseudonym());
			}	
		}
	}
	
	//NOT FINISHED
	public void displayBookWithBiggestPercentageMarkup()
	{
		Collection<Book> books 	= getCollectionOfItems(); // From the Store class
	}
	
	public void displayAllBooksWrittenByAuthorsOverThisAge(int ageInYears)
	{
		Collection<Book> books 	= getCollectionOfItems(); // From the Store class
	    Iterator<Book> it 		= books.iterator();
	    boolean displayedSome 	= false;
	    
	    while(it.hasNext())
	    {
	    	Book b = it.next();
	        int ageYears = b.getDatePublished().getYear() - b.getAuthor().getBirthDate().getYear();
	        if(ageYears > ageInYears)
	        {
	            System.out.println(b.getTitle() + " was written by " + b.getAuthor().getName().getLastName() + 
	            		" at age " + ageYears + ", which is more than " + ageInYears);
	            displayedSome = true;
	        }
	    }
	    if(displayedSome == false)
	    {
	    	System.out.println("No books by authors over age " + ageInYears);  
	    }
	}
	
	public void displayAllBooksWrittenOutsideSpecialty()
	{
		Collection<Book> books 	= getCollectionOfItems(); // From the Store class
	}
	
}
