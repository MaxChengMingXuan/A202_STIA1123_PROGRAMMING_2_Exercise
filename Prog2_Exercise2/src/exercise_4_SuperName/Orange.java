package exercise_4_SuperName;

public class Orange extends Apple{
	private int quantity;
	private int price;
	
	public Orange(String name,int q,int p) {
		super(name, q, p);
		this.quantity=q;
		this.price=p;
	System.out.println("Apple contructor is invoked");
	System.out.println(name);
	}
	
	public int totalPrice() {
		return this.quantity*this.price;
	}
}
