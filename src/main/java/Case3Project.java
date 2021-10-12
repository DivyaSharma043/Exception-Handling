//Exit gracefuly when an exception occurs
import java.io.*;
public class Case3Project {
    public static void main(String[] args) throws NumberFormatException
    {
        int num;
        try
        {
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           
            System.out.println("Enter a number: ");
            num = Integer.parseInt(br.readLine());
            System.out.println("You entered: "+ num);
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
        
    }

