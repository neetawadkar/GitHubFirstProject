package CollectionFrameworkExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample1 {

	public static void main(String args[])
	
	{
		List<String> lst = new ArrayList<String>();
		lst.add("Neeta");
		lst.add("Sandeep");
		lst.add("Sanvi");
		lst.add("Shalini");
		lst.add("Omkar");
		lst.add("Yogesh");
		//Traversing list through Iterator
		Iterator<String> itr = lst.iterator();
		
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
