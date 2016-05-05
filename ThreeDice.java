// Week 12 - ThreeDice
public class ThreeDice 
{
	public double Throw()
	{
		Dice D1 = new Dice();
		int diceOne = D1.throwDice(1);
		
		Dice D2 = new Dice();
		int diceTwo = D2.throwDice(1);
		
		Dice D3 = new Dice();
		int diceThree = D3.throwDice(1);
		
		double average = getAverage(diceOne, diceTwo, diceThree);
		
		return average;
	}
	
	private double getAverage(int one, int two, int three)
	{
		double sum = one + two + three;
		return ( sum / 3.00 );
	}
}
