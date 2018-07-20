class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	int count=0;
		for(int i=10;i<20;i++){
			count=0;
			for(int j=1;j<20;j++){
			if(i%j==0){
				count++;
			}
			}
			if(count==2){
			System.out.println(i);
		}
		
		}		
	}
}
