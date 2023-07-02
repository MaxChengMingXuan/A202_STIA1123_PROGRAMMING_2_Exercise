package PhoneProfile;

public class Main {

	public static void main(String[] args) {
		Phone vivo=new Phone(); //create new object from class Phone name as vivo
		Phone huawei=new Phone();//create new object from class Phone name as huawei
		Phone samsung=new Phone();//create new object from class Phone name as samsung
		Phone nokia=new Phone();//create new object from class Phone name as nokia
		Phone motorola=new Phone();//create new object from class Phone name as motorola
		
		//vivo.brand="SAMSUNG";
		//vivo.colour="RED";
		//vivo.price=2399;
		//vivo.volume=10;
		
		System.out.println("VIVO SPECIFICATION");
		vivo.printSpec("V19","Red",399,55.6,'Y');
		vivo.printPrice("V19", 399);
		
		System.out.println("HUAWEI SPECIFICATION");
		huawei.printSpec("Mate40","Silver",4399,25.4,'Y');
		huawei.printPrice("Mate40", 4399);
		
		System.out.println("SAMSUNG SPECIFICATION");
		samsung.printSpec("S21","Black",11399,77.7,'Y');
		samsung.printPrice("S21", 11399);
		
		System.out.println("NOKIA SPECIFICATION");
		nokia.printSpec("Nokia 3310","Blue",50,99.99,'N');
		nokia.printPrice("Nokia 3310", 50);
		
		System.out.println("MOTOROLA SPECIFICATION");
		motorola.printSpec("DynaTAC 8000X","Black",999,1199.99,'N');
		vivo.printPrice("DynaTAC 8000X", 999);
	}

}
