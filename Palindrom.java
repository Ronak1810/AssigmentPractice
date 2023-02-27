import java.util.Scanner;

public class Palindrom{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int no = sc.nextInt();

		int rem = 0,a,rev;
		rev = no;

		while(no>0){
		a = no % 10;
		rem = rem*10 + a;
		no = no / 10; 
		}
		if(rev == rem){
			System.out.print("Number is Palindrom");
		} 
		else{
			System.out.print("Number is Palindrom");
		} 
	}
}		
		
		