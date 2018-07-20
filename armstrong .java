class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	int a=175;
	int b,temp;
	temp=a;int c=0;
		while(a!=0){
			b=a%10;
		a=a/10;
		c=c+(b*b*b);
		}
		if(temp==c){
			System.out.println("armstrong number");
		}
		else
		{
	System.out.println("not a armstrong number");
		}	
	}
}
