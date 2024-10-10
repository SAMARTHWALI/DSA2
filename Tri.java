/*program to find the area of tringle*/
import java.util.Scanner;
class Tri{
	public static void main(String[] args) {
		System.out.println("enter base ");
        Scanner sc = new Scanner(System.in);
	    int base=sc.nextInt();
		System.out.println("enter hight  ");
		int hight=sc.nextInt();
	float area=area(base,hight);
	System.out.println(area);

	
	
	
	}
	static float area(int base,int hight){
		
		return 0.5f*base*hight;
				
	}

}
		
		
