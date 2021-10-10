package week1day1;

public class Primenumbers {

	public static void main(String[] args) {
		
		boolean value = false;
		int num = 13;
		int range=num/2;
		for (int i = 1; i <=range; i++) {
			if(num%1 == 0);
			value = true;
			
		}
		if (value == true) {
			System.out.println(" prime number");
			}
		if (value == false) {
			System.out.println("it is not  a prime number");
			
			
		}
	}
}
