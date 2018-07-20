class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		int n=3;
	int a=1,b=2,c=3;
	int arr[]=new int[10];
	arr[0]=a;
	arr[1]=b;arr[2]=c;
	if(arr[0]>arr[1]&& arr[0] >arr[2]){
		System.out.println(arr[0]);
	}
	else if(arr[1]>arr[0]&&arr[1]>arr[2]){
		System.out.println(arr[1]);
		}	
		else if(arr[2]>arr[0]&&arr[2]>arr[1]){
			System.out.println(arr[2]);
		}		
	}
}
