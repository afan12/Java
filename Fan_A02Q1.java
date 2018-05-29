
/**
 * The program is used to compute and display the distance between the two points. 
 * 
 * @author Menglan Fan 
 * @version 1
 */
import java.util.Scanner;

public class Fan_A02Q1
{
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        double x1, y1, x2, y2, distance; //display any decimal
        
        System.out.print("What is x1?"); //establish the inquiry for x1
        x1 = scan.nextDouble();
        System.out.print("What is y1?"); //establish the inquiry for y1
        y1 = scan.nextDouble();
        System.out.print("What is x2?"); //establish the inquiry for x2
        x2 = scan.nextDouble();
        System.out.print("What is y2?"); //establish the inquiry for y2
        y2 = scan.nextDouble();
        
        distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1,2));
        
        System.out.println("The distance is" + distance + ".");    
    }
}
