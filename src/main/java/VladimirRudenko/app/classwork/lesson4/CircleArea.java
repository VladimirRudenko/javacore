package VladimirRudenko.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by vladimir on 26.01.17.
 */
public class CircleArea {
    public static void calculate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус");

        double radius = scanner.nextDouble();
        double circleArea = Math.PI * radius * radius;


        System.out.println("Arey is "+ circleArea);
    }
}

