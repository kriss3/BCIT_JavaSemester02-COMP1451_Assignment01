package pl.bcit.comp1451.kriss3;

public class Name 
{
	private String firstName;
	private String middleName;
	private String lastName;
	
	public Name(String firstName, String middleName, String lastName) 
	{
		setFirstName(firstName);
		setMiddleName(middleName);
		setLastName(lastName);
	}
	
	public Name(String name)
	{
		setFirstName(name);
	}
	
	public Name(String firstName, String lastName)
	{
		setFirstName(firstName);
		setLastName(lastName);
	}
	
	public String getFirstName() 
	{
		return firstName;
	}
	
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName == null || firstName.equals("") ? "Marry" : firstName;
	}
	
	public String getMiddleName() 
	{
		return middleName;
	}
	
	public void setMiddleName(String middleName) 
	{
		this.middleName = middleName == null || middleName.equals("") ? "Jane" : middleName;
	}
	
	public String getLastName() 
	{
		return lastName;
	}
	
	public void setLastName(String lastName) 
	{
		this.lastName = lastName == null || lastName.equals("") ? "Poppins" : lastName;
	}
	
	public String getFullName(String...strings)
	{
		String result = null;
		for(String s : strings)
		{
			result += s + " ";
		}
		return result;
	}
}
