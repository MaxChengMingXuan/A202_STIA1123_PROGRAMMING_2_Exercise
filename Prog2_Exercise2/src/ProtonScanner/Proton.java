package ProtonScanner;
import java.util.Scanner;

public class Proton {
	Scanner scan=new Scanner(System.in);
	
	void speed() {
		System.out.println("Enter Max Speed: ");
		int m = scan.nextInt();
		System.out.println("The maximum speed is: "+m);
	}
	
	void carColor() {
		scan.nextLine();
		System.out.println("Enter Brand: ");
		String b=scan.nextLine();
		System.out.println("Enter Color: ");
		String c=scan.nextLine();
		
		System.out.println("The car brand is: "+b);
		System.out.println("The car color is: "+c);
	}
}
