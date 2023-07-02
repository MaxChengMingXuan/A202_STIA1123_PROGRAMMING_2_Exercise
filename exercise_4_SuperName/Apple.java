package exercise_4_SuperName;

public class Apple extends Fruit {
	private int quantity;
	private int price;
	
	public Apple(String name,int q,int p) {
		super(name);
		this.quantity=q;
		this.price=p;
	System.out.println("Apple contructor is invoked");
	System.out.println(name);
	}
	
	public int totalPrice() {
		return this.quantity*this.price;
	}
}
