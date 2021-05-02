package exercise_2_2_scanner;
import java.util.Scanner;
public class Human {
	Scanner scan=new Scanner(System.in);
	String name;
	char gender;
	int age;
	String career;

	void printBio() {
		System.out.print("Enter name: ");
		String n=scan.nextLine();
		System.out.print("Enter age: ");
		int a=scan.nextInt();
		scan.nextLine();
		System.out.print("Enter career: ");
		String c=scan.nextLine();
		System.out.print("Enter gender(M/F): ");
		char g=scan.next().charAt(0);
		System.out.println("Biografy of "+n
						  +"\nAge   : "+a
						  +"\nGender: "+g
						  +"\nCareer: "+c
						  +"\n");
	}
	
	void bornYear() {
		System.out.println("When do he/she born?");
		System.out.print("Enter age: ");
		int a=scan.nextInt();
		int y=2020-a;
		System.out.println("This person born in "+y+".");
		System.out.println("");
	}
	
	void compareAge() {
		System.out.println("Comapare age of A and B");
		System.out.print("Enter age of person A: ");
		int a=scan.nextInt();
		System.out.print("Enter age of person B: ");
		int b=scan.nextInt();
		if(a>b) {
			System.out.println("A is "+(a-b)+" years older than B.");
		}
		else if(b>a) {
			System.out.println("B is "+(b-a)+" years older than A.");
		}
		else {
			System.out.println("A and B are same age.");
		}
		System.out.println("");
	}
	
	void networth() {
		System.out.print("Enter networth of person A(RM): ");
		double w=scan.nextDouble();
		double expense= 1000;
		double t=(w/expense)/12;
		System.out.printf("If A use RM1000 each month,\n"
						 +"A can survive %.2f year without working",t);
		System.out.println("");		
	}
	
	void BMI() {
		System.out.println("BMI Calculator");
		System.out.print("Enter height(cm): ");
		int h=scan.nextInt();
		System.out.print("Enter weight(kg): ");
		int w=scan.nextInt();
		double bmi=w/((h/100)^2);
		System.out.printf("The BMI is "+bmi);
		System.out.println("\n\n");
	}
}
