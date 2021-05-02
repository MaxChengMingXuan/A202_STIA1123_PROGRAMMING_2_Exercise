package exercise_2_2_scanner;
import java.util.Scanner;

public class Phone {
	Scanner scan=new Scanner(System.in);
	
	String model;
	String brand;
	String colour;
	int price;
	int framerate;
	
	void printSpec() {
		System.out.print("Enter the name of device: ");
		String m=scan.nextLine();
		System.out.print("Enter the brand of device: ");
		String b=scan.nextLine();
		System.out.print("Enter the colour of device: ");
		String c=scan.nextLine();
		
		System.out.print("Enter the price of device: ");
		int p=scan.nextInt();
		System.out.print("Enter the refresh rate of device: ");
		int f=scan.nextInt();
		
		System.out.println("\nSpec of "+m 
						  +"\nBrand           : " +b
						  +"\nColour          : " +c
						  +"\nPrice           : RM" +p
						  +"\nRefresh rate    : "+f
						  +"\n"
						  );	
	}
	
	void calValue() {
		System.out.println("How many cup coffee can you buy with a phone?");
		System.out.print("Enter the price of device(RM): ");
		int p=scan.nextInt();
		System.out.print("Enter the price of coffee(RM): ");
		int c=scan.nextInt();
		int coffee=p/c;
		System.out.printf("You can buy "+coffee+" cups coffee with one unit of the device.");
		System.out.println("\n");
	}
	
	void calling() {
		System.out.println("Who do you want to call?\n"
						  +"Ali -1\n"
						  +"Abu -2\n"
						  +"Ame-3\n");
		System.out.print("Enter the number: ");
		int num=scan.nextInt();
		String contact="";
		
		if (num==1) {
			contact="Ali";
		}
		else if(num==2){
			contact="Abu";
		}
		else if(num==3){
			contact="Ame";
		}
		else {
			System.out.println("wrong number.");
		}
		System.out.println("Calling "+contact+"...\n"
						  +"Sorry, the person you call is unavailable.\n"
						  +"Pls try again later.\n");
		
	}
	
	void DotPerInch() {
		System.out.println("Welcome to screen DPI Calculator.");
		System.out.print("Enter your screen resolution(Horizontal): ");
		int h=scan.nextInt();
		System.out.print("Enter your screen resolution(vertical): ");
		int v=scan.nextInt();
		System.out.print("Enter your screen surface area(inch): ");
		int area=scan.nextInt();
		int dpi=(h*v)/area;
		System.out.println("The dpi of your screen is: "+dpi+"dpi");
	}
	
	
}
