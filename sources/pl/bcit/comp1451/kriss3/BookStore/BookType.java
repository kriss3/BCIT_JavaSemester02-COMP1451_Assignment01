package pl.bcit.comp1451.kriss3.BookStore;

import java.util.HashMap;
import java.util.Map;

public enum BookType 
{
	FICTION("fiction"), 
	NONFICTION("nonfiction"), 
	SCIENCEFICTION("sciencefiction"), 
    REFERENCE("reference");

    private String theBookType;

    private static Map<String, BookType> lookup = new HashMap<String, BookType>();
      
    static
    {
        for (BookType b : BookType.values())
        {
            lookup.put(b.getTheBookType(), b);
        }
    }

    private BookType(String theBookType) 
    {
        this.theBookType = theBookType;
    }

    public String getTheBookType() 
    {
        return theBookType;
    }
    
    public static BookType get(String theBookType)
    {
    	return lookup.get(theBookType);
    }
}
