package exercise_4_1;

public class Main {

	public static void main(String[] args) {
		Apple s=new Apple("Apel","tasteless", 10, 2);
		System.out.println(s.toString());//Overriding toString of Fruit
		
		GreenApple GA=new GreenApple("Unripe Apple","Sour", 5, 3, 14);
		System.out.println(GA.toString());//Overriding toString of Apple
		
		RedApple RA=new RedApple("Little Apple","Sweet", 10, 2, 7);
		System.out.println(RA.toString());//Overriding toString of Apple
		
		Lemon LE=new Lemon("Yellow lemon", "very sour", 4, 1);
		System.out.println(LE.toString());//Overriding toString of Fruit
		
		Mango MA=new Mango("Cute mango","very sweet",5,14);
		System.out.println(MA.toString());//Overriding toString of Fruit
	}

}
