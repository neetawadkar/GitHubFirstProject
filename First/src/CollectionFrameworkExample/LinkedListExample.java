package CollectionFrameworkExample;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	
public static void main(String args[])
	
	{
		LinkedList<String> LL = new LinkedList<String>();
		LL.add("TCS");
		LL.add("CTS");
		LL.add("Infosys");
		LL.add("Aviva");
		LL.add("Amazon");
		LL.add("Ebay");
		//Traversing list through Iterator
		Iterator<String> itr = LL.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
			//traversing through for each loop
			/*for (String obj:lst)
			{
				System.out.println(obj);
			}*/
		}
	}


}
