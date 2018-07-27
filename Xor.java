public class GuviXOR {
public static void main(String[] args) {
		int n,a;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		a=in.nextInt();
		int arr[]=new int[n];
		int a1[]=new int[a];
		int a2[]=new int[a];
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		for(int i=0;i<a;i++){
			a1[i]=in.nextInt();
			a2[i]=in.nextInt();
			}
		int s=0;int c=0;
		for(int i=0;i<a;i++){
			s=a1[i]^a2[i];		
		System.out.println(s);
		}
	}

}
