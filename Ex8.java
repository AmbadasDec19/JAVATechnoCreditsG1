class Ex8	
{
	public void countVowels(String mystr)
	{
		int counter=0;
		System.out.println("Length of String : "+mystr.length());
		char vow[] = {'a','e','i','o','u','A','E','I','O','U'};
		for(int i=0;i<mystr.length();i++)
		{
			char mychar = mystr.charAt(i);
			 for(int j=0;j<vow.length;j++)
			 {
				 char vovchar = vow[j];
				 if(mychar==vovchar)
				 {
					 counter++;
					 break;
				 }             
			 }
			
		}
		System.out.println(" Total Vowels in ["+mystr+"] :==> "+counter);
	}
	public static void main(String arg[])
	{
		Ex8 x8= new Ex8();
		x8.countVowels("aeiou");
	}
}
