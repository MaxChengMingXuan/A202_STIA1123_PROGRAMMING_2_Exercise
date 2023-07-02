package exercise_3;

public class Main {

	public static void main(String[] args) {
		University USM=new University("Nibong Tebal","Malaysia",24375,5416,1972);
		System.out.println("University location: "+USM.location
						  +"\nCountry            : "+USM.country
						  +"\nFounded            : "+USM.foundYear
						  +"\nNumber of students : "+USM.student
						  +"\nNumber of lecturers: "+USM.lecture
						  +"\n");
		
		University UUM=new University();
		System.out.println("University location: "+UUM.location
				  	  	  +"\nCountry            : "+UUM.country
				  	  	  +"\nFounded            : "+UUM.foundYear
				  	  	  +"\nNumber of students : "+UUM.student
				  	  	  +"\nNumber of lecturers: "+UUM.lecture);
		
	}

}
