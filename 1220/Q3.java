import java.util.Scanner;

public class Q3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("A�� �Է��Ͻʽÿ�");
		int a = sc.nextInt();
		System.out.println("B�� �Է��Ͻʽÿ�");
		int b = sc.nextInt();
		
		System.out.println(a * (b%10));
		System.out.println(a * ((b%100)/10));
		System.out.println(a * (b/100));
		System.out.println(a * b);
		
	}
}