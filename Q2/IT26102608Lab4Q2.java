import java.util.Scanner;

public class IT26102608Lab4Q2{
	
	public static void main(String[]args){
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Please enter exam marks (Out of 100): ");
		double examMarks= input.nextDouble();
		
		if (examMarks < 0 || examMarks > 100){
			System.out.println("Invalid input for exam marks. Terminating program.");
			return;
			}
			
		System.out.print("Please enter lab submission marks (Out of 100): ");
		double labMarks= input.nextDouble();
		
		if (labMarks < 0 || labMarks > 100){
			System.out.println("Invalid input for lab marks. Terminating program.");
			return;
			}
			
		System.out.print("Please enter the percentage given for the exam: ");
		double examPercentage= input.nextDouble();
		
		System.out.print("Please enter the percentage given for the lab submission: ");
		double labPercenatge= input.nextDouble();
		
		if (!(examPercentage+labPercenatge==100)){
			System.out.println("The percentages must add up to 100. Terminating program.");
			return;
			}
			
		double finalMark= ((examMarks+labMarks)*50/100);
		
		System.out.println("");
		System.out.print("Final Exam Mark is : " +finalMark);
		
	}
	
}