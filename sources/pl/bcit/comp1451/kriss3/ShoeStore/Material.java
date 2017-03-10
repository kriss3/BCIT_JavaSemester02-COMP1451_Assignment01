package pl.bcit.comp1451.kriss3.ShoeStore;

import java.util.HashMap;
import java.util.Map;

public enum Material 
{
	PLASTIC("plastic"), 
	LEATHER("leather"), 
	RUBBER("rubber"), 
	CLOTH("cloth");
	
	private String theMaterial;
	
	private static Map<String, Material> lookup = new HashMap<String, Material>();
	
	static
    {
        for (Material m : Material.values())
        {
            lookup.put(m.getTheMaterial(), m);
        }
    }
	
	private Material(String material)
	{
		this.theMaterial = material;
	}
	
	public String getTheMaterial()
	{
		return this.theMaterial;
	}

	public static Material get(String theMaterial)
	{
		return lookup.get(theMaterial);
	}
	
}


