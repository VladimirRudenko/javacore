package VladimirRudenko.app.classwork.lesson10;

/**
 * Created by vladimir on 16.02.17.
 */
public class ConvertCharToString {
    public static void main(String[] args) {

        char[] charArray = {'f', 's', 'b', 'e'};
        StringBuilder builder = new StringBuilder();
        for (char value : charArray) {

            builder.append(value);
            {
                System.out.println(builder.toString());
            }

        }
    }
}