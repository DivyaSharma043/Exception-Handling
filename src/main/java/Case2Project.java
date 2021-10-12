//Rectify and continue when an exception occurs
import java.io.*;

public class Case2Project {
    public static void main(String[] args) throws NumberFormatException
    {
        int num;
        while(true)
        {
        try
        {
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           
            System.out.println("Enter a number: ");
            num = Integer.parseInt(br.readLine());
            break;
        }
        catch(IOException e)
        {
            System.out.println("Error in input");
        }
        catch (NumberFormatException e)
        {
            System.out.println("Incorrect Input");
        }
        }
        System.out.println("You entered: "+ num);
    }
}
