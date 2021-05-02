package exercise_3_1;

public class Main {

	public static void main(String[] args) {
		University USM=new University("Nibong Tebal","Malaysia",24375,5416,1972);
		System.out.println("University location: "+USM.getLocation()
						  +"\nCountry            : "+USM.getCountry()
						  +"\nSince              : "+USM.getFoundYear()
						  +"\nAlready founded for "+USM.totalYear()+" years."
						  +"\nNumber of students : "+USM.getStudent()
						  +"\nNumber of lecturers: "+USM.getLecturer()
						  +"\n");
		
		University UUM=new University();
		System.out.println("University location: "+UUM.getLocation()
				  	  	  +"\nCountry            : "+UUM.getCountry()
				  	  	  +"\nFounded            : "+UUM.getFoundYear()
				  	  	  +"\nNumber of students : "+UUM.getStudent()
				  	  	  +"\nNumber of lecturers: "+UUM.getLecturer());
		
	}

}