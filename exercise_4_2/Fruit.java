package exercise_4_2;
//Super class of all fruits
public class Fruit {
	private String name;
	private String taste;
	private double sugarContain;//in gram
	
	public Fruit(String name,String taste) {
		System.out.println("——————————————————————————————————————————————"
						   +"\nFruit constructor is invoked");
		this.name =name;
		this.taste=taste;
	}
	
	public void printHint() {
		System.out.println("This is a type of fruit.");
	}
	
	//Override in Apple
	public double sugarPer100g(int sugar,int mass) {
		sugarContain=sugar/10;
		return sugarContain;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getTaste() {
		return this.taste;
	}
	
	
	public String toString() {
		return  "\nName : "+name
			   +"\nTaste: "+taste;
	}
}
