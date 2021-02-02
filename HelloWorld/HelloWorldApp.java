import java.util.Scanner;

public class HelloWorldApp {
	 /**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 System.out.println("Enter name, city, age, weight, marriage.");
		 Scanner scanner = new Scanner(System.in);
		 
		 String name = scanner.next();
		 System.out.print("Name : " + name + ", ");
		 
		 String city = scanner.next();
		 System.out.print("City : " + city + ", ");
		 
		 int age = scanner.nextInt();
		 System.out.print("Age : " + age + "»ì, ");
		 
		 double weight = scanner.nextDouble();
		 System.out.print("Weight : " + weight + "kg, ");
		 
		 boolean marriage = scanner.nextBoolean();
		 System.out.println("Marriage : " + marriage);
	 }
 }