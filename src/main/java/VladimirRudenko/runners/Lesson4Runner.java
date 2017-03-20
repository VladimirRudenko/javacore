package VladimirRudenko.runners;


import VladimirRudenko.app.classwork.lesson4.CircleArea;
import VladimirRudenko.app.classwork.lesson4.CircleArea2;
import VladimirRudenko.app.classwork.lesson4.TaskNumber;
import VladimirRudenko.app.classwork.lesson4.Triangle;
import com.sun.javafx.tk.*;
import com.sun.javafx.tk.Toolkit;
import jdk.internal.util.xml.impl.Input;

import java.awt.*;
import java.util.Scanner;

import static VladimirRudenko.app.classwork.lesson4.Triangle.*;



public class   Lesson4Runner {
    static int i;

    public static void main(String args[]) {


        do {

            System.out.println("Input any functional \n1- Check if Triangle is rightangle \n"+
            "2- Check redius \n3- Check bigger redius");
            Scanner scanner = new Scanner(System.in);
           String input = scanner.next();
            TaskNumber task = TaskNumber.valueOf(input);
            switch (task) {
                case ONE:
                    Triangle.calculateIfTriangeRightAngle();
                    break;

                case TWO:
                    CircleArea.calculate();
                    break;

                case THREE:
                    CircleArea2.calculateBigger();
                    break;
            }
        }
        while (i != 0);
    }

    }
