import java.util.Scanner;

public class input
{
public static void main (String args[])
{
    try (Scanner scanner = new Scanner(System.in)) 
    {
        String name=scanner.nextLine();
        
        System.out.println("your name is "+name);
    }

}
}