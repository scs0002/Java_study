import java.util.Scanner;

public class Q5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("A를 입력하십시오");
		int a = sc.nextInt();
		System.out.println("B를 입력하십시오");
		int b = sc.nextInt();
		
		int min = (a < b) ?  a : b;
		int gcd = 0;
		for(int i = 1 ; i<=min ; i++) {
			if(a % i==0 && b % i==0) {
				gcd = i;
			}
		}
		
		System.out.println("최대공약수 : " + gcd );
		System.out.println("최소공배수 : " + (a*b) / gcd);
		
	}
}