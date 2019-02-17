package CollectionFrameworkExample;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetExample {
	
	public static void main(String args[])
	{
		//TreeSet<String> TS = new TreeSet<>();
		TreeSet<String> TS = new TreeSet<>(Comparator.reverseOrder());
		
		//adding elements to TreeSet
		TS.add("Banana");
		TS.add("Apple");
		TS.add("Grapes");
		TS.add("Orange");
		TS.add("Pineappale");
		TS.add("Custord Apple");
		
		System.out.println("Fruits set : " +TS);
		
	}

}
