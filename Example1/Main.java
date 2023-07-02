package Example1;

public class Main {

	public static void main(String[] args) {
		Class1 c=new Class1(); //create new obj named as c
		System.out.println(c.x);
		System.out.println(c.s);
		
		Class1 d=new Class1();//create  second obj
		System.out.println(d.x);
		System.out.println(d.s);
		d.printHi();
		
		Class2 f=new Class2();
		f.printSum();
		f.printCgpa();
		
		Class3 e=new Class3();
		e.printFood();
	}

}
