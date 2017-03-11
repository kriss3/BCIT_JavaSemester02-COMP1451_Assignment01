package pl.bcit.comp1451.kriss3.ShoeStore;

import java.awt.Color;

import pl.bcit.comp1451.kriss3.Item;
import pl.bcit.comp1451.kriss3.Name;

/**
 * Class Shoe to represent shoe objects in Shoe Store idea;
 * @author Krzysztof Szczurowski
 * @see https://github.com/kriss3/BCIT_JavaSemester02-COMP1451_Assignment01.git
 */
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

	public Color getColor() 
	{
		return color;
	}

	public void setColor(Color color) 
	{
		this.color = color;
	}
}
