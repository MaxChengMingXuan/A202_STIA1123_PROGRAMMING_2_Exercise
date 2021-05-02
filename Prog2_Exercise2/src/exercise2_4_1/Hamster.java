package exercise2_4_1;
import java.util.Scanner;
public class Hamster {
	Scanner scan=new Scanner(System.in);
	int weight;
	int height;
	Boolean rest;
	Boolean exercise;
	String colour ;
	
	//Create Setter
	public void setWeight() {
		System.out.print("Enter the weight(gram) of hamster : ");
		this.weight=scan.nextInt();
	}
	public void setHeight() {
		System.out.print("Enter the height(cm) of hamster: ");
		this.height=scan.nextInt();
	}
	public void setRest() {
		System.out.println("Is the hamster resting?\n"
						  +"yes-1\n"
						  +"no-2\n");
		int num=scan.nextInt();
		if(num==1)
			this.rest=true;
		else
			this.rest=false;
	}
	public void setExercise() {
		System.out.println("Is the hamster exercising?"
				  		  +"yes-1"
				          +"no-2");
		int num=scan.nextInt();
		if(num==1)
			this.exercise=true;
		else
			this.exercise=false;
	}
	public void setColour() {
		scan.nextLine();
		System.out.print("\nEnter hamster colour: ");
		this.colour=scan.nextLine();
	}
	
	//Create Getter
	public Integer getWeight() {
	  return this.weight;
	}
  
	public Integer getHeight() {
	  return this.height;
	}
  
	public Boolean getRest() {
 	  return this.rest;
	}
  
	public Boolean getExercise() {
 	  return this.exercise;
	}
  
	public String getColour() {
	  return this.colour;
	}
	
	//Methods
	public void hamsterDetail() {
		System.out.println("Hamster weight      : "+weight+"g");
		System.out.println("Hamster height      : "+height+"cm");
		System.out.println("Is the hamster resting? "+rest);
		System.out.println("Is the hamster exercising? "+exercise);
		System.out.println("Hamster colour      : "+colour);
	}
	
}

