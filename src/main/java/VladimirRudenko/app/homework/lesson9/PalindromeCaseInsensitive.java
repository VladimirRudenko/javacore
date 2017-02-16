package VladimirRudenko.app.homework.lesson9;

import java.util.Scanner;

/**
 * Created by vladimir on 16.02.17.
 */
public class PalindromeCaseInsensitive {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

            System.out.println("Input a word");

        String str = scanner.nextLine();
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--)
        reverse += str.charAt(i);

        if (reverse.equalsIgnoreCase(str))
            System.out.println("Palindrome");
         else
            System.out.println("Not palindrome");
    }
}
