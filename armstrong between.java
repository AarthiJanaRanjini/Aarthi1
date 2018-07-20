class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		int c=0,a1,a=150;int temp;
		while(a>160){
			temp=a;
			while(a!=0){
				a1=a%10;
				a=a/10;
				c=c+(a1*a1*a1);
			}
			if(temp==c){
				System.out.println(temp);
			}
			
			
			
		}
	}
}
