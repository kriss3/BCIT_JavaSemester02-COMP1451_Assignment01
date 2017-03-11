package pl.bcit.comp1451.kriss3.ShoeStore;

import java.util.HashMap;
import java.util.Map;

/**
 * Enumeration to represent different Departments in Shoe Stores;
 * @author kszczurowski
 * @see https://github.com/kriss3/BCIT_JavaSemester02-COMP1451_Assignment01.git
 */
public enum Department 
{
	WOMEN("women"),
	MEN("men"),
	CHILDREN("children"),
	SPORTS("sports"),
	DRESS("dress");
	
	private String theDepartment;
	
	private static Map<String, Department> lookup = new HashMap<String, Department>();
	
	static
    {
        for (Department department : Department.values())
        {
            lookup.put(department.getTheDepartment(), department);
        }
    }
	
	private Department(String department)
	{
		this.theDepartment = department;
	}
	
	public String getTheDepartment()
	{
		return this.theDepartment;
	}

	public static Department get(String theDepartment)
	{
		return lookup.get(theDepartment);
	}
}




