package pl.bcit.comp1451.kriss3;

/**
 * Date class to manipulate and represent date;
 * @author Krzysztof Szczurowski
 * @since 2017 01 13
 */
public class Date 
{
	private int year;
	private int month;
	private int day;
	public Date(int year, int month, int day) 
	{
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	
	public int getYear() 
	{
		return year;
	}
	
	public void setYear(int year) 
	{
		this.year = year;
	}
	
	public int getMonth() 
	{
		return month;
	}
	
	public void setMonth(int month) 
	{
		this.month = month;
	}
	
	public int getDay() 
	{
		return day;
	}
	
	public void setDay(int day) 
	{
		this.day = day;
	}
	
	/**
	 * Public getDate method to return a string containing formated date;
	 * @return date as String 
	 */
	public String getDate()
	{
		return String.format("%4d - %02d - %02d", year, month, day);
	}
}
