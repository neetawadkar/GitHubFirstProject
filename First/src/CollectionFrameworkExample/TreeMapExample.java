package CollectionFrameworkExample;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	
	public static void main(String args[])
	{
		TreeMap<Integer, String> TM = new TreeMap<>();
		TM.put(1234, "ABC");
		TM.put(1235, "MNO");
		TM.put(1236, "EFG");
		TM.put(1237, "XYZ");
		TM.put(1238, "HIJ");
		
		System.out.println("Tree Map : " +TM);
		
		//Finding the size of Tree Map
		System.out.println("Total number of TM : " +TM.size());
		
		//check if given key exists in Tree Map
		Integer id = 1200;
		if(TM.containsKey(id))
		{
			//Get the value associated with a given key in Tree Map
			String name = TM.get(id);
			System.out.println("Tree Map with id " +id+":" +name);
		}
		else
		{
			System.out.println("Tree Map does not exist with id : " +id);
		}
		
		//Find the first and last entry
		System.out.println("First entry in Tree Map : " +TM.firstEntry());
		System.out.println("Last entry in Tree Map : " +TM.lastEntry());
		
		//Find the entry whose key is just less than the given key
		Map.Entry<Integer, String> TMJB = TM.lowerEntry(1234);
		System.out.println("Tree Map just below id 1234 : " +TMJB);
		
		//Find the entry whose key is just Higher than the given key
				Map.Entry<Integer, String> TMJA = TM.higherEntry(1234);
				System.out.println("Tree Map just above id 1234 : " +TMJA);
		
		
	}

}
