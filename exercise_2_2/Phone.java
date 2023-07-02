package exercise_2_2;

public class Phone {
	String model;
	String brand;
	String chipset;
	String colour;
	int price;
	int framerate;
	
	void printSpec(String m,String b,String c,int p,int f) {
		System.out.println("Spec of "+m 
						  +"\nBrand           : " +b
						  +"\nColour          : " +c
						  +"\nPrice           : RM" +p
						  +"\nRefresh rate    : "+f
						  +"\n"
						  );	
	}
	
	void calValue(int p,String m) {
		System.out.printf("You can buy "+(p/5)+" cups coffee(RM5) with one unit of "+m+".");
		System.out.println("\n");
	}
	
	void calOneThousand(String m,int p) {
		System.out.println("You will able to buy "+(1000/p)+" "+m+" with RM1000");
		System.out.println("");
	}
	
	void exFps(int f,String m) {
		System.out.println((f-30)+" framerates exceed when you watch a video at 30fps with"+m+".");
		System.out.println("");
	}
	
	
}
