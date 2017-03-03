package pl.bcit.comp1451.kriss3;

import java.util.Collection;
import java.util.HashMap;

public class Store 
{
	private Address streetAddress;
	private String name;
	private HashMap<String, Item> mapOfItems;
	
	
	public Store(Address streetAddress, String name) 
	{
		setStreetAddress(streetAddress);
		setName(name);
		mapOfItems = new HashMap<>();
		
	}

	public Address getStreetAddress() 
	{
		return streetAddress;
	}

	public void setStreetAddress(Address streetAddress) 
	{
		this.streetAddress = streetAddress;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public HashMap<String, Item> getMapOfItems() 
	{
		return mapOfItems;
	}

	public void setMapOfItems(HashMap<String, Item> mapOfItems) 
	{
		this.mapOfItems = mapOfItems;
	}
	
	
	//public methods
	public void addItem(Item item)
	{
		mapOfItems.put(item.getUniqueId(), item);
	}
	
	public Item getItemByKey(String key)
	{
		return mapOfItems.get(key);
	}
	
	@SuppressWarnings("rawtypes")
	public Collection getCollectionOfItems()
	{
		return mapOfItems.values();
	}
	
	//private methods
}
