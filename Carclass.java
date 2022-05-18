package week1.day1;

public class Carclass {

public void driveCar() {
	System.out.println("Drive the Car");
}
//create main function
public static void main(String[] args) {
	System.out.println("Inside Main Method");
	//create object
	Carclass myCar = new Carclass();
	myCar.driveCar();
	
}
}