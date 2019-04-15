
public class NearestPrime {

	public static void main(String[] args) {
		
		int n = 97;
		boolean isPrime = true;
		int sqrt = (int) Math.sqrt(n);
		System.out.println("sqrt : "+sqrt);
		
		for(int i=2;i<=(Math.sqrt(n));i++) {
			if(n % i == 0) {
				isPrime = false;
				break;
			}				
		}
		
		if(isPrime)
			System.out.println("Number is prime");
		else
			System.out.println("Number is not prime");
	}

}
