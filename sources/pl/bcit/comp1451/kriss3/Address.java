package pl.bcit.comp1451.kriss3;

/**
 * Address class to represent Address objects
 * @author kszczurowski
 * @see https://github.com/kriss3/BCIT_JavaSemester02-COMP1451_Assignment01.git
 */
public class Address 
{
	private String streetNumber;
	private String streetName;
	private String city;
	private String postalCode;
	
	public Address(String streetNumber, String streetName, String city, String postalCode) 
	{
		setStreetNumber(streetNumber);
		setStreetName(streetName);
		setCity(city);
		setPostalCode(postalCode);
	}

	public String getStreetNumber() 
	{
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) 
	{
		this.streetNumber = streetNumber;
	}

	public String getStreetName() 
	{
		return streetName;
	}

	public void setStreetName(String streetName) 
	{
		this.streetName = streetName;
	}

	public String getCity() 
	{
		return city;
	}

	public void setCity(String city) 
	{
		this.city = city;
	}

	public String getPostalCode() 
	{
		return postalCode;
	}

	public void setPostalCode(String postalCode) 
	{
		this.postalCode = postalCode;
	}
	
	
	
}

