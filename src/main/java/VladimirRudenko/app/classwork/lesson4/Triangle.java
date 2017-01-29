package VladimirRudenko.app.classwork.lesson4;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

import static java.util.Scanner.*;

/**
 * Created by vladimir on 26.01.17.
 */
public class Triangle {
    public static void main(String args[]){
        System.out.println("Ввести сторону a");
        Scanner scanner = new Scanner(System.in);
        double a = Scanner.nextDouble();
        System.out.println("Ввести сторону b");
        Scanner scanner = new Scanner(System.in);
        double b = Scanner.nextDouble();
        System.out.println("Ввести сторону c");
        Scanner scanner = new Scanner(System.in);
        double c = Scanner.nextDouble();

        if ((a * a == b*b + c*c)|| (c*c == a*a + b*b)|| (b*b == a*a + c*c))
        {
            System.out.println("right triangle");
        }
        else
        {
            System.out.println("not right triangle");
        }
    }
}
