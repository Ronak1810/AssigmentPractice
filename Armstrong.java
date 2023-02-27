import java.util.Scanner;

public class Armstrong {
	public static void main(String []  args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any number : ");
		int number = sc.nextInt();
		int count = 0, a = 1, arm = 0, rem;
		int no1 = number;
		while(no1>0){
			no1 = no1/10;
			count++;
		}
		int no2 = number;
		while (no2>0){
			rem = no2 % 10;
			for (int i = 1; i<=count; i++){
				a = a * rem;
			}
			arm = arm + a;
			no2 = no2 / 10;
		}
		if(arm == number){
			System.out.println("Number is Armstrong");
		}
		else{
			System.out.println("Number is not Armstrong");
		}
	}
}