public class Ex9 
{
	public void countOccurance(String mynumber)
	{
		for(int i=0;i<mynumber.length();i++)
		{
			char ch = mynumber.charAt(i);
			int count=0;
			for(int j=0;j<mynumber.length();j++)
			{
				char newchar =mynumber.charAt(j);
					if(ch==newchar)
					count++;
			}
			System.out.println("["+ch+"] :==> "+count);
		}
	}
	public static void main(String[] args) 
	{
		Ex9 x9 = new Ex9();
		x9.countOccurance("128896");
	}
}
