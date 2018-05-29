
/**
 * This program reads the lengths of the sides of the triangle and prints out the area. 
 * 
 * @Menglan Fan
 * @version 1
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Fan_A02Q2
{
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        DecimalFormat accuracy = new DecimalFormat("0.000"); //set decimal accuracy to three decimal places
        double s, a, b, c, area; //sum formula for the triangle
        
        System.out.print("What is s?"); //establish the inquiry for s
        s = scan.nextDouble();
        System.out.print("What is a?"); //establish the inquiry for a
        a = scan.nextDouble();
        System.out.print("What is b?"); //establish the inquiry for b
        b = scan.nextDouble();
        System.out.print("What is c?"); //establish the inquiry for c
        c = scan.nextDouble();
        
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        
        System.out.println("The area is" + area + ".");
    }
}