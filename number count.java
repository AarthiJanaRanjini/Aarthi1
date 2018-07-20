class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		int a=356;
		int count=0;
		while(a!=0)
		{
			int a1=a%10;
			count++;
			a=a/10;
		}
		System.out.println(count);	
	}
}
