package virtualMachine;

public class StringMethods {
	
	public static void main(String args[])
	
	{
		String S = "    Second day of Selenium class     ";
		
		System.out.println(S.length());
		System.out.println(S.charAt(9));
		System.out.println(S.substring(11));
		System.out.println(S.substring(0,6));
		System.out.println(S.contains("day"));
		System.out.println(S.equals("day"));
		System.out.println(S.equals("Second day of Selenium class"));
		
		//String date = String.join("/", "16","12","2018");
		//System.out.println(date);
		System.out.println(String.join("/", "16","12","2018"));
		System.out.println(S.indexOf("day"));
		System.out.println(S.indexOf("e",7));
		System.out.println(S.lastIndexOf("s"));
		
		String[] A = S.split(" ");
		
		for(String B : A)
		{
			System.out.println(B);
		}
		
		System.out.println(S.replace("Selenium","SELENIUM"));
		System.out.println(S.toLowerCase());
		System.out.println(S.toUpperCase());
		System.out.println(S.trim());
		
		//System.out.println(S.split("\\S"));
		
	}

}
