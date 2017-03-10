package pl.bcit.comp1451.kriss3;

import java.util.ArrayList;
import java.util.Iterator;

public class Name 
{
	private String firstName;
	private String middleName;
	private String lastName;
	
	public Name(String name)
	{
		setFirstName(name);
	}
	
	public Name(String firstName, String lastName)
	{
		setFirstName(firstName);
		setLastName(lastName);
	}
	
	public Name(String firstName, String middleName, String lastName) 
	{
		setFirstName(firstName);
		setMiddleName(middleName);
		setLastName(lastName);
	}
	
	public String getFirstName() 
	{
		return firstName;
	}
	
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName == null  ? "" : firstName;
	}
	
	public String getMiddleName() 
	{
		return middleName;
	}
	
	public void setMiddleName(String middleName) 
	{
		this.middleName = middleName == null ? "" : middleName;
	}
	
	public String getLastName() 
	{
		return lastName;
	}
	
	public void setLastName(String lastName) 
	{
		this.lastName = lastName == null ? "" : lastName;
	}
	
	public String getFullName()
	{ 
		// fistName ONLY
		// lastName ONLY
		
		// fistName + lastName ONLY
		// firstName + middleName + lastName;
		
		
		String results = "";
		
		if(middleName == null && lastName == null)
		{
			results = String.format("%s", firstName, lastName);
		}

		if(middleName == null && firstName == null)
		{
			results = String.format("%s", lastName);
		}
		
		if(firstName != null && lastName != null)
		{
			results = String.format("%s %s", firstName, lastName);
		}
		
		if(firstName != null && middleName != null && lastName != null)
			results = String.format("%s %s %s", firstName, middleName, lastName);
		
		return results;
	}
}
