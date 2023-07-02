package OOP;

public class Phone {

	public static void main(String[] args) {
		Xiaomi mi10=new Xiaomi();
		mi10.charging();
		mi10.call();
		mi10.browse();
		System.out.println(mi10.screen);
		System.out.println(mi10.brand);
		System.out.println(mi10.colour);
		System.out.println(mi10.chipset);
		System.out.println(mi10.os);
		System.out.println("Battery capacity="+mi10.battery+"mAh");
		
		OnePlus p=new OnePlus();
		p.charging();
		p.call();
		p.browse();
		System.out.println(p.screen);
		System.out.println(p.brand);
		System.out.println(p.colour);
		System.out.println(p.chipset);
		System.out.println(p.os);
		System.out.println("Battery capacity="+p.battery+"mAh");

	}

}
