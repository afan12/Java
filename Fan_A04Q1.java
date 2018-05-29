
/**
 * Average of five numbers program with exceptions.
 * 
 * @Menglan Fan
 * @version 3
 */
import java.util.Scanner;

public class Fan_A04Q1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int validNumbers = 0;
        double value, sum = 0.0; //set double value with sum being 0.0
        do
        {
            try
            {
                System.out.print("Please enter a number:"); // prompt the user to enter a number
                String line = scan.next(); //scan the next input
                value = Double.parseDouble(line); // using the double.parsedouble method
                sum += value;
                validNumbers++;
            }
            catch(NumberFormatException e) // add the exception
            {
                System.out.println("Please enter a valid number.");
            }
        } while(validNumbers < 5); // set the limit to while numbers are less than 5
        System.out.println("The average is" + sum/5 + "."); // average output 
 
    }
}
