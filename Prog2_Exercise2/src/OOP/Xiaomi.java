package OOP;

public class Xiaomi {
	String screen="OLED";
	String brand="Xiaomi";
	String colour="Blue";
	String chipset="Snapdargon 865";
	String os="Miui 12";
	int battery=4780;
	boolean charging;
	
	void charging() {
		charging=true;
		System.out.println("charging="+charging);
	}
	
	void call() {
		System.out.println("Calling Adam......");
	}

	void browse() {
		System.out.println("Loading website......");
	}
}
