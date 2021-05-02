package exercise_3_Inheritance;

//Sub Class UUM that inherit Super class UUM
public class UUM extends University {
	private double area;
	private int course;
	private int koku;
	private int hall;//student residential hall
	
	UUM(double a, int c,int k,int h,int s){
		this.area=a;
		this.course=c;
		this.koku=k;
		this.hall=h;
	}
	
	
	
	public double areaConvert(double h) {	//convert hectare to area
		double a=h*1000;
		return a;
	}
	
	public double averageStudentPerHall(int student,int  hall) {
		double mean;
		mean=student/hall;
		return mean;
	}
	
	public double density(double area) {
		double dense=totalPeople()/area;
		return dense;
	}
	
	public double getArea() {
		return this.area;
	}
	public int getCourse() {
		return this.course;
	}
	public int getKoku() {
		return this.koku;
	}
	public int getHall() {
		return this.hall;
	}
	
	public String toString() {
		return "\nArea             : "+getArea()+"hectare"
			  +"\nNumber of courses: "+getCourse()
			  +"\nNumber of Koku   : "+getKoku()
			  +"\nNumber of Halls  : "+getHall();
	}


}
