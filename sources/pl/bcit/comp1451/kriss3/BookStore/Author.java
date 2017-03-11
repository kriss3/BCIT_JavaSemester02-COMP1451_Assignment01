package pl.bcit.comp1451.kriss3.BookStore;

import pl.bcit.comp1451.kriss3.Date;
import pl.bcit.comp1451.kriss3.Name;

/**
 * Class Author to represent Autor objects;
 * @author kszczurowski
 * @see https://github.com/kriss3/BCIT_JavaSemester02-COMP1451_Assignment01.git
 */
public class Author 
{
	private Date birthDate;
	private Name name;
	private BookType genre;
	private String pseudonym;
	
	public Author(Date birthDate, Name name, BookType genre, String pseudonym) 
	{
		setBirthDate(birthDate);
		setName(name);
		setGenre(genre);
		setPseudonym(pseudonym);
	}
	
	public Author(Date birthDate, Name name, BookType genre)
	{
		setBirthDate(birthDate);
		setName(name);
		setGenre(genre);
	}

	public Date getBirthDate() 
	{
		return birthDate;
	}

	public void setBirthDate(Date birthDate) 
	{
		this.birthDate = birthDate;
	}

	public Name getName() 
	{
		return name;
	}

	public void setName(Name name) 
	{
		this.name = name;
	}

	public BookType getGenre() 
	{
		return genre;
	}

	public void setGenre(BookType genre) 
	{
		this.genre = genre;
	}

	public String getPseudonym() 
	{
		return pseudonym;
	}

	public void setPseudonym(String pseudonym) 
	{
		this.pseudonym = pseudonym;
	}
}
