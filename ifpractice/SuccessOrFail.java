import java.util.Scanner;

public class SuccessOrFail{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter score : ");
		int score = scanner.nextInt();
		if ( score >= 80)
			System.out.println("Pass!");
		
		else
			System.out.println("Fail.");
		
		scanner.close();
	
	}
}