package week1.day1;

public class SumOfDigits {

	public static void main(String[] args) {
		int x=256;
		int sum=0;

		while(x>0)
		{
			int rem=x%10;
			sum=sum+rem;
			x=x/10;

		}
		System.out.println("Sum of Digits = " +sum);
	}

}
