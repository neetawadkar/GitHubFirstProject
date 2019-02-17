package EncapsulationExample;

public class EncapsulationExample1 {
	
	private int UIDAI;
	private String AppName;
	private int AppAge;

	
	public int getAppUIDAI()
	{
		return UIDAI;
	}
	
	public String getAppName()
	{
		return AppName;
	}
	
	public int getAppAge()
	{
		return AppAge;
	}
	
	public void setAppAge(int newValue)
	{
		if (newValue <0 || newValue > 99)
		{
			throw new IllegalArgumentException();
		}
		
		AppAge = newValue;
	}
	
	public void setAppName(String newValue)
	{
		AppName = newValue;
	}
	
	public void setAppUIDAI(int newValue)
	{
		UIDAI = newValue;
	}

}
