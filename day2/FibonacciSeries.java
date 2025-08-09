package week1.day2;

public class FibonacciSeries {
	public static void main(String[] args) {
		int series=8;
		int n1=0;
		int n2=1;
		
		System.out.println(n1);
		System.out.println(n2);
		
		for (int i=2;i<=8;i++) {
			int n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
			
		}
		
	}

}
