package pl.bcit.comp1451.kriss3.BookStore;

import pl.bcit.comp1451.kriss3.Date;
import pl.bcit.comp1451.kriss3.Item;

public class Book extends Item
{
	private Author author;
	private Date datePublished;
	private String title;
	private BookType genre;
	
	public Book(double weightKg, double manufacturingPriceDollars, double suggestedPriceDollars, String uniqueId,
			Author author, Date datePublished, String title, BookType genre) 
	{
		super(weightKg, manufacturingPriceDollars, suggestedPriceDollars, uniqueId);
		setAuthor(author);
		setDatePublished(datePublished);
		setTitle(title);
		setGenre(genre);
	}
	
	public Author getAuthor() 
	{
		return author;
	}

	public void setAuthor(Author author) 
	{
		this.author = author;
	}

	public Date getDatePublished() 
	{
		return datePublished;
	}

	public void setDatePublished(Date datePublished) 
	{
		this.datePublished = datePublished;
	}

	public String getTitle() 
	{
		return title;
	}

	public void setTitle(String title) 
	{
		this.title = title;
	}

	public BookType getGenre() 
	{
		return genre;
	}

	public void setGenre(BookType genre) 
	{
		this.genre = genre;
	}
	
	public void setISBN()
	{
		super.setUniqueId();
	}
	
	public String getISBN()
	{
		return super.getUniqueId();
	}
	
	public int getYearPublished()
	{
		return this.datePublished.getYear();
	}
	
	public String getAuthorFullName()
	{
		return author.getName().getFullName(author.getName().getFullName(
				new String[]{author.getName().getFirstName(), author.getName().getMiddleName(),author.getName().getLastName()}));
	}
	
	public String getGenreString()
	{
		return genre.getTheBookType();
	}
}
