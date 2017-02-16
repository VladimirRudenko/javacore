package VladimirRudenko.app.classwork.lesson9;

/**
 * Created by vladimir on 16.02.17.
 */
public class Palindrome {
    public static void main(String[] args) {

        String palindrome = "mфрm";
        boolean isPalindrome = true;
        for (int i = 0; i < palindrome.length() / 2; i++) {

            isPalindrome = isPalindrome && (palindrome.charAt(i) == palindrome.charAt (palindrome.length() - i - 1));
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
