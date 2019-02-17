package CollectionFrameworkExample;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	
	public static void main(String args[])
	{
		LinkedHashSet<String> LHS = new LinkedHashSet<String>();
		
		//Adding element to LinkedHashSet
		LHS.add("A");
		LHS.add("B");
		//LHS.add(1);
		LHS.add("C");
		LHS.add("D");
		LHS.add("A");//this will not add new element as A already exist
		LHS.add("E");
		
		System.out.println("Size of LinkedHashSet = " +LHS.size());
		System.out.println("Original LinkedHashSet = " +LHS);
		System.out.println("Removing D from LinkedHashSet = " +LHS.remove("D"));
		System.out.println("Trying to remove Z which is not present = " +LHS.remove("Z"));
		System.out.println("Checking if A is present in LinkedHashSet = " +LHS.contains("A"));
		System.out.println("Updated LinkedHashSet = " +LHS);
		
		Iterator<String> itr = LHS.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
	}

}
