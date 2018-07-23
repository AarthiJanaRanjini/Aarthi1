public class Bronze {
public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int l1=in.nextInt();
		String str[]=new String[3];
		int arr[]=new int[l1];int i,j,k,l;	
		for(i=0;i<l1;i++){
			str[i]=in.next();
		}
		//System.out.println(str.length);
		for(j=0;j<str.length;j++){
		arr[j]=str[j].length();
			System.out.println(arr[j]);
		}
		//System.out.println(arr.length);
		

		int min=arr[0];
		for(k=0;k<arr.length-1;k++){
			if(arr[k]<min){
				min=arr[k];
				}
		}
		System.out.println(min);
		String p="";
	for(l=0;l<l1-1;l++){
		char c1[]=str[l].toCharArray();
		char c2[]=str[l+1].toCharArray();
		p="";
		for(int g=0;g<min;g++){
		if(c1[g]==c2[g])
			p+=c1[g];
		else
			break;
		
	}
		min=p.length();
		
	
		
	}		
	System.out.print(p);
		
		

	}

}
