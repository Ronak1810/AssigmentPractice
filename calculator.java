import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
		int n1 = sc.nextInt();
		
		System.out.print("Enter the Second number : ");
		int n2 = sc.nextInt();
		
		System.out.print("Enter the operator you want to perform(+,-,*,/) : ");
		char operator = sc.next().charAt(0);
		
		switch(operator) {
			case '+' :
				System.out.println(n1 + "+" + n2 + "=" + (n1+n2));
				break;
			case '-' :
				System.out.println(n1 + "-" + n2 + "=" + (n1-n2));
				break;
			case '*' :
				System.out.println(n1 + "*" + n2 + "=" + (n1*n2));
				break;
			case '/' :
				//int d=n1/n2;
				//System.out.println(d);
				try {
					int d=n1/n2;
					double s1=12,s2=0;
					double s=s1/s2;
					System.out.println(s);
					//System.out.println(d);	
				}
				catch(Exception e){
					System.out.println(e);
				}
				
				break;
			default :
				System.out.println(" Please enter valid operator");
				break;
		}
	}
}