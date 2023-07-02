package exercise_2_2;

public class Human {
	String name;
	char gender;
	int age;
	String career;
	
	void printBio(String n,char g,int a, String c) {
		System.out.println("Biografy of "+n
						  +"\nAge   : "+a
						  +"\nGender: "+g
						  +"\nCareer: "+c
						  +"\n");
	}
	
	void bornYear(String n,int a) {
		int y=2020-a;
		System.out.println(n+" born in "+y+".");
		System.out.println("");
	}
	
	void compareAge(String n,int a) {
		System.out.println(n+" is "+(a-20)+" years older than the 2000'.");
		System.out.println("");
	}
	
	void networth(String n,double w) {
		double population= 7.674;
		System.out.println("If "+n+" distribute assets equally to the world's population,\n"
						  +"each person would receive "+w/population+"billion.");
		System.out.println("\n\n\n");
		
	}
	
	
}
