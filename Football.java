import java.util.Scanner;
import java.util.Random;

public class Football{
	public static void main(String[] args){
		
		int number;
		number = 1;
		
		System.out.print("\nThis program tells students whether or not there are Football tickets still available.\n");

		Scanner stdIn;
        stdIn = new Scanner(System.in);

		System.out.print("\nYes = 1\n\n");
		System.out.print("No = 2\n");

		System.out.print("\n\nWould you like a ticket to the game? : \n\n");
		number = stdIn.nextInt();
		if (number == 1) {
			Random rand = new Random();
			int value = rand.nextInt(50) + 1; 
			System.out.print("\nAwesome! You better get to the ticket booth fast! There are only " + value + " tickets left!\n\n");
			System.out.print("\nThank you for using this program, I hope you get there in time!\n\n");
			
			//if the input is equal to 1, keep going with the program
		}	else if(number != 1) {
			//if the input is not equal to 1, you have finished with the program
			System.out.print("Thank you for using this program anyway.");
			System.exit(0);
		}


	}
}
