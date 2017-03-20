package VladimirRudenko.app.classwork.lesson10;

/**
 * Created by vladimir on 16.02.17.
 */
public class CurrentTime {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        String c = "start";
        String b = "finish";
        StringBuilder stringBuilder = new StringBuilder(c);

        for (long i = 0; i < 100000L; i++)
        {
            stringBuilder = stringBuilder.append(b).append('c');
        }

        long finish = System.currentTimeMillis();

        System.out.println(finish - start);
    }
}
