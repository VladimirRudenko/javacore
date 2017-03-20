package VladimirRudenko.app.classwork.lesson10;

/**
 * Created by vladimir on 16.02.17.
 */
public class PalindromeReverse {
    public static void main(String[] args) {
        String palindrome = "moo";
        StringBuilder builder = new StringBuilder(palindrome);
        builder.reverse();

        if (palindrome.equals(builder.toString()))

            System.out.println("Palindrome");

        else

            System.out.println("Not palindrome");
    }
}
