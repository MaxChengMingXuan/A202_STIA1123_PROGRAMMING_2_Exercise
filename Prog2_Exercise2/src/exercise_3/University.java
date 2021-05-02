package exercise_3;
import java.util.Scanner;

public class University {
	String location;
	String country;
	int student;
	int foundYear;
	int lecture;
	
	Scanner scan=new Scanner(System.in);
	//No Argument Constructor
	University(){
		System.out.println("Enter the loaction: ");
		this.location=scan.nextLine();
		
		System.out.println("Enter the origin country: ");
		this.country=scan.nextLine();
		
		System.out.println("Enter the students number: ");
		this.student=scan.nextInt();
		
		System.out.println("Enter the lectures number: ");
		this.lecture=scan.nextInt();
		
		System.out.println("Enter the founded year: ");
		this.foundYear=scan.nextInt();	
	}
	
	//Parameterised constructor
	University(String l,String c,int f,int le,int s) {
		this.location=l;
		this.country=c;
		this.student=f;
		this.lecture=le;
		this.foundYear=s;
	}
}
