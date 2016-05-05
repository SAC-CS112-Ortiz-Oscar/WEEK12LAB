// Week 12 - Main

import java.util.Scanner;

public class Main 
{
	private static Scanner input;
	
	public static void main(String[] args) 
	{
		input = new Scanner( System.in );
		
		boolean running = true;

		ThreeDice newDiceThrow = new ThreeDice();
		
		while(running)
		{
			
			double diceRollAverage = newDiceThrow.Throw();
			System.out.printf("The average is %.2f", diceRollAverage);
			
			System.out.print("\n\nPress 1 to try again or any other number to exit... ");
			int again = input.nextInt();
			
			if(again != 1) 
			{
				break;
			}
			else continue;
		}
	}
}
