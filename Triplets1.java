public class Triplets {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
			int a=in.nextInt();
			int j,k,count=0;
			int arr[]=new int [a];
			for(int i=0;i<a;i++){
				arr[i]=in.nextInt();
			}
			for(int i=0;i<a-2;i++){
				for(j=i+1;j<a-1;j++){
					if(arr[i]>arr[j]){
						continue;
					}
					for(k=j+1;k<a;k++){
						if(arr[i]<arr[j] && arr[j]<arr[k]){
                          count++;							
						}
					
					}
					
				}
			}
		System.out.println(count);
	}

}
