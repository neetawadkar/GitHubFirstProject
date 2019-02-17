package virtualMachine;

import java.util.Arrays;

public class Countparticularword {
	
	public static void main(String args[])
	
	{
		String STR = "I am here I am there I am everywhere I am nowhere";
		String[] STR1 = STR.split("am");
		int A = STR.split("am").length-1;
		System.out.println(A);
		System.out.println(Arrays.toString(STR1));
	}

}
