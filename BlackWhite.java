public class BlackWhite {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();int i,s;
s=2*n;

int count=0;
for(i=0;i<s;i=i+2){
	count++;
}
System.out.println("pairs to be moved"+":"+count);
	}
	
}
