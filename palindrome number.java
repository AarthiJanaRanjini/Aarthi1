lass Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		int a=565;int sum=0;int f;
		int temp;
		temp=a;
		while(a!=0){
			f=a%10;
			sum=(sum*10)+f;
			a=a/10;
			
		}
		if(temp==sum){
			System.out.println("Palindrome");
			}
			else
			{
				System.out.println("not a palindrome");
		}
		
		
		
		
		
	}
}
