import java.util.Scanner;
class Circle{
	public static void main(String[] args) {
		System.out.println("enter radius");
        Scanner sc = new Scanner(System.in);
	    int r=sc.nextInt();
	float area=area(r);
	System.out.println(area);
	float cir=circ(r);
	System.out.println(cir);
	
	
	
	}
	static float area(int r){
		float pi=22/7;
		return pi*r;
				
	}
	static float circ(int r){
		float pi=22/7;
		return 2*pi*r;
				
	}
}
		
		