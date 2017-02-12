package VladimirRudenko.app.homework.homework3;

/**
 * Created by vladimir on 30.01.17.
 */

public class Calculator {

    public double add(double y, double x) {return x + y;}
    public double deduct(double y, double t) {return  y - t;}
    public double mult(double x, double y) {return x * y;}
    public double del(double x, double y) {return x / y;}
    public double sqrt(double f) {return f *f;}
    public double pow (double x, double y) {return Math.pow(x, y);}
    public double rint (double a) {return Math.rint(a);}

    public double sin(double a) {return  Math.sin(a);}
    public double abs (double a) {return Math.abs(a);}
    public float copySign (float a, float b) {return Math.copySign(a,b);}

    public int increment (int a) {return ++a;}
    public double decrement (double a) {return --a;}
    public double max (double a, double b) {return Math.max(a,b);}

}
