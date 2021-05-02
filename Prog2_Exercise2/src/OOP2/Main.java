package OOP2;

public class Main {
	public static void main(String[] args) {
		Phone mi10 = new Phone();
		Phone OnePlus9Pro =new Phone();
		
		System.out.println("\nMi10"+
						   "\nBrand    : "+mi10.brand[1]+
						   "\nChipset  : "+mi10.chipset[1]+
						   "\nSystem OS: "+mi10.os[0]);
		
		System.out.println("\nStart calling...");
		mi10.call();
		System.out.println("\nOpen Browser...");
		mi10.browse();
		System.out.println("\nCharging status:");
		mi10.charging();
		
		System.out.println("\n1+ 9Pro"+
						   "\nBrand    : "+OnePlus9Pro.brand[3]+
						   "\nChipset  : "+OnePlus9Pro.chipset[0]+
						   "\nSystem OS: "+OnePlus9Pro.os[1]);
		
		System.out.println("\nStart calling...");
		OnePlus9Pro.call();
		System.out.println("\nOpen Browser...");
		OnePlus9Pro.browse();
		System.out.println("\nCharging status:");
		OnePlus9Pro.charging();
	}
}
