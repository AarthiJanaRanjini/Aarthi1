public class ArcGuvi {
public static void main(String[] args) {
String a; String b;
int a1=0;
Scanner in=new Scanner(System.in);
a=in.nextLine();
b=in.nextLine();
char c[]=a.toCharArray();
char ch[]=b.toCharArray();
int d=0;int k=0;
for(int i=0;i<c.length;i++){
		 d=d+(c[i]-96);
		}
	System.out.println(d);
		for(int j=0;j<ch.length;j++){
		k=k+(ch[j]-96);
		}
		System.out.println(k);
		if(d>k){
			a1=d-k;
		}
		else{
			a1=k-d;
		}
		System.out.println(a1);
		}
		
		}	
