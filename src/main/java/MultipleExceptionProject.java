import java.io.*;
public class MultipleExceptionProject {
    public static void main(String[] args) throws NumberFormatException
    {
        int i,j;
        try
        {
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           
            System.out.println("Enter i: ");
            i = Integer.parseInt(br.readLine());
            
            System.out.println("Enter j: ");
            j = Integer.parseInt(br.readLine());
            
            System.out.println("You Entered: " +i + " "+ j);
            System.out.println("Result: "+ i/j);
        }
        catch(IOException e)
        {
            System.out.println("Error in input");
        }
        catch (NumberFormatException e)
        {
            System.out.println("Incorrect Input");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic Exception, div by 0");
        }
        catch (RuntimeException e)
        {
            System.out.println("runtime Exception");
        }
        catch (Exception e)
        {
            System.out.println("Unknown Error: " + e);
        }
        }
}
