import java.util.Scanner;
public class Swap{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter First Number : ");
		int a = sc.nextInt();
		
		System.out.print("Enter Second Number : ");
		int b = sc.nextInt();
		System.out.print("Before swapping -- "+a  +" : "+ b);
		// with use of + and -
		//a = a+b;
		//b = a-b;
		//a = a-b;
	
		//with use of * and /
		
		a = a * b;
		b = a / b;
		a = a / b;	
		System.out.print("\n After swapping -- "+a  +" : "+ b);
	}
}
