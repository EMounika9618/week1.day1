package week1.day1;

public class Twowheeler 
{
		int Wheels= 2;
	short Mirrors= 2;
	long chassisNumber= 123456789L;
	boolean isPunctured= false;
	String bikeName= "Hero Honda";
	double runningKM= 1465.23;
	
	public static void main(String[] args) 
	{
		Twowheeler obj=new Twowheeler();
		System.out.println("No of Wheels = " +obj.Wheels);
		System.out.println("No of Mirros = "+obj.Mirrors);
		System.out.println("Chasis Number = "+obj.chassisNumber);
		System.out.println("Is Punctured = "+obj.isPunctured);
		System.out.println("Bike Name = "+obj.bikeName);
		System.out.println("Running KM = "+obj.runningKM);
		
		}

	}


