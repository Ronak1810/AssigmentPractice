import java.util.Scanner;

public class SwapTemp{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int temp;		

		System.out.print("Enter First Number : ");
		int a = sc.nextInt();
		
		System.out.print("Enter Second Number : ");
		int b = sc.nextInt();
		System.out.print("Before swapping -- "+a  +" : "+ b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.print("\n After swapping -- "+a  +" : "+ b);
	}
}