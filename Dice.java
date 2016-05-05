// Week 12 - Dice

public class Dice 
{
	int size = 20;
	int logicalSize = 0;
	private int upperBound;
	private int numberOfThrows;
	int index;
	private int history[] = new int[size];
	
	Dice()
	{
		upperBound = 6;
		numberOfThrows = 0;
		index = 0;
		
	}
	
	public int throwDice(int dices)
	{
		int diceRoll;
		
		numberOfThrows++;
		
		upperBound = 6 * dices;
		
		diceRoll =  + rollDice(1,upperBound);
		
		setHistory(history, index, diceRoll);
		
		index++;
		logicalSize++;
		
		return diceRoll;
	}
	
	public int throwDice(int dices, int bounces)
	{
		int diceRoll;
		
		numberOfThrows++;
		
		upperBound = 6 * dices;
		
		diceRoll =+ (bounces * rollDice(1,upperBound));
		
		setHistory(history, index, diceRoll);
		
		index++;
		logicalSize++;
		
		return diceRoll;
	}
	
	public void printNumberOfThrows()
	{
		String number = Integer.toString(numberOfThrows);
		System.out.print("Total # of throws: " + number + "\n");
	}
	public void printHistory()
	{
		System.out.println("Dice roll history:");
		for(int printIndex = 0; printIndex < logicalSize; printIndex++)
		{
			String number = Integer.toString(history[printIndex]);
			System.out.print(number + "\n");
		}
	}
	
	private int rollDice(int lowerBound, int upperBound)
	{
		return lowerBound + (int)(Math.random() * upperBound);
	}
	
	private void setHistory(int history[], int index, int diceRoll)
	{
		history[index] = diceRoll;
	}
}
