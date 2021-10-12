
class Customer
{
    private String name;
    private int accno;
    private int balance;


public Customer(String n, int a, int b)
{
    name = n;
    accno = a;
    balance = b;
}

public void withdraw(int amt)throws BankException
{
    if(balance - amt <=500)
    {
        throw new BankException(accno , balance);
        
    }
    balance -=amt;
    
}
}

class BankException extends Exception
{
    private int acc;
    private int bal;
    
    public BankException(int a, int b)
    {
        this.acc = a;
        this.bal = b;
    }
    
    public void inform()
    {
        System.out.println("Acc no." + acc);
        System.out.println("Balance: "+ bal);
    }
}

public class UserDefinedProject {
    public static void main(String[] args)
    {
        try
        {
            Customer c = new Customer("Divya", 12345612, 900);
            c.withdraw(450);
        }
        catch(BankException e)
        {
            System.out.println("Transaction failed");
            e.inform();
        }
        finally
        {
            
                System.out.println("Transaction Statement");
            
        }
    }
}
