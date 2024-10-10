/*program to find factorial of number*/
import java.util.Scanner;
class Fact{
	public static void main(String[] args) {
		System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
		int out=fact(n);
		System.out.println(out);
}
	static int fact(int n){
		int i=1;
		int ans=1;
		while(i<=n){
		ans=ans*i;
		i++;}
		return ans;
		
	}
		
	
}
		
		
