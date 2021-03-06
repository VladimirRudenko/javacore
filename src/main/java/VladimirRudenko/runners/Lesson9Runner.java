package VladimirRudenko.runners;

import VladimirRudenko.app.homework.lesson9.Palindrom;
import java.util.InputMismatchException;

import java.util.Scanner;
import VladimirRudenko.app.homework.lesson9.EnumMenu;

/**
 * Created by vladimir on 20.02.17.
 */
public class Lesson9Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        menu(scanner);
        choose(scanner);
    }

    private static void menu(Scanner scanner) {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder
                .append("\nHi! Here is an app that can verify if entered word is palindrome!")
                .append("\nType some word and press Enter in the end.")
                .append("\n\nBut if you want to quit you should type \"exit\" and press Enter"));
        String userInput = scanner.nextLine();
        if (userInput.equals("exit")) {
            System.exit(0);
        }
    }

    private static void choose(Scanner scanner) {
        Palindrom palindrome = new Palindrom();
        System.out.println("Now choose one of the 5 methods to verify.");
        try {
            String userInput = scanner.nextLine();
            int userChoice = scanner.nextInt();
            switch (userChoice) {
                case 1:
                    System.out.println(palindrome.palindromeCharAtMethod(userInput));
                    break;
                case 2:
                    char[] charArray = userInput.toCharArray();
                    System.out.println(palindrome.palindromeToLowerCaseMethod(charArray));
                    break;
                case 3:
                    System.out.println(palindrome.palindromeReverseMethod(userInput));
                    break;
                case 4:
                    System.out.println(palindrome.palindromeEqualsIgnoreMethod(userInput));
                    break;
                case 5:
                    System.out.println(palindrome.palindromeReverseCharAtMethod(userInput));
                    break;
                default:
                    System.out.println("Wrong input. Try number from 1 to 5!");
            }
            menu(scanner);
            choose(scanner);
        } catch (InputMismatchException e) {
            System.out.println("Only numbers required! Try again.");
            choose(scanner);
        }
    }
}
