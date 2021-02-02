import java.util.Scanner;

public class ArithmeticOperator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int time = scanner.nextInt();
		int second = time % 60;
		int minute = (time / 60) % 60;
		int hour = (time / 60) / 60;
		
		System.out.println("Hour : " + hour);
		System.out.println("Minute : " + minute);
		System.out.println("Second : " + second);
		
		scanner.close();
	}
}