public class BAALLON {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String a=in.next();
	String b=in.next();
	int l1=a.length();
	int l2=b.length();int m=0;
	int min;int count=0;int max;
	min =l1;
	for(int i=0;i<2;i++){
		if(l1<min){
			min=l1;
		}
		else{
			min=l2;
		}
	}
	System.out.println("min:"+min);
	char c1[]=a.toCharArray();
char c2[]=b.toCharArray();
for(int i=0;i<min;i++){
if(c1[i]==c2[i]){
	count++;
		}
}
System.out.println("count:" +count);
	max=l1;	
for(int i=0;i<2;i++){
	if(l1>max){
		max=l1;
	}
	else{
		max=l2;
	}
}		
	System.out.println("max:"+max);	
  m=max-count;	
	System.out.println("m:"+ m);	
  }
  }
