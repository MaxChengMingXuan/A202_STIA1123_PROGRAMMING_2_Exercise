package exercise_4_1;

public class Apple extends Fruit {
	private int price;//in RM
	private int mass;//in kg
	
	public Apple(String name, String taste,int price,int mass) {//constructor
		super(name,taste);
		System.out.println("Apple constructor is invoked");
		this.price=price;
		this.mass=mass;
		System.out.println(name+" is "+taste+".");
	}
	
	public double pricePerMass() {
		double pricePerMass=this.price/this.mass;
		return pricePerMass;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public int getMass() {
		return this.mass;
	}
	
	public String toString() {
		return super.toString()
			  +"\nMass : "+mass+"kg"
			  +"\nPrice: "+"RM"+price
			  +"\nPrice Per Mass: RM"+pricePerMass()+"/kg";
	}

}
