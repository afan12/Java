
/**
 * This is a program that computes and displays the result of rolling several 6-sided dice 
 * and adding a number to the sum of the result of those dice.
 * 
 * @ Athena Fan 
 * @ Version 4
 */
import java.util.Scanner;
import java.util.Random;

public class Fan_A02Q3
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        Random random = new Random ();
        int dice, addition, result = 0; 
        
        System.out.print("How many dice would you like to roll?"); //prompt the user to enter the number of dice
        dice = scan.nextInt();
        
        System.out.print("What should be added to the result?"); // prompt the user to enter the additional number
        addition = scan.nextInt();
        
        for(int i=0; i < dice; i++)
            result += random.nextInt(6)+1;
        
        result += addition;
        
        System.out.println("The result of rolling" + dice + "D6+" + addition + "is" + result + ".");
    }
}
