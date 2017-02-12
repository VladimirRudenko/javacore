package VladimirRudenko.runners;


import VladimirRudenko.app.classwork.lesson4.CircleArea;
import VladimirRudenko.app.classwork.lesson4.CircleArea2;
import VladimirRudenko.app.classwork.lesson4.Triangle;

import java.awt.*;
import java.util.Scanner;

import static VladimirRudenko.app.classwork.lesson4.Triangle.*;



public class Lesson4Runner {
    static int i;

    public static void main(String args[]) {
        do {
            System.out.println("Input any functional \n1- Check if Triangle is rightangle \n"+
            "2- Check redius \n3- Check bigger redius");
            Scanner scanner = new Scanner(System.in);
            i = scanner.nextInt();

            switch (i) {
                case 1:
                    Triangle.calculateIfTriangeRightAngle();
                    break;

                case 2:
                    CircleArea.calculate();
                    break;

                case 3:
                    CircleArea2.calculateBigger();
                    break;
            }
        }
        while (i != 0);
    }
}
