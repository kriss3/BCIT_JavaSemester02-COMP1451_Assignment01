package pl.bcit.comp1451.kriss3.ShoeStore;
import java.awt.Color;
import java.util.Collection;
import java.util.Iterator;

import pl.bcit.comp1451.kriss3.Address;
import pl.bcit.comp1451.kriss3.Name;
import pl.bcit.comp1451.kriss3.Store;

/**
 * ShoeStore class to represent object of Shoe Store;
 * @author Krzysztof Szczurowski
 * @see https://github.com/kriss3/BCIT_JavaSemester02-COMP1451_Assignment01.git
 */
public class ShoeStore extends Store 
{
	private Department department;
	Collection<Shoe> shoes = null;
	
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
	
	/*
	 * public Shoe(double weightKg, double manufacturingPriceDollars, double suggestedPriceDollars, String uniqueId,
	 *		Material meterial, int size, Name designer, ShoeType shoeType, Color color) 
	 */
	private void addShoes()
	{
		Name name = new Name("Skechers");
		Department department = Department.MEN;
		Color color = Color.DARK_GRAY;
		Material material = Material.LEATHER;
		Shoe s = new Shoe(1, 58.5, 90, "Diameter", material, 10, name, color,department);
		addItem(s);
	
		department = Department.CHILDREN;
		color = Color.PINK;
		material = Material.PLASTIC;
		s = new Shoe(0.85, 32.5, 50, "Lite Kicks Rainbow Sprite", material, 10, name, color,department);
		addItem(s);
		
		name = new Name("Robert", "Cobbler");
		department = Department.DRESS;
		color = Color.BLACK;
		material = Material.LEATHER;
		s = new Shoe(1.15, 104, 160, "Wave", material, 12, name, color,department);
		addItem(s);
		
		department = Department.CHILDREN;
		color = Color.BLUE;
		material = Material.CLOTH;
		s = new Shoe(0.5,39, 60, "Toachi", material, 5, name, color,department);
		addItem(s);
		
		name = new Name("Geox");
		department = Department.MEN;
		color = Color.BLUE;
		material = Material.CLOTH;
		s = new Shoe(1, 110.5, 170, "Monet", material, 7, name, color,department);
		addItem(s);
		
		department = Department.WOMEN;
		color = Color.GRAY;
		material = Material.PLASTIC;
		s = new Shoe(0.9, 97.5, 150, "Marieclaire", material, 10, name, color,department);
		addItem(s);
		
		name = new Name("Nine", "West");
		color = Color.BLACK;
		material = Material.PLASTIC;
		s = new Shoe(0.85, 84.5, 130, "Camya Multi Glitter", material, 8, name, color,department);
		addItem(s);
		
		name = new Name("Stride", "Rite");
		department = Department.CHILDREN;
		color = Color.GRAY;
		material = Material.RUBBER;
		s = new Shoe(0.6, 45.5, 70, "Balance Of The Force", material, 9, name, color,department);
		addItem(s);
		
		
		name = new Name("Sperry");
		department = Department.CHILDREN;
		color = Color.ORANGE;
		material = Material.CLOTH;
		s = new Shoe(0.7, 39, 39, "Top-Sider Unisex Bluefish H&L", material, 9, name, color,department);
		addItem(s);
		
		name = new Name("Nike");
		department = Department.SPORTS;
		color = Color.WHITE;
		material = Material.RUBBER;
		s = new Shoe(1.2, 117, 180, "Jordan Ace 23 II", material, 13, name, color,department);
		addItem(s);

	}

	public void displayAllShoesAndDesigners()
	{
		//Don't know why below error. Cannot find constructive ansser from uncle Google
		//was trying List<T extends Item> shoes = getColleciton(); but no go;
		shoes = getCollectionOfItems();
		for(Shoe s : shoes)
		{
			System.out.println(String.format("%s offers %s size-%d %s's %s", s.getDesigner().getFullName(), s.getMeterial().toString().toLowerCase(), 
					s.getSize(),s.getShoeType().toString().toLowerCase(), s.getUniqueId()));
		}
	}
	
	public void displayAllShoesByDesigner(String designerName)
	{
		if(designerName == null)
		{
			System.out.println("Designer name incorrect. Fix this!");
		} 
		else
		{
			shoes = getCollectionOfItems();
			for(Shoe s : shoes)
			{
				if(s.getDesigner().getFirstName().equals(designerName))
				{
					System.out.println(String.format("%s offers a size-%d %s's %s",
							s.getDesigner().getFirstName(), s.getSize(), s.getShoeType().toString().toLowerCase(), s.getUniqueId()));
				}
			}
		}
	}
	
