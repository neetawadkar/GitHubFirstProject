package CollectionFrameworkExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	
	public static void main(String args[])
	
	{
		HashMap<String,Integer> HM = new HashMap<String,Integer>();
		
		HM.put("Wagholi", new Integer(411001));
		HM.put("Kharadi", new Integer(411002));
		HM.put("Hinjewadi", new Integer(411003));
		HM.put("VimanNagar", new Integer(411004));
		HM.put("Aundh",411005);
		HM.put("Wagholi", new Integer(411006));
		HM.put("KalyaniNagar", new Integer(411004));
		
		System.out.println(HM.entrySet());
		
		//Return Set view
		Set<Map.Entry<String,Integer>> ME = HM.entrySet();
		
		for (Map.Entry<String,Integer> me:ME)
		{
			System.out.print(me.getKey() + ":");
			System.out.println(me.getValue());
		}
		
	}

}
