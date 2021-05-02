package exercise_2_2_scanner;

public class Main {

	public static void main(String[] args) {
		Human Ali=new Human();
		Human Ame=new Human();
		
		Ali.printBio();
		Ame.printBio();
		
		Ame.bornYear();
		
		Ame.compareAge();
		
		Ali.networth();
		
		Ali.BMI();
		
		Phone apple=new Phone();
		Phone xiaomi=new Phone();
		Phone vivo=new Phone();
		
		xiaomi.printSpec();
		vivo.printSpec();
		apple.printSpec();
		
		xiaomi.calValue();
		
		apple.calling();
		
		vivo.DotPerInch();

	}

}
