package VladimirRudenko.app.classwork.lesson10;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by vladimir on 16.02.17.
 */
public class FindWords {
    public static void main(String[] args) {
        System.out.println("Enter numbers");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String [] splittedStringArray = inputString.split(" ");
        int [] intArray = new int[splittedStringArray.length];

        for (int i =0; i< splittedStringArray.length; i++)
            intArray[i]= Integer.valueOf(splittedStringArray[i]);
        System.out.println(Arrays.toString(splittedStringArray));

    }
}
