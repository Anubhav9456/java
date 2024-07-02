import java.util.Scanner;

public class exception
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
        }  
        catch(Exception e)
        {
            System.out.println("error encountered");
        }
    
    }

}
}