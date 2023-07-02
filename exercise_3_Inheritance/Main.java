package exercise_3_Inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UUM obj=new UUM(1061,60,20,15,5);
		
		//Method inherit from University
		int year=obj.totalYear();
		System.out.println("The Uni has founded for "+year+"years.");
		double ratio=obj.ratio();
		System.out.println("The ratio of Students:Lecture is "+ratio+".");
		
		//Method form UUM itself
		double mean=obj.averageStudentPerHall(obj.getStudent(),obj.getHall());
		System.out.println("There will be average "+mean+" students per hall.");
		
		double density=obj.density(obj.areaConvert(obj.getArea()));
		System.out.println("The population density is "+density+"per m2.");
		
		System.out.println(obj.toString());
	}

}