	public void displayAllShoesMadeOf(Material material)
	{
		shoes = getCollectionOfItems();
		
		if(material == null)
		{
			System.out.println("Material not specified. Fix this!");
		} 
		else
		{
			for (Shoe s : shoes) 
			{
				if(s.getMeterial().equals(material))
				{
					System.out.println(String.format("The size-%s %s is made of %s", 
							s.getSize(), s.getUniqueId(), s.getMeterial().toString().toLowerCase()));
				}
			}
		}
	}
	
	public void displayAllShoesMadeOf(String material)
	{
		if(material != null)
		{
			displayAllShoesMadeOf(Material.get(material));
		} 
		else
		{
			System.out.println("Material not specified. Fix this!");
		}
	}
	
	public void displayNumberOfShoesDesignedBy(Name designer)
	{
		shoes = getCollectionOfItems();	
		
		if(designer == null)
		{
			System.out.println("Designer not specified. Fix this!");
		} 
		else
		{
			int counter = 0;
			for (Shoe s : shoes) 
			{
				if(s.getDesigner().getFullName().equals(designer.getFullName()))
					counter++;
			}
			System.out.println(String.format("This store has %d shoes designed by %s", counter, designer.getFirstName()));
		}
	}
	
	public void displayNumberOfShoesDesignedBy(String designerLastName)
	{
		//Can be impoved by calling above displayNumberOfShoesDesignedBy(Name designer). Did not work for me as of yet.
		shoes = getCollectionOfItems();	
		
		if(designerLastName == null)
		{
			System.out.println("Designer not specified. Fix this!");
		} 
		else
		{
			int counter = 0;
			for (Shoe s : shoes) 
			{
				if(s.getDesigner().getLastName() != null && s.getDesigner().getLastName().equals(designerLastName))
					counter++;
			}
			System.out.println(String.format("This store has %d shoes designed by %s", counter, designerLastName));
			
		}
	}
	
	public void displaySmallestShoeSize() 
	{
		shoes = getCollectionOfItems();	
		int shoeSize = 20;
		
		for (Shoe shoe : shoes) 
		{
			if(shoe.getSize() < shoeSize)
			{
				shoeSize = shoe.getSize();
			}
		}
		
		System.out.println(String.format("smallest shoe size: %d", shoeSize));
	}
	
	public void displayTotalWeightKgOfAllShoes()
	{
		shoes = getCollectionOfItems();
		double totalShoeWeight = 0.0;
		for (Shoe s : shoes) 
		{
			totalShoeWeight += s.getWeightKg();
		}
		
		System.out.println(String.format("total kg of shoes: %.2f", totalShoeWeight));
	}
	
	public void displayAllShoesOfThisMaterialMadeByThisDesigner(Material m, Name designer)
	{
		shoes = getCollectionOfItems();
		boolean exists = false;
		if(m == null || designer == null)
		{
			System.out.println("Wrong parameters. Fix this!");
		}
		else
		{
			for (Shoe s : shoes) 
			{	
				if(s.getMeterial().equals(m) && s.getDesigner().getFullName().equals(designer.getFullName()))
				{
					exists = true;
					System.out.println(String.format("The %s is a %s shoe offered by %s", 
							s.getUniqueId(), s.getMeterial().toString().toLowerCase(), s.getDesigner().getFullName()));
				}
			}
			
			if(!exists)
			{
				System.out.println(String.format("This store has no %s shoes designed by %s", m.getTheMaterial(), designer.getFullName()));
			}
		}
	}
	
	// e.g. For a shoe store with department “WOMEN”, show all the shoes of type MEN, CHILDREN, SPORTS, and DRESS
	public void displayAllShoesNotInMatchingStore()
	{
		shoes = getCollectionOfItems();
		Iterator<Shoe> itr = shoes.iterator();
		
		while (itr.hasNext()) 
		{
			Shoe s = itr.next();
			if(s.getShoeType().equals(department))
			{
				continue;
			}
			else
			{
				System.out.println(String.format("The %s is a %s's shoe offered by %s", 
						s.getUniqueId(), s.getShoeType().getTheDepartment(), s.getDesigner().getFullName()));
			}
		}
	}
}
