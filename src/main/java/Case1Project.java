import java.io.*;

public class Case1Project {
    public static void main(String[] args) throws NumberFormatException
    {
        int num;
        try
        {
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           
            System.out.println("Enter a number: ");
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
        catch(IOException e)
        {
            System.out.println("Error in input");
        }
    }
}
