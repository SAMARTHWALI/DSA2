/*program to find the Hcf of two numbers*/
import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		System.out.println("enter number 1");
		int num1=sc.nextInt();
		System.out.println("enter number 1");
		int num2=sc.nextInt();
		int ans=hcfun(num1,num2);
		System.out.println("hcf of given numbers is"+ans);
		
				
	}
	
	static int hcfun(int num1,int num2){
		if(num1==0){
		return num1;}
		if(num2==0){
		return num2;}
		if(num1==num2){
		return num1;}
		if(num1>num2){
		return hcfun(num1-num2,num2);}
		else{
			return hcfun(num1,num2-num1);
		}
			
	}
}
