package CollectionFrameworkExample;

import java.util.Set;
import java.util.HashSet;

public class HashSetExample {
	
	public static void main(String args[])
	{
		Set HS = new HashSet();
		
		boolean b1 = HS.add("Neeta");
		boolean b2 = HS.add("netra");
		
		HS.add("Sandeep");
		HS.add("Shalini");
		HS.add(null);
		HS.add(null);
		HS.add(1);
		
		boolean b3 = HS.add("NEETA");
		
		System.out.println("b1 = " +b1);
		System.out.println("b2 = " +b2);
		System.out.println("b3 = " +b3);
		System.out.println(HS);
	}

}
