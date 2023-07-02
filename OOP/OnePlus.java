package OOP;

public class OnePlus {
	String screen="AMOLED";
	String brand="OnePlus";
	String colour="Forest Green";
	String chipset="Snapdragon 888";
	String os="Oxygen OS";
	int battery=4500;
	boolean charging;
	
	void charging() {
		charging=false;
		System.out.println("charging="+charging);
	}
	
	void call() {
		System.out.println("Calling WongReJie......");
	}

	void browse() {
		System.out.println("Loading google......");
	}
}
