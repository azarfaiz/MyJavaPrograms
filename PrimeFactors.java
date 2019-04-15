import java.util.Scanner;

public class PrimeFactors {

	private static Scanner ip;

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number for which prime factors need to be found");
		ip = new Scanner(System.in);
		n = ip.nextInt();
		System.out.println("The prime factors of the number are as follows");
		getPrimeFactors(n);

	}
	
	private static void getPrimeFactors(int number){
		int sqroot =(int)Math.sqrt(number);
		for(int i=2;i<=sqroot;i++){
			if(number % i == 0){
			int count = 0;
			while(number % i == 0){
				number = number / i;
				count++;
			}
			System.out.printf("Number %d is a factor %d times",i,count);
			System.out.println();
			}
		}
		if(number != 1){
			System.out.printf("Number %d is a factor 1 time",number);
		}
	}

}
