
/**
 * This is a program that reads an integer value representing a year from the user to check if the year is a leap year.
 * 
 * @Menglan Fan
 * @version 3
 */
import java.util.Scanner;

public class Fan_A02Q4
{
    public static void main(String[] args){
        
        Scanner scan = new Scanner (System.in);
        int year;
        System.out.print("What year should be checked?"); //prompt the user for the question
        year = scan.nextInt();
        
        if(year < 1582)
        {
            System.out.print("Please enter only a year after 1581."); 
            
        }
        else
        {
            if((year % 4 == 0 && year % 100!= 0) || year % 400 == 0) //formula for calculating if the year is a leap year
                System.out.println("That is a leap year.");
            else
                System.out.println("That is not a leap year."); 
                
        }
    }
}
