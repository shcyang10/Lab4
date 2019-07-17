import java.util.Scanner;

public class Lab4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char userChar;
		int userInput = 0;
		userChar = 'y';
	
		
			while (userChar == 'y') {
				System.out.printf("Please enter a number:  \n");
				userInput = scan.nextInt();
				System.out.printf("%-10s  %-12s  %-15s\n", "Number", "Squared", "Cubed");
				System.out.printf("%-10s  %-12s  %-15s\n", "=======", "=======", "=======");
				for (int i = 1; i <= userInput; i++) {
					System.out.printf("%-10s  %-12s  %-15s\n", (i), (i * i), (i * i * i));
				}
				System.out.println("Do you want to continue? (y/n)");
				userChar = scan.next().charAt(0);
			}
			System.out.println("Come again!");
		scan.close();
	}
	
//	public static int firstNum (int num) {
//		return num * 1;
//	}
//	
//	public static int secondNum (int num2) {
//		return num2 * num2;
//	}
//	public static int thirdNum (int num3) {
//		return num3 * num3 * num3;
//	}

}

