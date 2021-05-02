package PhoneProfile;

public class Phone {
	String brand;
	int price;
	String colour;
	int volume;
	char fingerprint;
	
	void printSpec(String b,String c,int p, double v,char f) {
		System.out.println("Spec" 
						  +"\nBrand      : " +b
						  +"\nColour     : " +c
						  +"\nPrice      : RM" +p
						  +"\nMass       : " +v+"g"
						  +"\nFingerprint: "+f
						  );	
		}
	
	void printPrice(String b,int p) {
		System.out.printf("Total Price of 5 units of "+b+" is RM%d.\n"
						 +"\n", p*5);
	}
}
