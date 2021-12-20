import java.util.Scanner;

public class Q3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("A를 입력하십시오");
		int a = sc.nextInt();
		System.out.println("B를 입력하십시오");
		int b = sc.nextInt();
		
		System.out.println(a * (b%10));
		System.out.println(a * ((b%100)/10));
		System.out.println(a * (b/100));
		System.out.println(a * b);
		
	}
}