import java.io.IOException;
import java.util.Scanner;

public class myfile{
    public static void main(String args[])throws IOException
    {
       // File myFile= new File("myfile.txt");
        //myFile.createNewFile();


       // FileWriter fileWriter=new FileWriter("myfile.txt");
       // fileWriter.write("hi hello dirty fellow");
       //fileWriter.close();

       File myFile = new File("myfile.txt");
        try (Scanner sc = new Scanner(myFile))
         {
            while(sc.hasNextLine())
            {
                String line=sc.nextLine();
                System.out.println("line");
            }}





    }
}


