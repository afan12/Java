
/**
 * Read input from the user and write to a file userStrings.txt until "Done" is entered program
 * 
 * @Menglan Fan
 * @version 4
 */

import java.io.*;
import java.util.Scanner;

public class Fan_A04Q2
{
    public static void main(String[] args)throws IOException
    {
        FileWriter fw = new FileWriter("userStrings.txt"); //establish outfile userStrings.txt
        BufferedWriter bw = new BufferedWriter (fw);
        PrintWriter outFile = new PrintWriter(bw);
        Scanner scan = new Scanner(System.in);
        String buffer;
        final String SENTINEL = "DONE"; //final string
        
        do
        {
                buffer = scan.nextLine();
                if (!buffer.equals(SENTINEL)) //establish limits of the buffer
                        outFile.println(buffer);
        } while (!buffer.equals(SENTINEL)); //establish while limits
        
        scan.close();
        outFile.close();
    }
}
