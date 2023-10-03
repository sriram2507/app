package simplefirstprogram;
import java.util.Scanner;
public class Input {
	public static void main(String[]args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter num 1");
		int num1 = obj.nextInt();
		
		System.out.println("enter num 2");
		int num2 = obj.nextInt();
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		
		
		
	}
}
