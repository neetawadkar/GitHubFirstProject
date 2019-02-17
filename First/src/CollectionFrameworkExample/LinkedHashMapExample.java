package CollectionFrameworkExample;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
	
	public static void main(String args[])
	{
		
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(1, "Let us C");
		map.put(2, "Programming language");
		map.put(3, "Data communication and networking");
		System.out.println("Values before removal : " +map);
		
		map.remove(3);
		
		System.out.println("Values after removal : "+map);
		
	}

}
