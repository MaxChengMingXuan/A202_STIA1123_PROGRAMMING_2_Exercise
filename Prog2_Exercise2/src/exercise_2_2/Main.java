package exercise_2_2;

public class Main {

	public static void main(String[] args) {
		Human Jeff=new Human();
		Human Mark=new Human();
		
		Jeff.printBio("Jeff Bezos",'M',57,"CEO of Amazon");
		Mark.printBio("Mark Zuckerberg",'M',36,"Founder and CEO of Facebook");
		
		Mark.bornYear("Mark Zuckerberg",36);
		
		Mark.compareAge("Mark Zuckerberg", 36);
		
		Jeff.networth("Jeff Bezos", 185.1);
		
		Phone apple=new Phone();
		Phone xiaomi=new Phone();
		Phone vivo=new Phone();
		Phone oppo=new Phone();
		
		xiaomi.printSpec("Xiaomi 10","Xiaomi","Blue", 2400, 90);
		vivo.printSpec("Vivo V19","Vivo","Silver", 2600, 60);
		apple.printSpec("Iphone 12 Pro Max","Apple","Red",5000 , 60);
		
		xiaomi.calValue(2400,"Xiaomi 10");
		
		apple.calOneThousand("Iphone 12 Pro Max", 5000);
		
		vivo.exFps(60,"Vivo v19");


	}

}
