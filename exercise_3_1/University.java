package exercise_3_1;
import java.util.Scanner;

public class University {
	private String location;
	private String country;
	private int student;
	private int foundYear;
	private int lecture;
	
	Scanner scan=new Scanner(System.in);
	//No Argument Constructor
	public University(){
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
	public University(String l,String c,int f,int le,int s) {
		this.location=l;
		this.country=c;
		this.student=f;
		this.lecture=le;
		this.foundYear=s;
	}
	
	public int totalYear(){
		return (2021-this.foundYear);
	}
	
	
	public String getLocation() {
		return this.location;
	}
	public String getCountry() {
		return this.country;
	}
	public int getStudent() {
		return this.student;
	}
	public int getFoundYear() {
		return this.foundYear;
	}
	public int getLecturer() {
		return this.lecture;
	}
}
