import java.io.*;

public class FinalBlockProject {
    public static void main(String[] args)
    {
        FileWriter fw = null;
        try
        {
            fw = new FileWriter("a.txt");
            fw.write("Hello World\n");
        }
        catch(IOException e)
        {
            System.out.println("Encountered IO Error");
        }
       finally
        {
            try
            {
                if(fw !=null)
                    fw.close();
            }
            catch(IOException e)
            {
                System.out.println("Error in input");
            }
        }
    }
}
