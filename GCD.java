public class GuviGCD {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		int gcd=1;int d;int m;
		int a1[]=new int[a];
		int a2[]=new int[a];
		
		
		for(m=0;m<a;m++){
			a1[m]=in.nextInt();
			a2[m]=in.nextInt();
		}
		
		for(d=0;d<a;d++){
			for(int k=1;k<=a1[d]&&k<=a2[d];k++){
				if(a1[d]%k==0 && a2[d]%k==0){
					gcd=k;
				}
				
				}
			System.out.println(gcd);
			}
		
		in.close();
		
	
	}

}
