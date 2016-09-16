/****************************************************************************
	 *
	 * Created by: Chris Karpinski
	 * Created on: Sept 2016
	 * This program rolls a die and asks the user to guess the die value
	 *
	 ****************************************************************************/

    import java.util.Random;
	import java.util.Scanner;
	
public class DiceRoll {
	
	public static void main(String[] args) {
		
		int diceFaces;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of faces of the die");
		diceFaces = scan.nextInt();
		ReturnRand(diceFaces);
		
	}
	
	public static void ReturnRand (int maxValue) {
		
		 Random generator = new Random();
		 int randomNumber = generator.nextInt(maxValue - 1) + 1;
		 System.out.println("The dice has " + maxValue + " sides, and the "
		 		+ "random number is: " + randomNumber );
		 
	}

}
