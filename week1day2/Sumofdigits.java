package week1day2;

public class Sumofdigits {

	public static void main(String[] args) {
		int s=2345;
		int rem=0;
		int sum=0;
		while (s>0) {
			rem=s%10;
		sum =sum+rem;
			s=s/10;
		}
		System.out.println("The result is");
		
		System.out.println(sum);

	}

}
