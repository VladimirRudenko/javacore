package VladimirRudenko.app.classwork.Lesson6;

/**
 * Created by vladimir on 02.02.17.
 */
public class Even {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++)
            if (i % 2 == 0) {
                System.out.println("  "+i);
                System.out.print(i);
            }
    }
}
