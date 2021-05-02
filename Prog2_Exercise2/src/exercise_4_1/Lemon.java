package exercise_4_1;

public class Lemon extends Fruit{
	private int quantity;//in RM
	private int mass;//in kg
	
	public Lemon(String name, String taste,int quantity,int mass) {
		super(name,taste);
		System.out.println("Lemon constructor is invoked");
		this.quantity=quantity;
		this.mass=mass;
		System.out.println(name+" is "+taste+".");
	}
	
	public double totalMass() {
		double pricePerMass=this.quantity*this.mass;
		return pricePerMass;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public int getMass() {
		return this.mass;
	}
	
	public String toString() {
		return super.toString()
			  +"\nMass  : "+mass+"kg"
			  +"\nNumber: "+quantity
			  +"\nTotal mass: "+totalMass()+"kg";
	}

}
