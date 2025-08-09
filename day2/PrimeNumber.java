package week1.day2;

public class PrimeNumber {
	public static void main(String[] args) {
		int num=13;
		boolean isPrime=false;
		
		for(int i=1;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				isPrime=true;
				break;
			}
			
			
		}
		if(isPrime) {
			System.out.println(num + " is a Prime number");
		}
		else {
			System.out.println(num + " is not a prime number");
		}
		
	}

}
