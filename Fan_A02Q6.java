
/**
 * This program is a star compiling program.
 * 
 * @ Menglan Fan
 * @ Version 5
 */
import java.util.Scanner;

public class Fan_A02Q6
{
    public static void main(String[] args)
    {
        final int max_row = 5; // set row maximum at 5 
        
        for (int row = 0; row < max_row; row ++)
        {
            for (int space = 1; space < max_row - row; space ++)
                System.out.print(" "); // nested loops for print
                
            for (int star = 0; star < row*2+1; star ++)
                System.out.print("*");// nested loops for print
                System.out.println(); 
        }
         for (int row = max_row-1; row >= 0; row --) //set the premise for the row
            {
            for (int space = 1; space < max_row - row; space ++)
                System.out.print(" ");  // nested loops for print
                
            for (int star = 0; star < row*2+1; star ++)
                System.out.print("*"); // nested loops for print
                System.out.println();
    
         } 
    }
}
    
           