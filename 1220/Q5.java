import java.util.Scanner;

public class Q5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("A�� �Է��Ͻʽÿ�");
		int a = sc.nextInt();
		System.out.println("B�� �Է��Ͻʽÿ�");
		int b = sc.nextInt();
		
		int min = (a < b) ?  a : b;
		int gcd = 0;
		for(int i = 1 ; i<=min ; i++) {
			if(a % i==0 && b % i==0) {
				gcd = i;
			}
		}
		
		System.out.println("�ִ����� : " + gcd );
		System.out.println("�ּҰ���� : " + (a*b) / gcd);
		
	}
}