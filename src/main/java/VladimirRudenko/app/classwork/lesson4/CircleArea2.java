package VladimirRudenko.app.classwork.lesson4;

import java.util.Scanner;


/**
 * Created by vladimir on 26.01.17.
 */
public class CircleArea2 {
    public static final double PI = 3.14d;

    public static void calculateBigger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус1");
        double radius1 = scanner.nextDouble();
        double area1 = PI * Math.pow(radius1, 2);
        System.out.println("Введите радиус 2");
        double radius2 = scanner.nextDouble();
        double area2 = PI * Math.pow(radius2, 2);

        if (area1 > area2)
            System.out.println("Area1 is bigger");
        else
            System.out.println("Area2 is bigger");
    }
}