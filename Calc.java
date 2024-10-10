/*calculator using java*/
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
		int ans=0;
        Scanner sc = new Scanner(System.in);
		System.out.println("enter oprator");
		char ch=sc.next().trim().charAt(0);
		if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
			System.out.println("enter first number");
		    int num1=sc.nextInt();
			System.out.println("enter second number");
			int num2=sc.nextInt();
			if(ch=='+'){
			ans=num1+num2;}
			
			if(ch=='-'){
				ans=num1-num2;
			}
			if(ch=='*'){
				ans=num1*num2;
			}
			if(ch=='/'){
				ans=num1/num2;
				
			}
			
			}
			System.out.println("ans is"+ans);
			
		}
		
			
			
				
				
	}
