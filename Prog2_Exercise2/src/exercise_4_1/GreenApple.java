package exercise_4_1;

public class GreenApple extends Apple{
	private double vitaminC;//percentage of vitamin C
	
	public GreenApple(String name, String taste, int price, int mass,double vitamin) {
		super(name, taste, price, mass);
		this.vitaminC=vitamin;
	}
	
	//price of 1kg vitamin C
	public double vitaminValue() {
		double vitValue=super.getPrice()/(this.vitaminC/100*super.getMass());
		return vitValue;
	}
	
	public double getVitaminC() {
		return this.vitaminC;
	}
	
	public String toString() {
		return super.toString()
			  +"\nPercentage of vitamin C: "+vitaminC+"%"
			  +"\nPrice of 1kg Vitamin C : RM"+vitaminValue();
	}
	
}
