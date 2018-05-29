
/**
 * This program prompts the user and plays the Hi-Lo guessing game.
 * 
 * @ Athena Fan
 * @Version 1
 */
import java.util.Scanner;
import java.util.Random;

public class Fan_A02Q5
{
    
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        Random random = new Random ();
        
        int target; 
        int guess;
        int guessCount;
        String query;
        
        do
        {
            target = random.nextInt(100)+1;; // target is random
            guessCount = 5; //limit guess to 5 counts
            
            do
            {
                System.out.print("What number do you guess?"); //prompt the user to enter the number
                guess = scan.nextInt();
                guessCount++;
                
                if(guess > target)
                    System.out.println("That's too high."); //tell the user the number is too high
                if(guess < target)
                    System.out.println("That's too low."); //tell the user the number is too low
            } while (guess !=0 && guess !=target);
            
                if (guess == target)
                    System.out.println("That's correct! You made" + guessCount + "guesses.");
                else
                    System.out.println("Quitting game.");
        
                    System.out.println("Would you like to play again?");
                    query = scan.next();
                    
            } while(query.toLowerCase().equals("y"));
             
           
    }
}
