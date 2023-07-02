package exercise_4_1;
//Super class of all fruits
public class Fruit {
	private String name;
	private String taste;
	
	public Fruit(String name,String taste) {
		System.out.println("\nFruit constructor is invoked");
		this.name =name;
		this.taste=taste;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getTaste() {
		return this.taste;
	}
	
	public String toString() {
		return "\nName : "+name
			  +"\nTaste: "+taste;
	}
}
