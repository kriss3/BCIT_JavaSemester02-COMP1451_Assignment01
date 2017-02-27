package pl.bcit.comp1451.kriss3.ShoeStore;

import java.awt.Color;

import pl.bcit.comp1451.kriss3.Item;
import pl.bcit.comp1451.kriss3.Name;

public class Shoe extends Item 
{
	private Material meterial;
	private int size;
	private Name designer;
	private Department shoeTypeDepartment;
	private Color color;
	
	
	public Shoe(double weightKg, double manufacturingPriceDollars, double suggestedPriceDollars, String uniqueId,
			Material meterial, int size, Name designer, Color color, Department department) 
	{
		super(weightKg, manufacturingPriceDollars, suggestedPriceDollars, uniqueId);
		setMeterial(meterial);
		setSize(size);
		setDesigner(designer);
		setShoeType(department);
		setColor(color);
	}

	public Material getMeterial() 
	{
		return meterial;
	}

	public void setMeterial(Material meterial) 
	{
		this.meterial = meterial;
	}

	public int getSize() 
	{
		return size;
	}

	public void setSize(int size) 
	{
		this.size = size;
	}

	public Name getDesigner() 
	{
		return designer;
	}

	public void setDesigner(Name designer) 
	{
		this.designer = designer;
	}

	public Department getShoeType() 
	{
		return shoeTypeDepartment;
	}

	public void setShoeType(Department shoeTypeDepartment) 
	{
		this.shoeTypeDepartment = shoeTypeDepartment;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) 
	{
		this.color = color;
	}
	
	public void setDescription()
	{
		super.setUniqueId();
	}
	
	public String getDescription()
	{
		return super.getUniqueId();
	}
}
