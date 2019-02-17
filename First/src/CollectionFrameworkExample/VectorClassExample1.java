package CollectionFrameworkExample;

import java.util.Vector;

public class VectorClassExample1 {
	
	public static void main(String args[])
	{	
		Vector v = new Vector();
		v.add(1312019);
		v.add(0,"Synchronised");
		v.add(1,"Neeta");
		v.add(2,0);
		v.add(3,"TCS");
		v.add(3,4);
		v.add(3,"Vector");
		v.add(3,6);
		
		System.out.println(v.get(4));
		System.out.println(v.get(3));
		
		System.out.println("Vector is " +v);
	}


}
