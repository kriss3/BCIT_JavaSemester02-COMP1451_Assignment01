package pl.bcit.comp1451.kriss3;

import java.util.UUID;

/**
 * Item class to represent Item;
 * @author krzysztof szczurowski;
 * @since 2017-02-18
 * @see https://github.com/kriss3/BCIT_JavaSemester02-COMP1451_Assignment01.git
 */
public class Item 
{
	private double weightKg;
	private double manufacturingPriceDollars;
	private double suggestedPriceDollars;
	private String uniqueId;
	public Item(double weightKg, double manufacturingPriceDollars, double suggestedPriceDollars, String uniqueId) 
	{
		
		setWeightKg(weightKg);
		setManufacturingPriceDollars(manufacturingPriceDollars);
		setSuggestedPriceDollars(suggestedPriceDollars);
		setUniqueId(uniqueId);
	}
	
	public double getWeightKg() 
	{
		return weightKg;
	}
	
	public void setWeightKg(double weightKg) 
	{
		this.weightKg = weightKg;
	}
	
	public double getManufacturingPriceDollars() 
	{
		return manufacturingPriceDollars;
	}
	
	public void setManufacturingPriceDollars(double manufacturingPriceDollar) 
	{
		this.manufacturingPriceDollars = manufacturingPriceDollar;
	}
	
	public double getSuggestedPriceDollars() 
	{
		return suggestedPriceDollars;
	}
	
	public void setSuggestedPriceDollars(double suggestedPriceDollars) 
	{
		this.suggestedPriceDollars = suggestedPriceDollars;
	}
	
	public String getUniqueId() 
	{
		return uniqueId;
	}
	
	public void setUniqueId(String value) 
	{
		UUID uuid = UUID.randomUUID();
		this.uniqueId = value == null || value.equals("") ? uuid.toString() : value;
		
	}
}
