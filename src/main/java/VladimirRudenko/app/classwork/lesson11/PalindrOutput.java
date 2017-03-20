package VladimirRudenko.app.classwork.lesson11;

import javax.sound.sampled.Line;
import java.io.*;


 //* Created by vladimir on 20.02.17.


public class PalindrOutput {
    public static void main(String[] args)  {
        String line = "";
        String reverse = "";
                try{
            BufferedReader reader = new BufferedReader(new FileReader("/home/vladimir/file.txt"));
            

            line = reader.readLine();
           /* {
                System.out.println(line);
            }*/
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Regardless about exception you will see this text");
        }
       // String reverse = "";
        
        for (int i = line.length() - 1; i >= 0; i--)
            reverse += line.charAt(i);

        if (reverse.equalsIgnoreCase(line)) {
            BufferedWriter writer = null;
            try {
                writer = new BufferedWriter(
    
                        new OutputStreamWriter(
    
                                new FileOutputStream("/home/vladimir/new.txt")));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            try {
                writer.append(line);
                writer.newLine();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
         
        }else
            System.out.println("Not palindrome");
    }
}
