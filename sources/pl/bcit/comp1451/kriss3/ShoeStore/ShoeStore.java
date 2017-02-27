package pl.bcit.comp1451.kriss3.ShoeStore;
import java.awt.Color;
import java.util.HashMap;

import pl.bcit.comp1451.kriss3.Address;
import pl.bcit.comp1451.kriss3.Item;
import pl.bcit.comp1451.kriss3.Name;
import pl.bcit.comp1451.kriss3.Store;

public class ShoeStore extends Store 
{
	private Department department;
	
	public ShoeStore(Address streetAddress, String name, String department) 
	{
		super(streetAddress, name);
		this.department = Department.get(department);
		addShoes();
	}
	
	public ShoeStore(Address streetAddress, String name, Department department)
	{
		super(streetAddress, name);
		this.department = department;
		addShoes();
	}
	
	/*public Shoe(double weightKg, double manufacturingPriceDollars, double suggestedPriceDollars, String uniqueId,
			Material meterial, int size, Name designer, ShoeType shoeType, Color color) 
	 * 
	 * 
	 */
	private void addShoes()
	{
		Name name = new Name("Sketches");
		Department department = Department.MEN;
		Color color = Color.DARK_GRAY;
		Material material = Material.LEATHER;
		Shoe s = new Shoe(1, 58.5, 90, "1234", material, 10, name, color,department);
		addItem(s);
		
		
		
	}
}
