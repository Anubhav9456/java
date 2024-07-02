// multiple try block

import java.util.Scanner;

public class exception2
{
public static void main (String args[])
{
    try (Scanner scanner = new Scanner(System.in)) 
    {      
        try
        {  int a= scanner.nextInt();
            System.out.println("a= "+a);

            int b=12/a;
            System.out.println("b= "+b);

            try
        {
            int c[] ={1,2};
            c[5]=100;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("error encountered array");
        }

        }  
        catch(ArithmeticException e)
        {
            System.out.println("error encountered");
        }
    
        catch(Exception e)
        {
            System.out.println("error encountered");
        }
    
    }

}
}