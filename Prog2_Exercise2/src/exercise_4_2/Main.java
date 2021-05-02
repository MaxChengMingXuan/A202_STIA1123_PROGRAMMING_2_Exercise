//****************************************************************************//
//Updated Contents:
//1. toString used in all classes, 
//   each sub class added difference statements compare to their super class
//2. Overriding method printHint() is created, it give hint based on 
//   the type of fruit & taste
//3. Overloading methods are added in Apple class
//****************************************************************************//

package exercise_4_2;

public class Main {

	public static void main(String[] args) {
		Apple s = new Apple("Apel", "tasteless", 10, 2);
		s.printHint();
		System.out.println(s);// Overriding toString of Fruit
		s.printSugarPercentage(100, 1);
		//Overloading method in apple class
		s.printPricePerMass();

		GreenApple GA = new GreenApple("Unripe Apple", "Sour", 5, 3, 14);
		GA.printHint();
		System.out.println(GA);// Overriding toString of Apple
		GA.printSugarPercentage(100, 2);
		//Overloading method inherited from apple class
		GA.printPricePerMass();

		RedApple RA = new RedApple("Little Apple", "Sweet", 10, 2, 7);
		RA.printHint();
		System.out.println(RA);// Overriding toString of Apple
		RA.printSugarPercentage(100, 0.5);
		//Overloading method inherited from apple class
		RA.printPricePerMass();

		Lemon LE = new Lemon("Yellow lemon", "very sour", 4, 1);
		LE.printHint();
		System.out.println(LE);// Overriding toString of Fruit

		Mango MA = new Mango("Cute mango", "very sweet", 5, 14);
		MA.printHint();
		System.out.println(MA);// Overriding toString of Fruit
	}

}
