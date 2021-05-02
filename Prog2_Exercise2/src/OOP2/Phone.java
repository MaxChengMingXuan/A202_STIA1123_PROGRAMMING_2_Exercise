package OOP2;

public class Phone {
	String screen[]= {"amoled","lcd","oled"};
	String brand[] ={"Apple","Xiaomi","Samsung","OnePlus"};
	String colour[]= {"Red","Blue","Grey","Green","Black"};
	String chipset[]= {"Snapdragon 888","Snapdragon 865","A14"};
	String os[]= {"MIUI 12","Oxygen OS"};
	int battery[]= {4500,4780,3300};
	boolean charging;
	
	void charging() {
		charging=true;
		System.out.println("charging="+charging);
	}
	
	void call() {
		System.out.println("Now Calling......");
	}

	void browse() {
		System.out.println("Loading website......");
	}
}
