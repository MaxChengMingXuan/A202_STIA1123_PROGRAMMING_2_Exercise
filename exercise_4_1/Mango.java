package exercise_4_1;

public class Mango extends Fruit{
	private int price;//in RM
	private int quantity;//in kg
	
	public Mango(String name, String taste,int price,int quantity) {
		super(name,taste);
		System.out.println("Mango constructor is invoked");
		this.price=price;
		this.quantity=quantity;
		System.out.println(name+" is "+taste+".");
	}
	
	public double totalPrice() {
		double pricePerMass=this.price*this.quantity;
		return pricePerMass;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public String toString() {
		return super.toString()
			  +"\nNumber : "+quantity+""
			  +"\nPrice  : "+"RM"+price
			  +"\nTotal price: RM"+totalPrice();
	}

}
