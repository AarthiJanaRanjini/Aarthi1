public class MurderGuvi {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		int c=0;int sum=0;
		for(int j=0;j<n;j++){
			for(int k=j;k<n;k++){
				c=arr[k]-arr[j];
				sum=sum+c;
			}
		}
		System.out.println(sum);
		}
    }
		
