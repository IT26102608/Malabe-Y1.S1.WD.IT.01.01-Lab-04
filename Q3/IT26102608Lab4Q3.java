import java.util.Scanner;

public class IT26102608Lab4Q3{

    public static void main(String[]args) {
		
		int number;
		
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextInt();
		
		String message = (number == 0) ? "Zero" : (number < 0) ? "Negative" : "Positive";
		
		System.out.print("The number is: " + message);
        
    }
}