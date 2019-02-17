package CollectionFrameworkExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String args[])
	
	{
		List<Integer> list = new ArrayList<Integer>();
		list.add(123);
		list.add(456);
		list.add(789);
		list.add(111);
		list.add(222);
		list.add(333);
		//Traversing list through Iterator
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
			/*traversing through for each loop
			//for (String obj:lst)
			{
				System.out.println(obj);
			}*/
		}
	}
}
