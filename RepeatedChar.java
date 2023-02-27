import java.util.Scanner;

public class RepeatedChar{
	public static void main(String [] args){
		System.out.println("Enter any sentance : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		char ch[] = str.toCharArray();
		int count;
		for (int i = 0; i<ch.length-1; i++){
			
			for (int j =i+1; j<ch.length; j++){
				if(ch[i]==ch[j]){
					
					System.out.print(ch[j]);
				}
			}
		}
	}
}